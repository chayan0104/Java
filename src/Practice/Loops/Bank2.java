package Practice.Loops;

import java.util.Scanner;

public class Bank2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Operation");
        System.out.println("Operations Are");
        System.out.println("1: Take Money");
        System.out.println("2: Put Money to Balance");
        System.out.println("3: To Exit");

     int operation = sc.nextInt();

        while(true){
           if (operation==1){
               System.out.println("enter Balance");
               int balance =sc.nextInt();
               System.out.println("Enter money you want");
               int money =sc.nextInt();
                if(money>balance){
                    System.out.println("You cannot do this operation");
                   // continue; go back beginning o0f while loop.
                    //break // breaks the iteration.

                }
                else{
                     System.out.println("You got money: "+money);

                }
           }
           else if(operation==2){
               System.out.println("Enter your balance");
               int balance = sc.nextInt();
               System.out.println("enter the money you want To Put");
               int put = sc.nextInt();
           }


        }
    }
}
