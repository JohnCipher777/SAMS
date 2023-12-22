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
 */
class StudentDataCreator {
    private static final ArrayList<StudentData> BSCS = new ArrayList<>();
    private static final ArrayList<StudentData> BSIT = new ArrayList<>();
    private static final ArrayList<StudentData> BSCE = new ArrayList<>();
    
    static StudentData recordData(String c,String yrlvl, int ID){
        StudentData tempDataHolder = null;
        //using the parameters of this method, we will iterate the list using loop,
        //then analyze if the given condition is true
        //Iterating the list of instances of StudentData using for each loop
        for(StudentData student : getStudentListData(c)){
            if(student.getYrLvl().equals(yrlvl) && student.getID()==ID){
                tempDataHolder = student;
                break;
            }
        }
        return tempDataHolder;
    }

    
    private static ArrayList<StudentData> getStudentListData(String c){
        /* 
            The ID numbering sequence is range to 100 students per 
            year level by course
            This methods below will generates student lists by course
            Also, i stop at 3rd year level per course because I'm tired 
            of copying & pasting the names of each students
        */
        getGeneratedBSCS_StudentsList();
        getGeneratedBSIT_StudentsList();
        getGeneratedBSCE_StudentsList();
       
       /* We used switch as assignment expression, 
          so that the assign value based on the given condition 
          will be used as a return value by this method
       */
       return switch (c) {
            case "BSCS" -> BSCS;
            case "BSIT" -> BSIT;
            case "BSCE" -> BSCE;
            default -> null;
        };
    }
    
    private static void getGeneratedBSCS_StudentsList() {
        //List of BSCS 1st Year Students, students
        BSCS.add(new StudentData("BSCS","Mary Grace Cosare",1001,"1st"));
        BSCS.add(new StudentData("BSCS","Angel Belleza",1002,"1st"));
        BSCS.add(new StudentData("BSCS","Rosemarie Buagas",1003,"1st"));
        BSCS.add(new StudentData("BSCS","Junelen Colaste",1004,"1st"));
        BSCS.add(new StudentData("BSCS","Christine Cosare",1005,"1st"));
        BSCS.add(new StudentData("BSCS","Shina Mae Jordan",1006,"1st"));
        BSCS.add(new StudentData("BSCS","Desiree Lusares",1007,"1st"));
        BSCS.add(new StudentData("BSCS","Keith Missy Obut",1008,"1st"));
        BSCS.add(new StudentData("BSCS","Nina Fe Mandreza",1009,"1st"));
        BSCS.add(new StudentData("BSCS","Domnina Jane Lamban",1010,"1st"));
        BSCS.add(new StudentData("BSCS","Winalyn Docdoc",1011,"1st"));
        BSCS.add(new StudentData("BSCS","Jhea Paredes",1012,"1st"));
        BSCS.add(new StudentData("BSCS","Kezia Plenos",1013,"1st"));
        
        //List of BSCS 2nd Year Students, 13students
        BSCS.add(new StudentData("BSCS","John Cipher",1101,"2nd"));
        BSCS.add(new StudentData("BSCS","Aliya Cipher",1102,"2nd"));
        BSCS.add(new StudentData("BSCS","Mike Cipher",1103,"2nd"));
        BSCS.add(new StudentData("BSCS","Jana Cipher",1104,"2nd"));
        BSCS.add(new StudentData("BSCS","Alexa Cipher",1105,"2nd"));
        BSCS.add(new StudentData("BSCS","Sarah Cipher",1106,"2nd"));
        BSCS.add(new StudentData("BSCS","Peter Cipher",1107,"2nd"));
        BSCS.add(new StudentData("BSCS","Kyla Cipher",1108,"2nd"));
        BSCS.add(new StudentData("BSCS","Tyler Cipher",1109,"2nd"));
        BSCS.add(new StudentData("BSCS","Jason Cipher",1110,"2nd"));
        BSCS.add(new StudentData("BSCS","Ryan Cipher",1111,"2nd"));
        BSCS.add(new StudentData("BSCS","Gerald Cipher",1112,"2nd"));
        BSCS.add(new StudentData("BSCS","Kezia Cipher",1113,"2nd"));
        
        //List of BSCS 3rd Year Students, 13students
        BSCS.add(new StudentData("BSCS","Eliza Mae",1201,"3rd"));
        BSCS.add(new StudentData("BSCS","Decelyn Asustilla",1202,"3rd"));
        BSCS.add(new StudentData("BSCS","Joan Balistoy",1203,"3rd"));
        BSCS.add(new StudentData("BSCS","Gritchel Bellezas",1204,"3rd"));
        BSCS.add(new StudentData("BSCS","Hylene Beruan",1205,"3rd"));
        BSCS.add(new StudentData("BSCS","Margie Mae Boligor",1206,"3rd"));
        BSCS.add(new StudentData("BSCS","Michaela Budiongan",1207,"3rd"));
        BSCS.add(new StudentData("BSCS","Jemeica Cabaneles",1208,"3rd"));
        BSCS.add(new StudentData("BSCS","Yvette Cabulao",1209,"3rd"));
        BSCS.add(new StudentData("BSCS","James Carl Cananea",1210,"3rd"));
        BSCS.add(new StudentData("BSCS","Shiela Mae Cortes",1211,"3rd"));
        BSCS.add(new StudentData("BSCS","Daisy Jane Dano",1212,"3rd"));
        BSCS.add(new StudentData("BSCS","Jovanie Dasmarinas",1213,"3rd"));
    }

    private static void getGeneratedBSIT_StudentsList() {
        //List of BSIT 1st Year Students, (13students)
        BSIT.add(new StudentData("BSIT","Emily Davis",2001,"1st"));
        BSIT.add(new StudentData("BSIT","Theodore Dinh",2002,"1st"));
        BSIT.add(new StudentData("BSIT","Luna Sanders",2003,"1st"));
        BSIT.add(new StudentData("BSIT","Penelope Jordan",2004,"1st"));
        BSIT.add(new StudentData("BSIT","Austin Vo",2005,"1st"));
        BSIT.add(new StudentData("BSIT","Joshua Gupta",2006,"1st"));
        BSIT.add(new StudentData("BSIT","Ruby Barnes",2007,"1st"));
        BSIT.add(new StudentData("BSIT","Luke Martin",2008,"1st"));
        BSIT.add(new StudentData("BSIT","Easton Bailey",2009,"1st"));
        BSIT.add(new StudentData("BSIT","Madeline Walker",2010,"1st"));
        BSIT.add(new StudentData("BSIT","Savannah Ali",2011,"1st"));
        BSIT.add(new StudentData("BSIT","Camila Rogers",2012,"1st"));
        BSIT.add(new StudentData("BSIT","Eli Jones",2013,"1st"));
        
        //List of BSIT 2nd Year Students, (13students)
        BSIT.add(new StudentData("BSIT","Everleigh Ng",2101,"2nd"));
        BSIT.add(new StudentData("BSIT","Robert Yang",2102,"2nd"));
        BSIT.add(new StudentData("BSIT","Isabella Xi",2103,"2nd"));
        BSIT.add(new StudentData("BSIT","Bella Powell",2104,"2nd"));
        BSIT.add(new StudentData("BSIT","Camila Silva",2105,"2nd"));
        BSIT.add(new StudentData("BSIT","David Barnes",2106,"2nd"));
        BSIT.add(new StudentData("BSIT","Adam Dang",2107,"2nd"));
        BSIT.add(new StudentData("BSIT","Elias Alvarado",2108,"2nd"));
        BSIT.add(new StudentData("BSIT","Eva Rivera",2109,"2nd"));
        BSIT.add(new StudentData("BSIT","Logan Rivera",2110,"2nd"));
        BSIT.add(new StudentData("BSIT","Leonardo Dixon",2111,"2nd"));
        BSIT.add(new StudentData("BSIT","Mateo Her",2112,"2nd"));
        BSIT.add(new StudentData("BSIT","Jose Henderson",2113,"2nd"));
        
        //List of BSIT 3rd Year Students, (13students)
        BSIT.add(new StudentData("BSIT","Abigail Mejia",2201,"3rd"));
        BSIT.add(new StudentData("BSIT","Wyatt Chin",2202,"3rd"));
        BSIT.add(new StudentData("BSIT","Carson Lu",2203,"3rd"));
        BSIT.add(new StudentData("BSIT","Dylan Choi",2204,"3rd"));
        BSIT.add(new StudentData("BSIT","Ezekiel Kumar",2205,"3rd"));
        BSIT.add(new StudentData("BSIT","Dominic Guzman",2206,"3rd"));
        BSIT.add(new StudentData("BSIT","Angel Powell",2207,"3rd"));
        BSIT.add(new StudentData("BSIT","Mateo Vu",2208,"3rd"));
        BSIT.add(new StudentData("BSIT","Caroline Jenkins",2209,"3rd"));
        BSIT.add(new StudentData("BSIT","Nora Brown",2210,"3rd"));
        BSIT.add(new StudentData("BSIT","Adeline Huang",2211,"3rd"));
        BSIT.add(new StudentData("BSIT","Jackson Perry",2212,"3rd"));
        BSIT.add(new StudentData("BSIT","Riley Padilla",2213,"3rd"));
    }
    
    private static void getGeneratedBSCE_StudentsList() {
        //List of BSCE 1st Year Students, (13students)
        BSCE.add(new StudentData("BSCE","Leah Pena",3001,"1st"));
        BSCE.add(new StudentData("BSCE","Owen Lam",3002,"1st"));
        BSCE.add(new StudentData("BSCE","Kennedy Foster",3003,"1st"));
        BSCE.add(new StudentData("BSCE","John Moore",3004,"1st"));
        BSCE.add(new StudentData("BSCE","William Vu",3005,"1st"));
        BSCE.add(new StudentData("BSCE","Sadie Washington",3006,"1st"));
        BSCE.add(new StudentData("BSCE","Gabriel Holmes",3007,"1st"));
        BSCE.add(new StudentData("BSCE","Wyatt Rojas",3008,"1st"));
        BSCE.add(new StudentData("BSCE","Eva Coleman",3009,"1st"));
        BSCE.add(new StudentData("BSCE","Dominic Clark",3010,"1st"));
        BSCE.add(new StudentData("BSCE","Lucy Alexander",3011,"1st"));
        BSCE.add(new StudentData("BSCE","Everleigh Washington",3012,"1st"));
        BSCE.add(new StudentData("BSCE","Leilani Butler",3013,"1st"));
        
        //List of BSCE 2nd Year Students, (13students)
        BSCE.add(new StudentData("BSCE","Peyton Huang",3101,"2nd"));
        BSCE.add(new StudentData("BSCE","John Contreras",3102,"2nd"));
        BSCE.add(new StudentData("BSCE","Rylee Yu",3103,"2nd"));
        BSCE.add(new StudentData("BSCE","Piper Lewis",3104,"2nd"));
        BSCE.add(new StudentData("BSCE","Stella Alexander",3105,"2nd"));
        BSCE.add(new StudentData("BSCE","Addison Do",3106,"2nd"));
        BSCE.add(new StudentData("BSCE","Zoey Jackson",3107,"2nd"));
        BSCE.add(new StudentData("BSCE","John Chow",3108,"2nd"));
        BSCE.add(new StudentData("BSCE","Ava Ayala",3109,"2nd"));
        BSCE.add(new StudentData("BSCE","Natalia Salazar",3110,"2nd"));
        BSCE.add(new StudentData("BSCE","Lucy Alexander",3111,"2nd"));
        BSCE.add(new StudentData("BSCE","Skylar Carrillo",3112,"2nd"));
        BSCE.add(new StudentData("BSCE","Christian Sanders",3113,"2nd"));
        
        //List of BSCE 3rd Year Students, (13students)
        BSCE.add(new StudentData("BSCE","Penelope Coleman",3201,"3rd"));
        BSCE.add(new StudentData("BSCE","Piper Richardson",3202,"3rd"));
        BSCE.add(new StudentData("BSCE","Everly Walker",3203,"3rd"));
        BSCE.add(new StudentData("BSCE","Aurora Ali",3204,"3rd"));
        BSCE.add(new StudentData("BSCE","Penelope Guerrero",3205,"3rd"));
        BSCE.add(new StudentData("BSCE","Anna Mehta",3206,"3rd"));
        BSCE.add(new StudentData("BSCE","William Foster",3207,"3rd"));
        BSCE.add(new StudentData("BSCE","Jade Rojas",3208,"3rd"));
        BSCE.add(new StudentData("BSCE","Isla Espinoza",3209,"3rd"));
        BSCE.add(new StudentData("BSCE","David Chu",3210,"3rd"));
        BSCE.add(new StudentData("BSCE","Thomas Padilla",3211,"3rd"));
        BSCE.add(new StudentData("BSCE","Miles Salazar",3212,"3rd"));
        BSCE.add(new StudentData("BSCE","Mila Hong",3213,"3rd"));
    }
}
