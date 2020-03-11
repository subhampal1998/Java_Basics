class pat
{
    public void disp(int n, double a)
    {
        double s=0.0;
        for(int i=2;i<=n;i=i+i)
        {
            s=s+a/i;
        }
        System.out.println(s);
    }
}
