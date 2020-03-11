import java.io.*;
class maxmin
{
   public void display()throws IOException
   {
       BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
       int a=0;
       int n=0;
       System.out.println("Enter a number");
       int h=Integer.parseInt(r.readLine());
       n=h;
       for(int i=1;i<=9;i++)
       {
           System.out.println("Enter a number");
           int l=Integer.parseInt(r.readLine());
           if(n>l)
           {
               n=l;
            }
            if(l>a)
            {
                a=l;
            }
        }
        System.out.println("Minimum number ="+ n);
        System.out.println("Maximum number ="+ a);
    }
}
            
           