package chapter9.java;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String studentId;
    private String firstName;
    private String lastName;

    public Student(String studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getStudentId() {
        return studentId;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

}

class EngClass {
    private List<Student> students;

    public EngClass() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        boolean exists = false;
        for(Student s: students) {
            if (s.getStudentId().equals(student.getStudentId())) {
                exists = true;
                break;
            }
        }

        if (exists) {
            System.out.println("Student with ID " + student.getStudentId() + " is already in the class.");
            return;
        }

        students.add(student);
        System.out.println("Added: " + student);
    }

    public void deleteStudent(String studentId) {
            
            boolean removed = false;
            for (int i=0; i < students.size(); i++) {
                if (students.get(i).getStudentId().equals(studentId)) {
                    students.remove(i);
                    removed = true;
                    break;
                }   
            }

        if (removed) {
            System.out.println("Removed student with ID: " + studentId);
        } else {
            System.out.println("Error: Student with ID " + studentId + " not found in the class.");
        }
    }

    public void getStudents() {

        System.out.println(" Current Engineering Class Students:");
        for (Student student : students) {
            System.out.println(student.getStudentId()+ " " + student.getFirstName() + " " + student.getLastName());
        }
        
    }
}
public class Chapter9 {
    public static void main(String[] args) {
        
        EngClass myEngClass = new EngClass();

        Student student1 = new Student("S001", "Daisy", "He");
        Student student2 = new Student("S002", "Amy", "Wang");
        Student student3 = new Student("S003", "Cherry", "Li");

        myEngClass.addStudent(student1);
        myEngClass.addStudent(student2);
        myEngClass.addStudent(student3);

        myEngClass.getStudents();

        myEngClass.deleteStudent("S002");

        myEngClass.getStudents();
    }
}
