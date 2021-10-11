package Encapsulation;

import javax.sound.midi.Soundbank;

public class Employee {
    private String name;
    private int age;
//getter method
    public String getName() {
        return name;
    }
//setter method
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Employee E = new Employee();
        E.setAge(24);
        E.setName("Ankit");
        System.out.println("name is "+E.getName()+" age " + E.getAge());
    }
}
