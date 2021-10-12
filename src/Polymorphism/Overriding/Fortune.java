package Polymorphism.Overriding;

public class Fortune {
    public void property(){
        System.out.println("Cash+Car+House");
    }
    public void car(){
        System.out.println("old car");
    }

}
class Vehicle extends  Fortune{
    public void car(){
        System.out.println("new car needed");

    }

    public static void main(String[] args) {
        Fortune f = new Fortune();//parent
        f.car();

        Vehicle v = new Vehicle();//child
        v.car();

        Fortune f1 = new Vehicle();//child
        f1.car();
    }

}
