package Durgasir.Abstract;

abstract public class Vehicle {
    public abstract int getNoOfWheels();//as we don't know which type of vehicle

}
//Bus child class
//creating object for Vehicle class isn't possible as abstract
//but possible for Bus or Auto.
class Bus extends Vehicle{

    @Override
    public int getNoOfWheels() {
        return 6; // wheels
    }
}
class Auto extends Vehicle{

    @Override
    public int getNoOfWheels() {
        return 3;
    }
}

class TestVehicle {
    public static void main(String[] args) {

    }
}