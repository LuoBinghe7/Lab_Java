package edu.ntudp.sau.horb.lr2.model;
import java.util.List;

public class University extends Structure<Faculty>
{
    public University(String name, Manager head, List<Faculty> divisions){
        super(name, head, divisions);
    }
}
