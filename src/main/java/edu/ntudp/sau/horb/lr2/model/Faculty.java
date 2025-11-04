package edu.ntudp.sau.horb.lr2.model;

import java.util.List;
public class Faculty extends Structure<Department>
{
   public  Faculty(String name, Manager head, List<Department> divisions)
    {
        super(name, head, divisions);
    }
}
