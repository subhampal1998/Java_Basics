import java.util.*;
class TestInput
{
    public void display ()
    {
        Scanner sc=new Scanner (System.in);
        int roll; String name; double marks; double marks1;
        for (int i=1;i<=10;i++)
        {
            System.out.print ("Enter Roll Number: ");
            roll=sc.nextInt (); sc.nextLine();
            sc=new Scanner (System.in);
            System.out.print ("Enter Name: ");
            name=sc.nextLine ();
            System.out.print ("Enter marks: ");
            marks=sc.nextDouble ();
            System.out.print ("Enter marks: ");
            marks1=sc.nextDouble ();
            double marks2=(marks+marks1)/2;
            System.out.println (roll+" "+name+" "+marks2);
        }
        
    }
}
