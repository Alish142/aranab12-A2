public class Person {
    private String firstName;
    private String lastName;
    private int age;

    // Default cosntructor 
    public Person(){  }


    // paramaterised constructor 
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.age       = age;
    }

}