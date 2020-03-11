class dup2
    {
        public void disp(String a)
        {
            int l=a.length();
            
            for(int i=0;i<l-1;i++)
            {
                char b=a.charAt(i);
                for(int j=i+1;j<l;j++)
                {
                    char x=a.charAt(j);
                    if(b==x)
                    {
                        System.out.println(b);
                        break;
                    }
                }
            }
        }
    }
                       