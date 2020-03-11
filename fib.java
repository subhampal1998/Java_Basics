class fib
{
    public void disp(int n)
    {
        int a=0;
        int b=1;
        int c=a+b;
        System.out.print(a+" "+b+" ");
        for(int i=1;;i++)
        {
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
            if(c>n)
            break;
        }
    }
}