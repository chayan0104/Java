package Polymorphism;

import javax.sound.midi.Soundbank;

public interface Bank {
    float interestRate();

}
class SBI implements Bank {
    @Override
    public float interestRate() {
        return 8.0f;
    }

    static class HDFC implements Bank {
        @Override
        public float interestRate() {
            return 9.0f;
        }
    }

}
class Test {
    public static void main(String[] args) {
        SBI s = new SBI();
        SBI.HDFC h = new SBI.HDFC();
        System.out.println("SBI interest rate "+ s.interestRate() );
        System.out.println("HDFC interest rate "+ h.interestRate() );


    }
}