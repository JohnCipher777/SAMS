/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SystemAccounts;

import SystemDataManager.AdminAcntGenerator;


/**
 *
 * @author hunter
 */
public class UserAccounts {
  private String $Usnm;
  private String $Pwd;
  private final String defUsnm  = "admin";
  private final String defPwd  = "admin337";
  
  public UserAccounts(String usnm,String pwd){
      this.$Usnm = usnm;
      this.$Pwd = pwd;
  }
  
  public String getUsername(){
      return this.$Usnm;
  }
  
  public String getPassword(){
      return this.$Pwd;
  }
  
  public boolean isCredentialsDef(String u, String p){
      return defUsnm.equals(u) && defPwd.equals(p);
  }
  
  public boolean isCredentialsValid(String inputtedUsnm, String inputtedPwd){
      //This will analyze the inputted credentials if the condition is false
    try{  
      return (($Usnm == null || $Pwd==null) && (AdminAcntGenerator.getCreatedUsnm()==null || AdminAcntGenerator.getCreatedPwd()==null)) ? false : ($Usnm.equals(inputtedUsnm) && $Pwd.equals(inputtedPwd));
    }catch(NullPointerException nfe){
        this.$Usnm = AdminAcntGenerator.getCreatedUsnm();
        this.$Pwd =  AdminAcntGenerator.getCreatedPwd();
        return ($Usnm.equals(inputtedUsnm) && $Pwd.equals(inputtedPwd));
    }
  }
}
