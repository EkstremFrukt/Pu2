
package oppgave4_5;

public class Student {
    private String name;
    private int studentID;
    private String schoolProgram;

    public Student(String name, int studentID, String schoolProgram) {
        this.name = name;
        this.studentID = studentID;
        this.schoolProgram = schoolProgram;
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getSchoolProgram() {
        return schoolProgram;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", studentID=" + studentID + ", schoolProgram=" + schoolProgram + '}';
    }
    
}
