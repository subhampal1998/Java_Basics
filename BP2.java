import java.io.*;
class BP2
{
    public void disp()throws IOException
    {
       BufferedReader r=new BufferedReader (new InputStreamReader (System.in));
       String x="";
       for (int i=1;i<=10;i++)
       {
           System.out.println ("Enter any word");
           String a=r.readLine ();
           x=x+a.charAt (0);
        }
        System.out.println (x);
    }
}
       