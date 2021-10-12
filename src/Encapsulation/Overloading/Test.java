package Encapsulation.Overloading;
//same method with different parameter
public class Test {
    public void m1(StringBuffer sb){
        System.out.println("string buffer");
    }
    public void  m1(String s){
        System.out.println("string");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.m1("chayan");
        t.m1(new StringBuffer("Chayan Samanta"));
    }
}
