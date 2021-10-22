package Practice.Constructor;

public class Student {

    private String name =  "ram";
    private String email = "xyz@gmail.com";
    private int age = 24;

    //constructor
    public Student() {
        this.name = name; // accessing name by this method.
        System.out.println("this is a constructor");
    }
}
