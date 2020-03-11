import java.io.*;
class rem
    {
        public void disp()throws IOException
        {
            BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter word");
            String n=r.readLine();
            System.out.println("Enter char to be deleted");
            String x=r.readLine();
            int l=n.length();
            String w="";
            for(int i=0;i<l;i++)
            {
                char b=n.charAt(i);
                if(b!=x.charAt(0))
                w=w+b;
            }
            System.out.println("New word "+w);
            System.out.println("Continue? Press Y or N");
            String z=r.readLine();
            if(z.equals("Y"))
            disp();
            else
            System.out.println("Thank You");
        }
    }