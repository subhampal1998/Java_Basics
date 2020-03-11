import java.io.*;
class Buffeeer
{
    public void disp()throws IOException
    {
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        for(int i=1;i<=5;i++)
        {
        System.out.println("Enter number");
        int n=Integer.parseInt(r.readLine());
        sum=sum+n;
    }
        System.out.println(sum);
    }
}