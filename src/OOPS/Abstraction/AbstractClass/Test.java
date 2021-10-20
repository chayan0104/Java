package OOPS.Abstraction.AbstractClass;

public abstract class Test {
    public abstract void m1();// no body in abstract
    public abstract void m2();

}
abstract class Subtest extends Test{ // needs to provide abstract keyword in classs or provide implementation of m2.
    @Override
    public void m1() {
        //condition
    }

}