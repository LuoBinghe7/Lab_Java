package edu.ntudp.sau.horb.lr2.controler;

import edu.ntudp.sau.horb.lr2.model.Department;
import edu.ntudp.sau.horb.lr2.model.Group;
import edu.ntudp.sau.horb.lr2.model.Human;
import java.util.List;

public class DepartmentCreator {
    public Department createDepartment(String name, Human head, List<Group> groups) {
        return new Department(name, head, groups);
    }
}
