import org.example.CILab;
import org.example.CILabInterface;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void detectCapitalUseTest1() {

       myString.setString("SoftwareEngineering");
       boolean expected = true;
       boolean actual = myString.detectCapitalUse();
       assertEquals(expected, actual);

    }
    @Test
    public void detectCapitalUseTest2() {
        fail("Not yet implemented");

        // myString is set to a "software engineering"
    }

    @Test
    public void detectCapitalUseTest3() {
        fail("Not yet implemented");

        // myString is set to a "SOFTWARE ENGINEERING"
    }

    @Test
    public void detectCapitalUseTest4() {
        fail("Not yet implemented");

        // myString is set to a ""
    }
}
