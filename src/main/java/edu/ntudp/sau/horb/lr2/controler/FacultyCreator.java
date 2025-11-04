package edu.ntudp.sau.horb.lr2.controler;
import edu.ntudp.sau.horb.lr2.model.Department;
import edu.ntudp.sau.horb.lr2.model.Faculty;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FacultyCreator {
    Scanner scanner;

    public FacultyCreator(Scanner scanner) {
        this.scanner = scanner;
    }
    public Faculty createFaculty() {
        scanner.nextLine();
        System.out.print("Enter the name of the faculty: ");
        String nameFaculty = scanner.nextLine();
        System.out.print("Enter the number of department in the faculty: ");
        int numberOfDepartmentInFaculty = scanner.nextInt();
        String typeOfHead = "Faculty";
        HeadCreator headCreator = new HeadCreator(scanner, typeOfHead);
        DepartmentCreator departmentCreator = new DepartmentCreator(scanner);
        List<Department> departments = new ArrayList<>();
        for (int j = 0; j < numberOfDepartmentInFaculty; j++) {
            departments.add(departmentCreator.createDepartment());
        }
        return new Faculty(nameFaculty, headCreator.createTypicalHead(), departments);
    }
}
