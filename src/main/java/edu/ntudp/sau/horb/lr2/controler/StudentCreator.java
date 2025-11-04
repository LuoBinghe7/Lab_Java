package edu.ntudp.sau.horb.lr2.controler;
import edu.ntudp.sau.horb.lr2.model.Student;
import edu.ntudp.sau.horb.lr2.model.Sex;
import java.util.Scanner;

public class StudentCreator {
    Scanner scanner;
    public StudentCreator(Scanner scanner) {
        this.scanner = scanner;
    }
    public Student createStudent() {
        scanner.nextLine();
        System.out.print("Enter the firstname of the student: ");
        String firstNameStudent = scanner.nextLine();
        System.out.print("Enter the lastname of the student: ");
        String lastNameStudent = scanner.nextLine();
        System.out.print("Enter the patronymic of the student: ");
        String patronymicStudent = scanner.nextLine();
        System.out.print("Enter the sex (MALE,FEMALE,OTHER) of the student: ");
        Sex sexStudent = Sex.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Enter the student id number: ");
        int studentIdNumber = scanner.nextInt();
        return new Student(firstNameStudent,lastNameStudent,patronymicStudent,sexStudent,studentIdNumber);
    }
}
