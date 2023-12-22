/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SystemData;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

// The StudentData class implements the Comparable interface, indicating
// that instances of this class can be compared and ordered.
//
// Execution Flow:
// - When used in sorted collections or sorting algorithms, the compareTo
//   method defined in this class is invoked to determine the natural order.
// - The natural order is based on the comparison of StudentData objects'
//   names using the String compareTo method.
// - The class provides a way to define a default sorting behavior for
//   instances of StudentData in sorted data structures.
public class StudentData implements Comparable<StudentData>{
    private final String course;
    private final String name;
    private final int ID_Num;
    private final String yrlvl;
    private LocalDateTime currentDateTime;
    
    public StudentData(String c, String n, int id, String yrlvl){
        this.course = c;
        this.name = n;
        this.ID_Num = id;
        this.yrlvl = yrlvl;
    }
    
    //This method initialize the current time the student recorded
    public void setTimeRecorded(LocalDateTime time){
        currentDateTime = time;
    }
    
    public int getID(){
        return this.ID_Num;
    }
    
    public String getYrLvl(){
        return this.yrlvl;
    }
    
    public String getCourse(){
        return this.course;
    }
    
    public String[] getData(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mma");
        return new String[]{
            String.valueOf(currentDateTime.format(formatter)),
            String.valueOf(ID_Num),
            name,
            String.valueOf(yrlvl),
            course
        };
    }
    
    public String getName(){
        return name;
    }
    
    //To sort the studentdata object by name
    // Compares the current StudentData object with another based on their names.
    // Execution Flow:
    // 1. Uses the String compareTo method to compare the names.
    // 2. Returns a negative integer, zero, or a positive integer if this object
    //    is less than, equal to, or greater than the specified object.
    @Override
    public int compareTo(StudentData student){
        return this.name.compareTo(student.getName());
    }
    
    //To sanitize the list of studentdata to prevent duplication
    // Checks if two StudentData objects are equal based on their ID and name.
    // Execution Flow:
    // 1. Check if the objects are the same reference.
    // 2. Check if the object is null or belongs to a different class.
    // 3. Cast the object to StudentData.
    // 4. Compare ID_Num and name for equality.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        StudentData data = (StudentData) obj;
        return Objects.equals(ID_Num, data.getID()) &&
               Objects.equals(name, data.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(ID_Num, name);
    }
    
    //If u see this method below, it means that i forgot to delete it
    //I used it for debugging purposes
    @Override
    public String toString(){
        return "Name: "+this.name+"  "+
               "Course: "+this.course+"  "+
               "ID: "+String.valueOf(this.ID_Num)+"  "+
               "Yr level: "+this.yrlvl+" "+
               "Time created: "+String.valueOf(currentDateTime);
               
    }
}
