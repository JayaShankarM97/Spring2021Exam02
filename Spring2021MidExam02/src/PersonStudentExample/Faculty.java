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
public class Faculty extends Employee{
    private String officeHours;
    private int numberOfTeachingSubjects;

    public Faculty(String officeHours, int numberOfTeachingSubjects, String office, double salary, String dateHired, String name, String address, long phoneNumber, String email) {
        super(office, salary, dateHired, name, address, phoneNumber, email);
        this.officeHours = officeHours;
        this.numberOfTeachingSubjects = numberOfTeachingSubjects;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public int getNumberOfTeachingSubjects() {
        return numberOfTeachingSubjects;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public void setNumberOfTeachingSubjects(int numberOfTeachingSubjects) {
        this.numberOfTeachingSubjects = numberOfTeachingSubjects;
    }

    @Override
    public String toString() {
        return "Inside the Class: Faculty"+" "+"\n"
                +"Name of the Faculty: "+super.getName()+"\n"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
