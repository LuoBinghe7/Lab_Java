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
    public Manager createTypicalHeadForLab4(String headName) {
        switch (headName) {
            case "Group 124-22-1":
                return new Manager("Kateryna", "Bondar", "Yuriyivna", Sex.FEMALE);
            case "Group 124-22-2":
                return new Manager("Dmytro", "Lytvyn", "Olehovych", Sex.MALE);
            case "Group 123-22-1":
                return new Manager("Hryhorii", "Mytsyk", "Ivanovych", Sex.MALE);
            case "Group 123-22-2":
                return new Manager("Kateryna", "Moroz", "Yanivna", Sex.FEMALE);
            case "Group 122-22-1":
                return new Manager("Marianna", "Lakhno", "Vasylivna", Sex.FEMALE);
            case "Group 122-22-2":
                return new Manager("Mykyta", "Snihur", "Petrovych", Sex.MALE);
            case "Group 125-22-1":
                return new Manager("Kyrylo", "Havva", "Oleksandrovych", Sex.MALE);
            case "Group 125-22-2":
                return new Manager("Viktoriia", "Padalko", "Petriivna", Sex.FEMALE);
            case "Systems analysis and management":
                return new Manager("Serhii", "Novych", "Ivanovych", Sex.MALE);
            case "Information technology":
                return new Manager("Karyna", "Moran", "Serhiivna", Sex.FEMALE);
            case "Cybersecurity":
                return new Manager("Pavlo", "Pivnyk", "Pavlovych", Sex.MALE);
            case "Computer Science":
                return new Manager("Yuriy", "Pluch", "Petrovych", Sex.MALE);
            case "FIT":
                return new Manager("Ananatoly", "Loza", "Yevhenovych", Sex.MALE);
            case "FIS":
                return new Manager("Viktoriia", "Lozenko", "Serhiivna", Sex.OTHER);
            case "NTU DP":
                return new Manager("Viktor","Kipoch","Petrovych", Sex.MALE);
            default:
                return new Manager("Default", "Manager", "Name", Sex.OTHER);
        }
    }

}
