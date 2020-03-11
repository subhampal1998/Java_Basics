class Wordss
{
    public void disp(String a)
    {
        int l=a.length();
        String w="";
        for(int i=0;i<l;i++)
        {
            char b=a.charAt(i);
            if(b==' ')
                {
                    int y=w.length();
                    for(int j=0;j<y-1;j++)
                      {
                        char x=w.charAt(j);
                        char x2=w.charAt(j+1);
                        if(x==x2)
                        System.out.println(w);
                    }
                    w="";
                }
                else
                        w=w+b;
                    }
                }
            }
        