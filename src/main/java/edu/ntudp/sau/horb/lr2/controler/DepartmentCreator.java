package edu.ntudp.sau.horb.lr2.controler;
import edu.ntudp.sau.horb.lr2.model.Department;
import edu.ntudp.sau.horb.lr2.model.Group;

import java.util.*;

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
    public List<Department> createTypicalDepartmentsForLab4(String facultyName) {
        HeadCreator headCreator = new HeadCreator(null,null);
        GroupCreator groupCreator = new GroupCreator(null);
        if (facultyName.contains("FIT")) {
            return Arrays.asList(
                    createDepartmentForLab4("Systems analysis and management", headCreator, groupCreator),
                    createDepartmentForLab4("Information technology", headCreator, groupCreator)
            );
        } else if (facultyName.contains("FIS")) {
            return Arrays.asList(
                    createDepartmentForLab4("Cybersecurity", headCreator, groupCreator),
                    createDepartmentForLab4("Computer Science", headCreator, groupCreator)
            );
        }
        return Collections.emptyList();
    }
    public Department createDepartmentForLab4(String departmentName, HeadCreator headCreator, GroupCreator groupCreator) {
        return new Department(departmentName,headCreator.createTypicalHeadForLab4(departmentName),groupCreator.createTypicalGroupsForLab4(departmentName));
    }
}
