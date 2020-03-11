import java.io.*;
class sec
    {
        public void disp()throws IOException
        {
            BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the number of numbers you want");
            int n=Integer.parseInt(r.readLine());
            int l1=0;
            int l2=0;
            for(int i=1;i<=n;i++)
            {
                System.out.println("Enter number");
                int x=Integer.parseInt(r.readLine());
                if(x>l1)
                {
                    l2=l1;
                    l1=x;
                }
            }
            System.out.println("Second Largest: "+l2);
        }
    }
