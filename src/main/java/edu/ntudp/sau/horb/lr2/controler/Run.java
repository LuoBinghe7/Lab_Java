package edu.ntudp.sau.horb.lr2.controler;
import edu.ntudp.sau.horb.lr2.model.*;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        UniversityCreator universityCreator = new UniversityCreator(new Scanner(System.in));
        UniversityPrinter printUniversity = new UniversityPrinter();
        printUniversity.printUniversity(universityCreator.createUniversity());
    }
}