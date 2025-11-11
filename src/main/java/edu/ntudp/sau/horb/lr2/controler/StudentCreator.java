package edu.ntudp.sau.horb.lr2.controler;
import edu.ntudp.sau.horb.lr2.model.Student;
import edu.ntudp.sau.horb.lr2.model.Sex;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
    public List<Student> createTypicalStudentsForLab4(String groupName) {
        if (groupName.contains("Group 124-22-1")) {
            return Arrays.asList(
                    new Student("Kateryna", "Bondar", "Yuriyivna", Sex.FEMALE,111),
                    new Student("Mariia", "Kryzh", "Olehivna", Sex.FEMALE, 112)
            );
        } else if (groupName.contains("Group 124-22-2")) {
            return Arrays.asList(
                    new Student("Viktor", "Melnyk", "Ivanovych", Sex.MALE, 113),
                    new Student("Dmytro", "Lytvyn", "Olehovych", Sex.MALE, 114)
            );
        } else if (groupName.contains("Group 123-22-1")) {
            return Arrays.asList(
                    new Student("Hryhorii", "Mytsyk", "Ivanovych", Sex.MALE, 115),
                    new Student("Serhii", "Serhiiovych", "Petrovych", Sex.MALE, 116)
            );
        } else if (groupName.contains("Group 123-22-2")) {
            return Arrays.asList(
                    new Student("Kateryna", "Moroz", "Yanivna", Sex.FEMALE, 117),
                    new Student("Kostiantyn", "Kormin", "Yevhenovych", Sex.MALE, 118)
            );
        } else if (groupName.contains("Group 125-22-1")) {
            return Arrays.asList(
                    new Student("Kyrylo", "Havva", "Oleksandrovych", Sex.MALE, 119),
                    new Student("Hryhorii", "Kriuchko", "Andriiovych", Sex.MALE, 120)
            );
        } else if (groupName.contains("Group 125-22-2")) {
            return Arrays.asList(
                    new Student("Viktoriia", "Padalko", "Petriivna", Sex.FEMALE, 121),
                    new Student("Lev", "Mokh", "Andriiovych", Sex.MALE, 122)
            );
        } else if (groupName.contains("Group 122-22-1")) {
            return Arrays.asList(
                    new Student("Marianna", "Lakhno", "Vasylivna", Sex.FEMALE, 123),
                    new Student("Ivan", "Kyslytsia", "Pavlovych", Sex.MALE, 124)
            );
        } else if (groupName.contains("Group 122-22-2")) {
            return Arrays.asList(
                    new Student("Svitlana", "Halushka", "Vasylivna", Sex.FEMALE, 125),
                    new Student("Mykyta", "Snihur", "Petrovych", Sex.MALE, 126)
            );
        }
        return Collections.emptyList();
}}
