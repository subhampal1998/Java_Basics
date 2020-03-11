class dup
    {
        public void disp(String a)
        {
            int l=a.length();
            String w="";
            for(int i=0;i<l-1;i++)
            {
                char b=a.charAt(i);
                for(int j=i+1;j<l;j++)
                {
                    char x=a.charAt(j);
                    if(b==x)
                    {
                        int len=w.length();
                        if(w==" ")
                        w=w+b;
                        else
                        {
                            int f=0;
                            for(int k=0;k<len;k++)
                            {
                                char z=w.charAt(k);
                                if(z==b)
                                {
                                    f=1;
                                    break;
                                }
                            }
                            if(f==0)
                            w=w+b;
                        }
                    }
                }
            }
            System.out.print("Duplicate characters are "+w);
        }
    }