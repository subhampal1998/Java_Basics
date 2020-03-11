class Diganta
{
    public String display ()
    {
        String w=" ";
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=i;j++)
            {
                w=w+j+" "+"/n";
            }
        }
        return w;
    }
}
