package OOPS.Polymorphism.Overloading;

public class TypeOfArgument {
    static int m1(int a, int b){
        return a+b;
    }
    static double m1(double a, double b, double c){
        return  a+b+c;
    }
}
class Test1{
    public static void main(String[] args) {
        System.out.println(TypeOfArgument.m1(12,44));
        System.out.println(TypeOfArgument.m1(22,58,74));
    }
}
