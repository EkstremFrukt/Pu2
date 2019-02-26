package oppgave4_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Oppgave4_5 {

    public static void main(String[] args) {
        Student fred = new Student("fred", 123456, "Undergraduate");
        Student hans = new Student("Hans", 654321, "sophomore");
        Student erik = new Student("Erik", 615243, "Bachelor");

        ArrayList<Student> students = new ArrayList<>();
        students.add(fred);
        students.add(hans);
        students.add(erik);
        
        System.out.println(students);
        Collections.sort(students, Comparator.comparing(Student::getName));
        System.out.println("--------------------------");
        System.out.println(students);
        
        Collections.sort(students, Comparator.comparing(Student::getStudentID));
        System.out.println("----------------------------");
        System.out.println(students);
    } 
}
