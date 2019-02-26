package øving1_5;

public class Student {
    private String firstName;
    private String lastName;
    private int studentID;
    private int age;

    public Student(String firstName, String lastName, int studentID, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public int getAge() {
        return age;
    }
    
    @Override
    public boolean equals(Object obj) {
    // like referansevariabler betyr at objektene må være like
    if (this == obj) return true;

    // hvis obj ikke er av typen Student, så kan de ikke være like
    if(getClass() != obj.getClass())
        return false;

    // Vi kan nå sammenlikne student id'ene til de to studentene
    Student other = (Student) obj;
    return this.studentID == other.studentID;
    }
    
    @Override
    public int hashCode() {
    return 41*Integer.hashCode(studentID);
}

    @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName + ", lastName=" 
                + lastName + ", studentID=" + studentID + ", age=" + age + '}';
    }


    

    
}
