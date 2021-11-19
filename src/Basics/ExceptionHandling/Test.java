package Basics.ExceptionHandling;

public class Test {
    public static void main(String[] args) {
        int a[] = new int[5];

        try {
            System.out.println(a[6]); //throws error as array size is 5 but we store 6
        }catch (ArrayIndexOutOfBoundsException e)//(Exception e) for all exceptions
        {
            System.out.println("Got Customized error");
            System.out.println("1st exception:" + e.getLocalizedMessage());//print error in terminal
        }
///2
        try{
            System.out.println(2/0);
        }catch (Exception e){
            System.out.println("Another Exception");
            System.out.println("2nd exception: " + e.getLocalizedMessage());
        }
        System.out.println("Exception handling");

    }
}
