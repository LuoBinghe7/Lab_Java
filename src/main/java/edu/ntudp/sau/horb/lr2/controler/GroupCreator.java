package edu.ntudp.sau.horb.lr2.controler;
import edu.ntudp.sau.horb.lr2.model.Group;
import edu.ntudp.sau.horb.lr2.model.Student;

import java.util.*;

public class GroupCreator {
    Scanner scanner;
    public GroupCreator(Scanner scanner) {
        this.scanner = scanner;
    }
        public Group createGroup() {
            scanner.nextLine();
            System.out.print("Enter the name of the group: ");
            String nameGroup = scanner.nextLine();
            System.out.print("Enter the number of student in the group: ");
            int numberOfStudentInGroup = scanner.nextInt();
            String typeOfHead = "Group";
            HeadCreator headCreator = new HeadCreator(scanner,typeOfHead);
            StudentCreator studentCreator = new StudentCreator(scanner);
            List<Student> students = new ArrayList<>();
            for(int i = 0; i < numberOfStudentInGroup; i++)
            {
                students.add(studentCreator.createStudent());
            }
            return new Group(nameGroup,headCreator.createTypicalHead(),students);
        }
    public List<Group> createTypicalGroupsForLab4(String departmentName) {
        HeadCreator headCreator = new HeadCreator(null,null);
        StudentCreator studentCreator = new StudentCreator(null);
        if (departmentName.contains("Systems analysis and management")) {
            return Arrays.asList(
                    createGroupForLab4("Group 124-22-1", headCreator, studentCreator),
                    createGroupForLab4("Group 124-22-2", headCreator, studentCreator)
            );
        } else if (departmentName.contains("Information technology")) {
            return Arrays.asList(
                    createGroupForLab4("Group 123-22-1", headCreator, studentCreator),
                    createGroupForLab4("Group 123-22-2", headCreator, studentCreator)
            );
        }
        else if (departmentName.contains("Cybersecurity")) {
            return Arrays.asList(
                    createGroupForLab4("Group 125-22-1", headCreator, studentCreator),
                    createGroupForLab4("Group 125-22-2", headCreator, studentCreator)
            );
        }
        else if (departmentName.contains("Computer Science")) {
            return Arrays.asList(
                    createGroupForLab4("Group 122-22-1", headCreator, studentCreator),
                    createGroupForLab4("Group 122-22-2", headCreator, studentCreator)
            );
        }
        return Collections.emptyList();
    }
    public Group createGroupForLab4(String groupName, HeadCreator headCreator, StudentCreator studentCreator) {
        return new Group(groupName,headCreator.createTypicalHeadForLab4(groupName),studentCreator.createTypicalStudentsForLab4(groupName));
    }
}
