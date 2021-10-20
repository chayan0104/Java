package Polymorphism.SuperKeyword;

public class Person {
    int id;
    String name;
//constructor
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class Employee extends Person{
    float Salary;
    public Employee(int id, String name, float salary) {
        super(id, name);
        Salary = salary;
    }
    void display(){
        System.out.println("name is "+name+" Id is "+id);
    }
}

class Test3{
    public static void main(String[] args) {
        Employee E = new Employee(1,"Ankit",45000f);
        E.display();
    }
}


