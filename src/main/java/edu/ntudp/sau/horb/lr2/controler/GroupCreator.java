package edu.ntudp.sau.horb.lr2.controler;
import edu.ntudp.sau.horb.lr2.model.Group;
import edu.ntudp.sau.horb.lr2.model.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
}
