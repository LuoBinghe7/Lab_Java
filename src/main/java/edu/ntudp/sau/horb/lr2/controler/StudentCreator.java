package edu.ntudp.sau.horb.lr2.controler;
import edu.ntudp.sau.horb.lr2.model.Human;
import edu.ntudp.sau.horb.lr2.model.Student;

public class StudentCreator {
    public Student createStudent(String firstName, String lastName, String patronymic, Human.Sex sex, int studentIdNumber) {
        return new Student(firstName, lastName, patronymic, sex, studentIdNumber);
    }
}
