/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonStudentExample;

/**
 *
 * @author JayaShankar Mangina
 */
public class Student extends Person{
    
    private String grade;
    private final static String STATUS = "GRADUATE";

    public Student(String grade, String name, String address, long phoneNumber, String email) {
        super(name, address, phoneNumber, email);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public static String getSTATUS() {
        return STATUS;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Inside the Class: Student"+" "+"\n"
                +"Name of the Student: "+super.getName()+"\n";
        //return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
