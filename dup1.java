class dup1
    {
        public void disp(String a)
        {
            int l=a.length();
            String w="";
            for(int i=0;i<=l-1;i++)
            {
                char ch=a.charAt(i);
                w=w+ch;
                int e=w.length();
                for(int j=0;j<=e-1;j++)
                {
                    if(j!=i)
                    {
                        char c=w.charAt(j);
                        if(ch==c)
                        {
                            System.out.println(ch);
                            break;
                        }
                    }
                }
            }
        }
    }