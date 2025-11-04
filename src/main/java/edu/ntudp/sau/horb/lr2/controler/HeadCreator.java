package edu.ntudp.sau.horb.lr2.controler;
import edu.ntudp.sau.horb.lr2.model.Manager;
import edu.ntudp.sau.horb.lr2.model.Sex;
import java.util.Scanner;

public class HeadCreator {
    Scanner scanner;
    String typeOfHead;

    public HeadCreator(Scanner scanner, String typeOfHead) {
        this.scanner = scanner;
        this.typeOfHead = typeOfHead;
    }
    public Manager createTypicalHead(){
        scanner.nextLine();
        System.out.print("Enter the firstname of the president " + typeOfHead +": ");
        String firstName = scanner.nextLine();
        System.out.print("Enter the lastname of the president "+ typeOfHead +": ");
        String lastName = scanner.nextLine();
        System.out.print("Enter the patronymic of the president "+ typeOfHead +": ");
        String patronymic = scanner.nextLine();
        System.out.print("Enter the sex (MALE, FEMALE, OTHER) of the president "+ typeOfHead +": ");
        Sex sex = Sex.valueOf(scanner.nextLine().toUpperCase());
        return new Manager(firstName, lastName, patronymic, sex);
    }
}
