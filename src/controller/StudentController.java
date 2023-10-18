package controller;

import model.Student;
import model.StudentComparator;
import java.util.Collections;
import java.util.List;

public class StudentController {
    public List<Student> sortStudent(List<Student> students) {
        Collections.sort(students, new StudentComparator());
        return students;
    }

    public void display(List<Student> students) {
        int studentNumber = 1;
        for (Student student : students) {
            System.out.println("-------------Student " + studentNumber + "-------------");
            System.out.println("Name: " + student.getName());
            System.out.println("Classes: " + student.getClasses());
            System.out.println("Mark: " + student.getMark());
            studentNumber++;
        }
    }
}
