package edu.ntudp.sau.horb.lr2.controler;

import edu.ntudp.sau.horb.lr2.model.Group;
import edu.ntudp.sau.horb.lr2.model.Human;
import edu.ntudp.sau.horb.lr2.model.Student;
import java.util.List;

public class GroupCreator {
        public Group createGroup(String name, Human head, List<Student> students) {
            return new Group(name, head, students);
        }
}
