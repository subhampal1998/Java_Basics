class test2
{
    public void disp(int a, int b)
    {
        int gr=0;
        int sm=0;
        if(a>b)
        gr=a;
        else
        sm=b;
        if(b>a)
        gr=b;
        else
        sm=a;
        for(int i=sm;;i--)
        {
            if(a%i==0&&b%i==0)
            {
                System.out.println("HCF is "+i);
                break;
            }
        }
        for(int i=gr;;i++)
        {
            if(i%a==0&&i%b==0)
            {
                System.out.println("LCM is "+i);
                break;
            }
        }
    }
}