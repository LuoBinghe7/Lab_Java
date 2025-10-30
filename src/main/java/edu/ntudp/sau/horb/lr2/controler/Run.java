package edu.ntudp.sau.horb.lr2.controler;

import edu.ntudp.sau.horb.lr2.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        University university = createTypycalUniversity();
        System.out.println("Name University: " + university.getName());
        Human headUniversity = university.getHead();
        System.out.println("President University: " + headUniversity.getFirstName() + " " + headUniversity.getPatronymic()
                + " " + headUniversity.getLastName() + " (" + headUniversity.getSex() + ")");
        for (Faculty faculty : university.getFaculties()) {
            System.out.println("Faculty:");
            Human headFaculty = faculty.getHead();
            System.out.println(" ----- " + faculty.getName() + ", President: " + headFaculty.getFirstName() + " "
                    + headFaculty.getPatronymic() + " " + headFaculty.getLastName() + " (" + headFaculty.getSex() + ")");
            for (Department department : faculty.getDepartments()) {
                System.out.println("Department:");
                Human headDepartment = department.getHead();
                System.out.println(" ----- " + department.getName() + ", President: " + headDepartment.getFirstName()
                        + " " + headDepartment.getPatronymic() + " " + headDepartment.getLastName() + " ("
                        + headDepartment.getSex() + ")");
                for (Group group : department.getGroups()) {
                    System.out.println("Group:");
                    Human headGroup = group.getHead();
                    System.out.println(" ----- " + group.getName() + ", President: " + headGroup.getFirstName()
                            + " " + headGroup.getPatronymic() + " " + headGroup.getLastName() + " ("
                            + headGroup.getSex() + ")");
                    for (Student student : group.getStudents()) {
                        System.out.println("Student: " + student.getFirstName() + " " + student.getPatronymic()
                                + " " + student.getLastName() + " " +  " (" + student.getSex() + ")" + " "
                                + ", Id number:  " + student.getStudentIdNumber());
                    }
                }
            }
        }
    }
    public static University createTypycalUniversity() {
        UniversityCreator universityCreator = new UniversityCreator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the university: ");
        String nameUniversity = scanner.nextLine();
        System.out.print("Enter the number of faculties in the university: ");
        List<Faculty> faculties = new ArrayList<>();
        int numberOfFacultyInUniversity = scanner.nextInt();
        FacultyCreator facultyCreator = new FacultyCreator();
        for (int i = 1; i <= numberOfFacultyInUniversity; i++) {
            scanner.nextLine();
            System.out.print("Enter the name of the faculty: ");
            String nameFaculty = scanner.nextLine();
            System.out.print("Enter the number of department in the faculty: ");
            List<Department> departments = new ArrayList<>();
            int numberOfDepartmentInFaculty = scanner.nextInt();
            DepartmentCreator departmentCreator = new DepartmentCreator();
            for (int j = 1; j <= numberOfDepartmentInFaculty; j++) {
                scanner.nextLine();
                System.out.print("Enter the name of the department: ");
                String nameDepartment = scanner.nextLine();
                System.out.print("Enter the number of group in the department: ");
                int numberOfGroupInDepartment = scanner.nextInt();
                List<Group> groups = new ArrayList<>();
                GroupCreator groupCreator = new GroupCreator();
                for (int k = 1; k <= numberOfGroupInDepartment; k++) {
                    scanner.nextLine();
                    System.out.print("Enter the name of the group: ");
                    String nameGroup = scanner.nextLine();
                    System.out.print("Enter the number of student in the group: ");
                    int numberOfStudentInGroup = scanner.nextInt();
                    List<Student> students = new ArrayList<>();
                    StudentCreator studentCreator = new StudentCreator();
                    for (int t = 1; t <= numberOfStudentInGroup; t++) {
                        scanner.nextLine();
                        System.out.print("Enter the firstname of the student: ");
                        String firstNameStudent = scanner.nextLine();
                        System.out.print("Enter the lastname of the student: ");
                        String lastNameStudent = scanner.nextLine();
                        System.out.print("Enter the patronymic of the student: ");
                        String patronymicStudent = scanner.nextLine();
                        System.out.print("Enter the sex (MALE,FEMALE,OTHER) of the student: ");
                        String sex = scanner.next();
                        Human.Sex sexStudent = Human.Sex.valueOf(sex.toUpperCase());
                        System.out.print("Enter the student id number: ");
                        int studentIdNumber = scanner.nextInt();
                        scanner.nextLine();
                        Student student = studentCreator.createStudent(firstNameStudent, lastNameStudent, patronymicStudent, sexStudent, studentIdNumber);
                        students.add(student);
                    }
                    Human head = inputHead("group president", scanner);
                    Group group = groupCreator.createGroup(nameGroup, head, students);
                    groups.add(group);
                }
                Human head = inputHead("department president", scanner);
                Department department = departmentCreator.createDepartment(nameDepartment, head, groups);
                departments.add(department);
            }
            Human head = inputHead("faculty president", scanner);
            Faculty faculty = facultyCreator.createFaculty(nameFaculty, head, departments);
            faculties.add(faculty);
        }
        Human head = inputHead("university president", scanner);
        University university = universityCreator.createUniversity(nameUniversity, head, faculties);
        System.out.println("University Create");
        return university;
    }
    public static Human inputHead(String typeOfHead, Scanner scanner) {
        System.out.print("Enter the firstname of the " + typeOfHead + ": ");
        String firstName = scanner.nextLine();
        System.out.print("Enter the lastname of the " + typeOfHead + ": ");
        String lastName = scanner.nextLine();
        System.out.print("Enter the patronymic of the " + typeOfHead + ": ");
        String patronymic = scanner.nextLine();
        System.out.print("Enter the sex (MALE, FEMALE, OTHER) of the " + typeOfHead + ": ");
        String sexInput = scanner.nextLine().toUpperCase();
        Human.Sex sex;
        sex = Human.Sex.valueOf(sexInput);
        return new Human(firstName, lastName, patronymic, sex);
    }
}
