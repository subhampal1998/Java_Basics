class PatSt
{
    public void disp(String a)
    {
        a=" "+a;
        int l=a.length();
        String w="";
        for(int i=l-1;i>=0;i--)
        {
            char b=a.charAt(i);
            if(b!=' ')
            w=b+w;
            else
            {
                System.out.print(w+" ");
                w="";
            }
        }
    }
}
            