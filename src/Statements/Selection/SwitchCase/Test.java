package Statements.Selection.SwitchCase;
//Duplicate is not allowed in Switch case
public class Test {
    public static void main(String[] args)
    {
        int a=20;
        switch (a)
        {
            case 10:System.out.println("10");
                break;
            case 20:System.out.println("20");
                break;
            case 30:System.out.println("30");
                break;
            case 40:System.out.println("40");
                break;
            default:System.out.println("default");
                break;
        }
    }

}
