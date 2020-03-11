import java.util.*;
import java.io.*;
class Tests
{
    public void disp()throws IOException
    {
        Scanner sc=new Scanner(new File("dook.txt"));
        int count=0;
        while(sc.hasNext())
        {
            sc.next();
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}