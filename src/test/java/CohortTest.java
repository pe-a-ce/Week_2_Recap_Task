import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

    /*
        an alternative way to run a test when we are using the same cohort object each time,
        so here we would remove the (Cohort cohort line) from each test and place it before
        the individual tests so that it runs before

            private Cohort cohort;

                @BeforeEach
                 void setup(){
                      cohort = new Cohort("test");
*/
public class CohortTest {

//    if test is red, option and enter to import junit library
    @Test
    void startsWithNoStudents(){
    /* we want to confirm that there are no students there already
    to check that we have initialised it properly
    */
//        GIVEN - a new cohort
        Cohort cohort = new Cohort("test cohort");
//        WHEN

//        THEN - it should have no students
        assertEquals(0, cohort.countStudents());
    }

    @Test
    void canAddStudent(){
//        GIVEN - a new cohort and a student
        Cohort cohort = new Cohort("test Cohort");
        Student student = new Student("test person", 22, "Manchester", "UEA");
//        WHEN - we add the student to the cohort (we confirmed that the new cohort starts w 0, so this is where the issue would be if the test fails
        cohort.addStudent(student);
//        THEN - the cohort should have one student in it
        assertEquals(1,cohort.countStudents());
    }
}
