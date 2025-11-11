package edu.ntudp.sau.horb.lr2.controler;
import com.google.gson.Gson;
import edu.ntudp.sau.horb.lr2.model.University;
import edu.ntudp.sau.horb.lr4.JsonManager;
import org.junit.Test;
import static org.junit.Assert.*;

public class UniversityCreatorTest {

    @Test
    public void createTypicalUniversityForLab4() {
        University oldUniversity = new UniversityCreator(null).createTypicalUniversityForLab4();
        JsonManager jsonManager = new JsonManager(new Gson());
        String filePath = "oldUniversity.json";
        jsonManager.writeUniversityToJson(oldUniversity, filePath);
        University newUniversity = jsonManager.readUniversityFromJson(filePath);
        assertEquals(newUniversity, oldUniversity);
    }
}