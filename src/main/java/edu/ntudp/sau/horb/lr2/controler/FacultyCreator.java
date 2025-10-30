package edu.ntudp.sau.horb.lr2.controler;

import edu.ntudp.sau.horb.lr2.model.Department;
import edu.ntudp.sau.horb.lr2.model.Faculty;
import edu.ntudp.sau.horb.lr2.model.Human;
import java.util.List;

public class FacultyCreator {
    public Faculty createFaculty(String name, Human head, List<Department> departments) {
        return new Faculty(name, head, departments);
    }
}
