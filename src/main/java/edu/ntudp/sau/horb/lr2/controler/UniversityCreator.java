package edu.ntudp.sau.horb.lr2.controler;

import edu.ntudp.sau.horb.lr2.model.Faculty;
import edu.ntudp.sau.horb.lr2.model.Human;
import edu.ntudp.sau.horb.lr2.model.University;
import java.util.List;

public class UniversityCreator {
    public University createUniversity(String name, Human head, List<Faculty> faculties) {
        return new University(name, head,faculties);
    }
}
