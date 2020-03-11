class BinDec
{
    public void disp(long n)
    {
        long t=n;
        long dec=0;
        int c=0;
        
        while(t>0)
        {
            long r=t%10;
            dec=dec+r*(long)Math.pow(2,c);
            c++;
            t=t/10;
        }
        System.out.println(dec);
    }
}