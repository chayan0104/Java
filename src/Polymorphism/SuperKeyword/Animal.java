package Polymorphism.SuperKeyword;
//direct reference
public class Animal {
    String color ="white";
}
class Dog extends Animal{
    String color ="black";
    void printColor(){
        System.out.println(color);//child
        System.out.println(super.color);//parent
    }
}
class Test{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
    }
}

