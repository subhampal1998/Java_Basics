import java.io.*;
class HelloWorld { 

   public  void main()throws IOException { 
 
   BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
   String s=r.readLine();
   int l=s.length();
   int n=Integer.parseInt(r.readLine());
   char b[]=new char[l];
   for(int i=0;i<l;i++)
   {
    b[i]=s.charAt(i);
    }
    String c[]=new String[n];
    int lt[]=new int[n];
    int xl[]=new int[n];
    for(int i=0;i<n;i++)
    {
      c[i]=r.readLine();
      lt[i]=c[i].length();
      }
      
      for(int i=0;i<=n;i++)
      {
          
        char E[]=new char[lt[i]];
        for(int j=0;i<lt[i];i++)
       {
         E[j]=c[i].charAt(j);
       }
       for(int z=0;z<lt[i];z++)
      {
       for(int m=0;m<l;m++)
       if(b[m]==E[z])
       xl[i]=xl[i]+1;
      
      }
     }
     
     for(int jk=0;jk<n;jk++)
     {
       if(lt[jk]==xl[jk])
       System.out.println("Yes");
       else
       System.out.println("NO");
      }
     }
   }