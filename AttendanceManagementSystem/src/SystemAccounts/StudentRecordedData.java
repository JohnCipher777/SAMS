/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SystemAccounts;

import SystemData.StudentData;
import java.util.ArrayList;

/**
 *
 * @author hunter
 * @VisibilityModifier
 *   - I used default, to make this class 
 *     only accessible to this package file
 */
class StudentRecordedData {
    private static ArrayList<StudentData> BSCS = new ArrayList<>();
    private static ArrayList<StudentData> BSIT = new ArrayList<>();
    private static ArrayList<StudentData> BSCE = new ArrayList<>(); 
    
    /** 
     * @param recordedData
     *    - This parameter is used to store the instance values 
     *      of the recorded StudentData into the specified 
     *      list based on their courses.
     * 
    */
    static void initRecordedData(StudentData recordedData){
        switch(recordedData.getCourse()){
            case "BSCS" -> { 
                BSCS.add(recordedData);
            }
            case "BSIT" -> {
                BSIT.add(recordedData);
            }
            case "BSCE" -> {               
                BSCE.add(recordedData);
            }
        }
        /* These 3 assignment expressions below is used to assign the newly
           created sanitized lists obtained from the passed list values of the
           dataSanitizer() method                                            
        */
        BSCS = dataSanitizer(BSCS);
        BSIT = dataSanitizer(BSIT);
        BSCE = dataSanitizer(BSCE);
    }
    
    /**
     * 
     * @param course
     * @param yrlvl
     *    - parameters are used to get the specified List of StudentData objects
     * @return ArrayList of StudentData objects
     *    - returns the specified List of StudentData objects based on the given parameters  
     * @VisibilityModifier
     *    - I used default so that only the Administrator class can access this method
     */
    static ArrayList<StudentData> getRecordedData(String course, String yrlvl){
        /* Separated Initialization Of ArrayList Per Condition
        *    - its because, to create a new and independent ArrayList for each 
        *      course type and year level combination.
        */
        ArrayList<StudentData> tempStudentList_ByCourseYrLvl;
        /* This boolean variable is used as a condition in the ternary operator.
           If the student data of the specified year level is not found or not yet
           recorded, this method will return null. 
        */
        boolean isStudentFnd;
        if(!BSCS.isEmpty() || !BSIT.isEmpty() || !BSCE.isEmpty()){  
            isStudentFnd = false;
            switch (course) {
                case "BSCS" ->{
                    tempStudentList_ByCourseYrLvl = new ArrayList<>();
                    //Iterate through the BSCS list and filter by year level
                    for(StudentData list: BSCS){
                        if(list.getYrLvl().equals(yrlvl)){
                            tempStudentList_ByCourseYrLvl.add(list);
                            isStudentFnd = true;
                        }
                    }
                    //ternary operator, if BSCS lists is empty this method returns null to 
                    return (BSCS.isEmpty()) ? null : (isStudentFnd) ? tempStudentList_ByCourseYrLvl : null;
                }
                case "BSIT" ->{
                    tempStudentList_ByCourseYrLvl = new ArrayList<>();
                    //Iterate through the BSIT list and filter by year level
                    for(StudentData list: BSIT){
                        if(list.getYrLvl().equals(yrlvl)){
                            tempStudentList_ByCourseYrLvl.add(list);
                            isStudentFnd = true;
                        }
                    }
                    //ternary operator
                    return (BSIT.isEmpty()) ? null : (isStudentFnd) ? tempStudentList_ByCourseYrLvl : null;
                }
                case "BSCE" ->{
                    tempStudentList_ByCourseYrLvl = new ArrayList<>();
                    //Iterate through the BSCE list and filter by year level
                    for(StudentData list: BSCE){
                        if(list.getYrLvl().equals(yrlvl)){
                            tempStudentList_ByCourseYrLvl.add(list);
                            isStudentFnd = true;
                        }
                    }
                    //ternary operator
                    return (BSCE.isEmpty()) ? null : (isStudentFnd) ? tempStudentList_ByCourseYrLvl : null;
                }
            }
        }
        return null;
    }
    
    //Sanitize the given list of data, to prevent duplication
    private static ArrayList<StudentData> dataSanitizer(ArrayList<StudentData> unsanitizeList){
       // Creates a set to store sanitized StudentData objects
       ArrayList<StudentData> sanitizeList = new ArrayList<>();
       for (StudentData student : unsanitizeList) {
           if (!sanitizeList.contains(student)) { 
            sanitizeList.add(student);
           }
       }
       //Assign the sanitizedList to the prev datalist
       return sanitizeList;
    }
}
