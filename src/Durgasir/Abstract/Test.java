package Durgasir.Abstract;

abstract class Test {
    public abstract void m1();//no body in abstact
    public abstract void m2();
}
//subTest os child class
class SubTest extends Test{

    //compulsory need to implement for both m1 and m2
    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }
}