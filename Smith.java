class Smith
{
    public void disp(int n)
    {
        int c=2;
        int t=n;
        int sum=0;
        if(prime(n)==n)
        System.out.println("Not");
        else
        {
       while(n!=1)
       {
        if(prime(c)==c)
            {
             if(n%c==0)
             {
                 n=n/c;
                 while(c>0)
                 {
                 int x=c%10;
                 sum=sum+x;
                 c=c/10;
                }
                 c=2;
                }
                else
                c++;
            }
            else
            c++;
        }
        int sum1=0;
        while(t>0)
        {
            int r=t%10;
            sum1=sum1+r;
            t=t/10;
        }
        if(sum==sum1)
        System.out.println("Smith");
        else
        System.out.println("Not");
    }
}
        private int prime(int n)
        {
            int f=0;
            for(int i=2;i<=n/2;i++)
            {
             if(n%i==0)
             {
                 f=1;
                 break;
                }
            }
             if(f==0)
             return n;
             return -1;
            }
        }