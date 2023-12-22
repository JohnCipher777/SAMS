/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SystemController;

import SystemDataManager.AdminAcntGenerator;
import SystemGUI.CredentialFrame;
import SystemGUI.MainFrame;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.event.ActionListener;
import raven.toast.Notifications;

/**
 *
 * @author hunter
 */

public class MainController {
    public static void main(String[] args){
        //UI Theme from external Library(FlatLaf)   
        FlatMacDarkLaf.setup();
        CredentialFrame credentialFrame = new CredentialFrame();
        credentialFrame.setVisible(true);
        
        credentialFrame.getAccountCreationLabelFunction().addMouseListener(new java.awt.event.MouseAdapter(){
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt){
               //This will show the signup panel using tabbed pane
               credentialFrame.getCredentialPanels().setSelectedIndex(1);
               //clears the previously inputted value in the signup panel fields
               credentialFrame.getSignupUsnmTF().setText("");
               credentialFrame.getSignupPwdF().setText("");
              
               //Annonymous class
               credentialFrame.getSignUpBtnFunction().addActionListener(new ActionListener() {
                   @Override
                   public void actionPerformed(java.awt.event.ActionEvent perform) {
                       Notifications.getInstance().setJFrame(credentialFrame);
                       /* With [!] operator
                       - This means that the statements inside this condition will only executes if the required
                       fields are not empty
                       */
                       if(!isFieldsEmpty(credentialFrame)){
                           Notifications.getInstance().show(Notifications.Type.SUCCESS, "Account Created Successfully");
                           
                           String inputtedUsnm = credentialFrame.getSignupUsnmTF().getText();
                           String inputtedPass = String.valueOf(credentialFrame.getSignupPwdF().getPassword());
                           AdminAcntGenerator.initAccount(inputtedUsnm, inputtedPass);
                           //It will go back to the Login panel using tabbed pane
                           credentialFrame.getCredentialPanels().setSelectedIndex(0);
                       }
                       credentialFrame.getSignupUsnmTF().putClientProperty("JComponent.outline",(credentialFrame.getSignupUsnmTF().getText().isBlank()) ? "warning":"success");
                       credentialFrame.getSignupPwdF().putClientProperty("JComponent.outline",(String.valueOf(credentialFrame.getSignupPwdF().getPassword()).isBlank()) ? "warning":"success");
                   }

                   private boolean isFieldsEmpty(CredentialFrame credentialFrame) {
                       Notifications.getInstance().setJFrame(credentialFrame);
                       if(credentialFrame.getSignupUsnmTF().getText().isBlank() && String.valueOf(credentialFrame.getSignupPwdF().getPassword()).isBlank()){
                            Notifications.getInstance().show(Notifications.Type.WARNING, "Fields are empty");
                            return true;
                       }else{
                            if(credentialFrame.getSignupUsnmTF().getText().isBlank()){
                                Notifications.getInstance().show(Notifications.Type.WARNING, "Username field is empty");
                                return true;
                            }
                            if(String.valueOf(credentialFrame.getSignupPwdF().getPassword()).isBlank()){
                                Notifications.getInstance().show(Notifications.Type.WARNING, "Password field is empty");
                                return true;
                            }
                            return false; //if none of the above conditions executed
                        }
                   }
               });
            }
       });
       
        //Login Button Action Perform
         credentialFrame.getLoginBtnFunction().addActionListener((java.awt.event.ActionEvent evt) -> {
                Notifications.getInstance().setJFrame(credentialFrame);
                
                //Assigning temporarily the inputted credentials
                final String inputtedUsnm = credentialFrame.getLoginUsnmTF().getText();
                final String inputtedPwd =  String.valueOf(credentialFrame.getLoginPwdF().getPassword());
                
                MainFrame mainFrame = new MainFrame();
                
                if(AdminAcntGenerator.isCredentialsDef(inputtedUsnm, inputtedPwd)){
                    credentialFrame.dispose();
                    mainFrame.setVisible(true);
                    Notifications.getInstance().setJFrame(mainFrame);
                    Notifications.getInstance().show(Notifications.Type.SUCCESS, "Access Granted: Default Credentials"); 
                    Notifications.getInstance().show(Notifications.Type.SUCCESS, "Please create a new account"); 
                }else if(AdminAcntGenerator.isCredentialsValid(inputtedUsnm, inputtedPwd)){
                    credentialFrame.dispose();
                    mainFrame.setVisible(true);
                    Notifications.getInstance().setJFrame(mainFrame);
                    Notifications.getInstance().show(Notifications.Type.SUCCESS, "Access Granted");
                }else{
                    getWarningMsg(credentialFrame, inputtedUsnm, inputtedPwd);//PopUp a message, then below highlighted the blank field/s
                    //This will only popup if the credentials fields has an inputted value
                    if(!inputtedUsnm.isBlank() && !inputtedPwd.isBlank()) 
                     Notifications.getInstance().show(Notifications.Type.ERROR, "Enter a valid credentials"); 
                }
                
                //This statement below will higlights the empty field
                credentialFrame.getLoginUsnmTF().putClientProperty("JComponent.outline",(inputtedUsnm.isBlank() ? "warning":"success"));
                credentialFrame.getLoginPwdF().putClientProperty("JComponent.outline",(inputtedPwd.isBlank() ? "warning":"success"));
        });
    }
    
    /**
    *
    * @param logPanel
    *    - used for popup message, to get the specified location
    *      to where the popup message outputted
    *    - also used to get the LoginFrame methods using the class instance
    *    - method accessed are getInputtedUsername() & getInputtedPwd(), which came
    *      from LoginFrame class
     * @param usnm
     * @param pwd
     *   - used in the condition to get the specified popup warning message
     *   - using notification class, which is an external library
    */
    public static void getWarningMsg(CredentialFrame logPanel, String usnm, String pwd){
        Notifications.getInstance().setJFrame(logPanel);
        if(usnm.isBlank() && pwd.isBlank()){
            Notifications.getInstance().show(Notifications.Type.WARNING, "Fields are empty");
        }else{
            if(usnm.isBlank())
                Notifications.getInstance().show(Notifications.Type.WARNING, "Username field is empty");
            if(pwd.isBlank())
                Notifications.getInstance().show(Notifications.Type.WARNING, "Password field is empty");
        }
    }
}
