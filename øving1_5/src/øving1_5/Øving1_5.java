package øving1_5;

import java.util.Map;

public class Øving1_5 {

    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup();
        Student s1 = new Student("jeg","jeg",22,235);
        Student s2 = new Student("2","jeg",22,23);
        Student s3 = new Student("3","jeg",444,52);
        Student s4 = new Student("4","jeg",14,31);
        
        studentGroup.addStudent(s1, 55);
        studentGroup.addStudent(s2, 22);
        studentGroup.addStudent(s3, 99);
        studentGroup.addStudent(s4, 88);
        
        for (Map.Entry<Student, Integer> entry: studentGroup.getSmap().entrySet()) {
            System.out.println(entry.getKey().toString() + " karakter: " + entry.getValue()+ "\n");
        }
        studentGroup.listStudentsByGrade();


    }
    
}
