class prim
    {
        public void disp(int a,int b)
        {
            for(int i=a;i<=b;i++)
            {
                int f=0;
                for(int j=2;j<=i/2;j++)
                {
                    if(i%j==0)
                    {
                        f=1;
                        break;
                    }
                }
                if(f==0)
                System.out.println(i);
            }
        }
    }
                