class string 
{
    public void disp(String a)
    {
        a=a+" ";
        int la=0;
        String lar="";
        int sm=a.length();
        String sma="";
        int l=a.length();
        String w="";
        for(int i=0;i<l;i++)
        {
            char b=a.charAt(i);
            if(b!=' ')
            w=w+b;
            else
        {
            int lw=w.length();
            if(lw>la)
            {
            la=lw;
            lar=w;
        }
            if(lw<=sm&&lw!=0)
            {
            sm=lw;
            sma=w;
        }
        w="";
        }
    }
        System.out.println(lar);
        System.out.println(sma);
    }
}