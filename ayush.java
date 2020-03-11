import java.io.*;
class ayush
{
   public void display()throws IOException
   {
       BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
       int v=0;
       int c=0;
       int d=0;
       int sc=0;
       System.out.println("Enter a String");
       String a=r.readLine();
       int l=a.length();
       for(int i=0;i<=l-1;i++)
       {
           char ch=a.charAt(i);
           if(ch>=65&&ch<=90)
           {
               if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                v++;
               else
                c++;
           }
           else if(ch>=96&&ch<=122)
           {
               if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                v++;
               else
                c++;
           }
           else if(ch>='0'&&ch<='9')
            d++;
           else
            sc++;
       }
       System.out.println("Number of vowels= "+v);
       System.out.println("Number of consonauts= "+c);
       System.out.println("Number of digits= "+d);
       System.out.println("Number of special characters= "+sc);
    }
}
                