import java.util.ArrayList;

public class Cohort {

//   stating that every ochort has these properties
    private String name;
//    private DataType Object ArrayListname
    private ArrayList<Student> students;

//    defining the values of these properties in our constructors
//     initialise this value in our constructor
//    so we pass through the cohort name and starting with an empty array list

    public Cohort(String name){
        this.name = name;
        this.students = new ArrayList<>();
//        so every new cohort will have a name and an empty array list ready to add things to
    }
//GETTERS AND SETTERS
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

//    BEHAVIOURS

    public int countStudents(){
//        this.student is an arraylist and we can call on its methods
        return this.students.size();
    }
    public void addStudent(Student student){
        this.students.add(student);
    }

}
