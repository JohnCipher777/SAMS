/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SystemAccounts;

import SystemData.StudentData;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author hunter
 */
public class Administrator extends UserAccounts{
    private static String typeOfEvent;
    private static LocalDate currentDate;
    
    public Administrator() {
       super(null, null); 
    }
    
    public Administrator(String usnm, String pwd) {
        super(usnm, pwd);        
    }
    
    public static String getTypeOfEvent(){
        return typeOfEvent;
    }
    
    public static StudentData getDataRecorder(String tOE, String course, String yrlvl, int ID){
        typeOfEvent = tOE;
        return StudentDataCreator.recordData(course, yrlvl, ID);
    }
    
    public static void setRecordedData(StudentData recordedData){
        StudentRecordedData.initRecordedData(recordedData);
    }
    
    public static ArrayList<StudentData> getDataRecorded(String course, String yrlvl){
        return StudentRecordedData.getRecordedData(course, yrlvl);
    }
    
    public static String getDateCreated(){
        currentDate = LocalDate.now();
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("MM/d/yyyy");
        return currentDate.format(formatDate);
    }
}
