package edu.ntudp.sau.horb.lr2.controler;

import edu.ntudp.sau.horb.lr2.model.*;

public class UniversityPrinter {
    public void printUniversity(University university) {
        Human headUniversity = university.getHead(); // ← додано
        System.out.println("University name: " + university.getName());
        System.out.println("Head: " +headUniversity.getFirstName() + " " + headUniversity.getPatronymic()
                + " " + headUniversity.getLastName() );
        System.out.println("Faculties:");
        for (Faculty faculty : university.getDivisions()) {
            printFaculty(faculty);
        }
    }
    public void printFaculty(Faculty faculty) {
        Human headFaculty = faculty.getHead();
        System.out.println("Faculty name: " + faculty.getName());
        System.out.println("Head: " + headFaculty.getFirstName() + " " + headFaculty.getPatronymic()
                + " " + headFaculty.getLastName() );
        System.out.println("Departments:");
        for (Department department : faculty.getDivisions()) {
            printDepartment(department);
        }
    }
    public void printDepartment(Department department) {
        Human headDepartment = department.getHead();
        System.out.println("Department name: " + department.getName());
        System.out.println("Head: " + headDepartment.getFirstName() + " " + headDepartment.getPatronymic()
                + " " + headDepartment.getLastName() );
        System.out.println("Groups:");
        for (Group group : department.getDivisions()) {
            printGroup(group);
        }
    }
    public void printGroup(Group group) {
        Human headGroup = group.getHead();
        System.out.println("Group name: " + group.getName());
        System.out.println("Head: " + headGroup.getFirstName() + " " + headGroup.getPatronymic()
                + " " + headGroup.getLastName() );
        System.out.println("Students:");
        for (Student student : group.getDivisions()) {
            printStudent(student);
        }
    }
    public void printStudent(Student student) {
        System.out.println("Student firstname: " + student.getFirstName());
        System.out.println("Student lastname: " + student.getLastName());
        System.out.println("Student patronymic: " + student.getPatronymic());
        System.out.println("Student sex : " + student.getSex().toString());
        System.out.println("Student id number : " + student.getStudentIdNumber());
    }
}

