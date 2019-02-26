package øving1_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentGroup {
    HashMap<Student, Integer> smap = new HashMap<>();

    public HashMap<Student, Integer> getSmap() {
        return smap;
    }
    
    public void addStudent(Student student, Integer grade) {
        if (grade <= 100 && grade >= 0) {
            smap.put(student, grade);
        }
    }
    
    public void listStudentsByGrade() {
        ArrayList<Map.Entry<Student, Integer>> list = new ArrayList<>(smap.entrySet());
        list.sort(Map.Entry.comparingByValue(new GradeComparator()));
        int grades = 0;
        String s = "";
        for (Map.Entry<Student, Integer> entry : list) {
            int grade = entry.getValue();
            grades += grade;
            s += entry.getKey() + ", grade: " + grade + "\n";
        }
        int averageGrade = grades / list.size();
        System.out.println(s + "\naverage grade: " + averageGrade);
    }
    
}
