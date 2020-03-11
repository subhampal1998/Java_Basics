import java.util.Scanner;
class scnn
{
    public void disp()
    {
        Scanner scan= new Scanner(System.in);
        int num1,num2;
        System.out.print("1 number");
        num1=scan.nextInt();
        System.out.print("2 number");
        num2=scan.nextInt();
        System.out.println(num1+num2);
        scan.close();
    }
}