package OOPS.Inheritance;

public class Animal {
}

class Mammels extends Animal{

}

class reptile extends Animal{

}

class Dog extends Mammels {
    public static void main(String[] args) {
        Animal a = new Animal();
        Mammels m = new Mammels();
        Dog d = new Dog();

        System.out.println(m instanceof Animal);
        System.out.println(d instanceof Mammels);
        System.out.println(d instanceof Animal);
    }
}

