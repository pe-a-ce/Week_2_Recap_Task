public class Student {

//    first created the properties,, every "object" (student) will need these
    private String name;
    private int age;
    private String location;
    private String university;

//    need a constructor method to allow creation of object, needs to be public in order to create new student
//    there is a default constructor (no arg) which is overridden when we set our own

//    1. public (access) 2. ClassName 3. Brackets- define parameters 4. Curly brackets - define what happens with this information
    public Student(String name, int age, String location, String university){

/*        when we call this constructor, it will create an object with the 4 properties which will be set
           when we pass through this info on our "main section" where we do the Student student1 = new Student () {}
  */
        this.name = name;
        this.age = age;
        this.location = location;
        this.university= university;
    }

/* writing out the Getters and Setters (for behaviour section on UML diagram)
    needs to be public, allows something from outside this class to be able to access this info
    Getters need to return the information from the method
    */

//    Getters: public DataType getProperty () { method }
    public String getName(){
//if you plan to use the results that are placed in here, we will need to return the value associated with the property
//   so when we do this.name, we want to get the name of the particular object
    return this.name;
    }

/*   Setters: we don't need to call anything back, we
   also need to specify return type, if nothing void
    public void setName (DataType newName) { this.name = name;}
*/
    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUniversity() {
        return this.university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

        //BEHAVIOURS
//lives in London
    public boolean livesInLondon(){
//
//        the condition is going to depend on the property location we already set
//        if (property.equals("Expected Value"))
        if (this.location.equals("London")){
//           only if this condition is met, should we return true
            return true;
//        if condition is not met, we come down and return false
        } else {
            return false;
        }
    }

//  count to 10
    public void countToTen(){
////   for (int initial condition(where we start), termination condition (keeps going as long as this is met), increments)
        for (int i = 1; i <= 10 ; i++) {
////            define what we want to happen, i.e print
            System.out.println(i);
        }
    }

/*    if we wanted to count up to a given number that we pass through
public void countToNumber(int number){
//        for (int i = 0; i <= number; i++) {
//            System.out.println(i);
//        }
//    }
*/

}
