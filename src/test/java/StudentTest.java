import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void livesInLondon() {
//        GIVEN a student who lives in London
        Student student = new Student("Test Student", 25, "London", "Glasgow");
//        WHEN  we call the livesInLondon mehod
        boolean result = student.livesInLondon();
//        THEN it should return true
        assertTrue(result);
    }

//    need to test that it works when it should and does not work where it shouldnt

    @Test
    void livesInLondon_false(){
//          GIVEN a student who does not live in London
        Student student = new Student("Test2", 36, "Cardiff", "QMUL");
//          WHEN we call the livesInlondon method
        boolean result = student.livesInLondon();
//          THEN it should return false
        assertFalse(result);
    }
}