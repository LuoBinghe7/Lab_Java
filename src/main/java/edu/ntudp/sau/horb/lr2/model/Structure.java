package edu.ntudp.sau.horb.lr2.model;

import java.util.List;
import java.util.Objects;

public abstract class Structure <T>{
    private String name;
    private Manager head;
    private List<T> divisions;

    public Structure(String name, Manager head, List<T> divisions) {
        this.name = name;
        this.head = head;
        this.divisions = divisions;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Structure<?> structure = (Structure<?>) o;
        return Objects.equals(name, structure.name) && Objects.equals(head, structure.head) && Objects.equals(divisions, structure.divisions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, head, divisions);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getHead() {
        return head;
    }

    public void setHead(Manager head) {
        this.head = head;
    }

    public List<T> getDivisions() {
        return divisions;
    }

    public void setDivisions(List<T> divisions) {
        this.divisions = divisions;
    }
}
