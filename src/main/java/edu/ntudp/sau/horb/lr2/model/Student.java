package edu.ntudp.sau.horb.lr2.model;

import java.util.Objects;

public class Student extends Human {
    private int studentIdNumber;

    public Student(String firstName, String lastName, String patronymic, Sex sex, int studentIdNumber) {
        super(firstName, lastName, patronymic, sex);
        this.studentIdNumber = studentIdNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return studentIdNumber == student.studentIdNumber;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), studentIdNumber);
    }

    public int getStudentIdNumber() {
        return studentIdNumber;
    }

    public void setStudentIdNumber(int studentIdNumber) {
        this.studentIdNumber = studentIdNumber;
    }
}
