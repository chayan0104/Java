package OOPS.Abstraction;

public abstract  class Bike {
    abstract void run();//abstarct method
        }

        class Honda extends Bike{
    void run(){
        System.out.println("running");
    }

            public static void main(String[] args) {
                Bike b = new Honda();
                b.run();
            }
        }