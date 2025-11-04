package edu.ntudp.sau.horb.lr2.model;
import java.util.List;


public class Department extends Structure<Group>{
    public Department(String name, Manager head, List<Group> divisions){
        super(name, head, divisions);
    }
}
