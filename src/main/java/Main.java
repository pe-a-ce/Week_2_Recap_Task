/*
Recap TASK

    MODEL BNTA
    Two classes: Student and Cohort
    Students need name, location, uni
    Cohort needs name and collection of students
    Students should be able to count to 10
    Students should be able to say if they live in London or not
    Cohort should be able to count number of students
    Cohort should be able to add a new students

        * --------------------- * --------------------- * ---------------------------- *
        |     Class Name        |        Student        |         Cohort               |
        * --------------------- * --------------------- * ---------------------------- *
        | Properties/Attributes |   - Name: String      |   - Name: String             |
        |                       |  - Location: String   | Students: ArrayList<Student> |
        | Access, what they have|  - University: String |                              |
        | how it is set (data   | _ Age: int            |                              |
        |  types)               |                       |                              |
        * --------------------- * --------------------- * ---------------------------- *
        | Behaviours/Methods    | + Getters/Setters (for| + countStudents(): int       |
        |                       |  each property)       |                              |
        |  types)               |                       |  + addNewStudent(Student):   |
        |                       |  + livesinLondon()    |      void                    |
        |                       |   boolean             |                              |
        |                       |                       |                              |
        |                       |   + counttoTen(): void|                              |
        * --------------------- * --------------------- * ---------------------------- *

 */



public class Main {

    public static void main(String[] args) {
//        Class object = new Class (Property Information that we pass through)
        Student student1 = new Student("Peace", 24, "Luton", "Imperial");

        String student1Name = student1.getName();
        student1.setLocation("Canada");
//how to return true/false where for live in London
        System.out.println(student1.livesInLondon());

        student1.countToTen();
//        the dot calls the method that we established in the class fies
//        here is where we would give in our own number to
//        student1.countToNumber(6);
//
//        System.out.println(student1Name);
//        System.out.println(student1.getLocation());

        Cohort cohort = new Cohort("T-Techs");
        cohort.addStudent(student1);
    }
}
