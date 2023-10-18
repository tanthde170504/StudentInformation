package view;

import controller.StudentController;
import model.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("====== Collection Sort Program ======");
        while (true) {
            System.out.println("Please input student information");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Classes: ");
            String classes = scanner.nextLine();
            System.out.print("Mark: ");
            float mark = scanner.nextFloat();
            scanner.nextLine();  // consume newline left-over

            students.add(new Student(name, mark, classes));

            System.out.print("Do you want to enter more student information?(Y/N): ");
            String option = scanner.nextLine();
            if (!option.equalsIgnoreCase("Y")) {
                break;
            }
        }

        StudentController controller = new StudentController();
        students = controller.sortStudent(students);
        controller.display(students);
    }
}
