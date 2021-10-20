package OOPS.Polymorphism.Overloading;
//changing the no of arguments
class NoOfArgument {
    static int add(int a,int b){ //1st method with 2 argument
        return a+b;
    }
    static  int add (int a,int b ,int c){ //2nd method with 2 argument
        return a+b+c;
    }

}
class overloading{
    public static void main(String[] args) {
        System.out.println(NoOfArgument.add(11,15));
        System.out.println(NoOfArgument.add(15,16,44));
    }
}