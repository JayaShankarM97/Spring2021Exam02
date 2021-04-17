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
public class PersonStudentDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Name: JayaShankar Mangina");
        System.out.println("The Solution for the Problem 5 is: ");
        System.out.println("");
        Person person = new Person("JayaShankar Mangina", "1121 N College Dr", 6605281305L, "jshankar6369@gmail.com");
        Student student = new Student("A", "JayaShankar Mangina", "1121 N College Dr", 6605281305L, "jayashankar2904@gmail.com");
        Employee employee = new Employee("Aramark", 800.00, "03-10-2021", "JayaShankar Mangina", "1121 N College Dr", 6605281305L, "S542044@nwmissouri.edu");
        Faculty faculty = new Faculty("8:00 A.M - 5:00 P.M", 3, "ColdenHall", 10000.00, "10-20-2013", "Ajay Bandi", "Horizons West", 1234567890L, "ajay@nwmissouri.edu");
        Staff staff = new Staff("CEO", "Apple", 10000000000.00, "12-10-1998", "Steve Jobs", "Apple Park", 12303405679L, "stevejobs@apple.com");
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
    
}
