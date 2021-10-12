package MethodHiding;
//same as overriding with Static method.

public class Test {
    public static void m1() {
        System.out.println("Parent class");
    }
}
class Subtest extends Test{
    public static void m1(){
        System.out.println("Child class");
    }


    public static void main(String[] args) {
        Test t = new Test();
        t.m1();

        Subtest s = new Subtest();
        s.m1();

        Test t1 = new Subtest();
        t1.m1();

    }

}
