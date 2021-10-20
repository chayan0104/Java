package Practice.OperatorAndStatements;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Banking Operation");
        System.out.println("Our operations");
        System.out.println("Click 1 for exit");
        System.out.println("click 2 for Money Transfer");
        System.out.println("click 3 for get money");

        int operation = sc.nextInt();// Specifying operation from user input

        //Exit operation
        if (operation == 1){
            System.out.println("Exiting from the system");
        }


        //Transfer money
        else if(operation==2){
            System.out.println("how much money do you have?");
            int balance= sc.nextInt();//100
            System.out.println("how much money do you want to transfer");
            int transfer =sc.nextInt();//50
           /*  System.out.println("You have transferred Your money");
            System.out.println("Your current Account Balance is: "+(balance-transfer));
            System.out.println("Congratulations");*/

            //validate
            if(balance<transfer){
                System.out.println("Sorry You do not have that much money");
            }
            else if(balance>transfer){
                System.out.println("You transferred" +transfer);
                System.out.println("Your current Account Balance is: "+(balance-transfer));
            }
            else if (balance==transfer){
                System.out.println("You transferred" +transfer);
                System.out.println("Your current Account Balance is: "+(balance-transfer));               ;
            }
        }

        //Get Money
        else if(operation==3){
            System.out.println("Enter your balance");
            int balance = sc.nextInt();
            System.out.println("how much Money you want to take?");
            int money = sc.nextInt();
            /*System.out.println("Ypu have : "+money );
            System.out.println("Your Current balance is: "+(balance-money));
            */
            //validate
            if(balance<money){
                System.out.println("Sorry You do not have that much money");
            }
            else if(balance>money){
                System.out.println("You got money" +money);
                System.out.println("Your current Account Balance is: "+(balance-money));
            }
            else if (balance==money){
                System.out.println("Your Have all you money ");               ;
            }

        }

        //invalid
        else {
            System.out.println("Invalid operation");
        }

    }


}
