class india
{
    public void disp()
    {
        String a="INDIA";
        int l=a.length();
        for(int i=0;i<=l-1;i++)
        {
            for(int j=0;j<=l-1-i;j++)
            {
                System.out.print(a.charAt(j));
            }
            System.out.println();
        }
    }
}
