import java.io.*;
class Calculator
{
    private int add(int a,int b)
    {
        return a+b;
    }
    private int sub(int a,int b)
    {
        return a-b;
    }
    private int mult(int a,int b)
    {
        return a*b;
    }
    private int div(int a,int b)
    {
        return a/b;
    }
    public void main()throws IOException
    {
        InputStreamReader x=new InputStreamReader(System.in);
        BufferedReader r=new BufferedReader(x);
        System.out.println("Choose your option:");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        int n=Integer.parseInt(r.readLine());
        System.out.println("Enter two numbers");
        int a=Integer.parseInt(r.readLine());
        int b=Integer.parseInt(r.readLine());
        switch(n)
        {
            case 1:
            System.out.println("The sum is: "+add(a,b));
            break;
            case 2:
            System.out.println("The substraction is: "+sub(a,b));
            break;
            case 3:
            System.out.println("The multiplication is: "+mult(a,b));
            break;
            case 4:
            System.out.println("The division is: "+div(a,b));
            default:
            System.out.println("Invalid choice");
        }
        System.out.println("Press y for continue or n for stop");
        String q=r.readLine();
        if(q.equals("y"))
        main();
        else
        System.out.println("Thank you");
    }
}
        
        