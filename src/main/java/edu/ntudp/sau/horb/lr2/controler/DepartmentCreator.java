package edu.ntudp.sau.horb.lr2.controler;
import edu.ntudp.sau.horb.lr2.model.Department;
import edu.ntudp.sau.horb.lr2.model.Group;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentCreator {
    Scanner scanner;
    public DepartmentCreator(Scanner scanner) {
        this.scanner = scanner;
    }
    public Department createDepartment() {
        scanner.nextLine();
        System.out.print("Enter the name of the department: ");
        String nameDepartment = scanner.nextLine();
        System.out.print("Enter the number of group in the department: ");
        int numberOfGroupInDepartment = scanner.nextInt();
        String typeOfHead = "Department";
        HeadCreator headCreator = new HeadCreator(scanner, typeOfHead);
        GroupCreator groupCreator = new GroupCreator(scanner);
        List<Group> groups = new ArrayList<>();
        for (int i = 0; i < numberOfGroupInDepartment; i++) {
            groups.add(groupCreator.createGroup());
        }
        return new Department(nameDepartment,headCreator.createTypicalHead(),groups);
    }
}
