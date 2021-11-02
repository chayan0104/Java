package Durgasir.Interface;
//srs
public interface Test1 {
    public void m1();
    public void m2();
}
//providing implementation by child class
//need to provide implementation for all or make class abstract
//abstract child class
abstract class Test2 implements Test1{
    @Override
    public void m1() { //every child class method should be declared as public
        System.out.println("method one");
    }
}
//child class
class result extends Test2{
    //to get rid of error compulsory we need to provide implementation for m2
    @Override
    public void m2() {
   }
}
