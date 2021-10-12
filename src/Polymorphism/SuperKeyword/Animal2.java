package Polymorphism.SuperKeyword;

public class Animal2 {
    void eat() {
        System.out.println("animal eating");
    }

    static class Cat extends Animal2 {
        void eat() {
            System.out.println("Cat is eating");
        }

        void sleep() {
            System.out.println("cat is sleeping");

        }
        void work() {
            super.eat(); // parent call
            sleep();//child
        }
    }
}

class Test2{
    public static void main(String[] args) {
        Animal2.Cat c = new Animal2.Cat();
        c.work();

    }
}
