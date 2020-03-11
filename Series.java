class Series
{
    public void disp(double a)
    {
        double s=0.0;
        for(int i=2;i<=20;i=i+3)
        {
            s=s+(a/i);
        }
        System.out.println(s);
    }
}
        