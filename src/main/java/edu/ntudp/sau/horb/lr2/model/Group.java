package edu.ntudp.sau.horb.lr2.model;
import java.util.List;

public class Group extends Structure<Student>
{
    public  Group(String name, Manager head, List<Student> divisions)
    {
        super(name, head, divisions);
    }
}
