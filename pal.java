class pal
    {
        public void disp(String a)
        {
            int l=a.length();
            String s="";
            String w="";
            for(int i=0;i<l;i++)
            {
                char b=a.charAt(i);
                if(b==' ')
                {
                    s=s+w.charAt(0)+".";
                    w="";
                }
                else
                w=w+b;
            }
            System.out.println(s+""+w);
        }
    }