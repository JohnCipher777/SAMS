package SystemDataManager;

import SystemAccounts.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author hunter
 */
public class AdminAcntGenerator {
    private static Administrator admin;
    private static String $Usnm;
    private static String $Pwd;
    private static boolean newAcntCrtd = false;
    
    public static void initAccount(String createdUsnm, String createdPass){
        $Usnm = createdUsnm;
        $Pwd = createdPass;
        /*Disabled the default account credentials
            - it means that once the new account created the default credentials
              is now remove, the user cannot used it anymore
        */
        newAcntCrtd = true;
        admin = new Administrator($Usnm, $Pwd);
    }   
    
    public static String getCreatedUsnm(){
        return $Usnm;
    }
    
    public static String getCreatedPwd(){
        return $Pwd;
    }
    
    public static boolean isCredentialsValid(String u, String p){
        /*
          Sanitizing the credentials
           - if the passed arguments in our parameters & the admin credential 
             fields is all blank it will return false
           - else it will analyze using the admin method if the credentials is valid
        */
        return ((u.isBlank() || p.isBlank()) || ($Usnm==null || $Pwd==null)) ? false : admin.isCredentialsValid(u, p);
    }
    
    public static boolean isCredentialsDef(String u, String p){
       /*
         If the new account successfully created it will return false
         else is will analyze if the inputted credentials matched the default crendentials
       */
        if(admin==null) {
            initDefaultAcnt();
        }
        //Ternary Operator
        return (u.isBlank() || p.isBlank() || newAcntCrtd) ? false : admin.isCredentialsDef(u, p);
    }
    public static void initDefaultAcnt(){
        admin = new Administrator();
    }
}
