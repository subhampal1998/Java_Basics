import java.io.*;
class brac
    {
        public void disp()throws IOException
        {
            BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
            int count=0;
            int count1=0;
            for(int i=0;;i++)
            {
                System.out.println("Enter Bracket or full-stop to stop");
                String a=r.readLine();
                if(a.charAt(0)=='[')
                count++;
                else if(a.charAt(0)==']')
                {
                    count--;
                    if(count<0)
                    {
                        count1++;
                        count++;
                    }
                }
                else if(a.charAt(0)=='.')
                break;
            }
            if(count==0&&count1==0)
            System.out.println("No errors");
            else
            System.out.println("Number of errors: "+(count+count1));
        }
    }