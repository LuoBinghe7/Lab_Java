package edu.ntudp.sau.horb.lr2.controler;
import edu.ntudp.sau.horb.lr2.model.Faculty;
import edu.ntudp.sau.horb.lr2.model.University;

import java.util.*;

public class UniversityCreator {
    Scanner scanner;
    public UniversityCreator(Scanner scanner) {
        this.scanner = scanner;
    }
    public University createUniversity() {
        System.out.print("Enter the name of the university: ");
        String nameUniversity = scanner.nextLine();
        System.out.print("Enter the number of faculties in the university: ");
        int numberOfFacultyInUniversity = scanner.nextInt();
        String typeOfHead = "University";
        HeadCreator headCreator = new HeadCreator(scanner,typeOfHead);
        FacultyCreator facultyCreator = new FacultyCreator(scanner);
        List<Faculty> faculties = new ArrayList<>();
        for(int i = 0; i < numberOfFacultyInUniversity; i++)
        {
            faculties.add(facultyCreator.createFaculty());
        }
        return new University(nameUniversity,headCreator.createTypicalHead(),faculties);
    }
    public University createTypicalUniversityForLab4() {
        HeadCreator headCreator = new HeadCreator(null,null);
        FacultyCreator facultyCreator = new FacultyCreator(null);
        String UniversityName = "NTU DP";
        List<Faculty> faculties = facultyCreator.createTypicalFacultyForLab4(UniversityName);
        return new University(UniversityName,headCreator.createTypicalHeadForLab4(UniversityName),faculties);
    }
}
