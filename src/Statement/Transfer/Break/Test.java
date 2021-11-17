package Statement.Transfer.Break;
//- we are able to use the break statement only two places if we are using any other place the
//compiler will raise compilation error(1.inside switch or loop)
public class Test {
    public static void main(String[] args)
    {
        for (int i=0;i<10;i++)
        {
            if (i==5)
            {
                break;
            }
            System.out.println(i);
        }
    }
}
