class brac1
{
    public void disp(String a)
    {
        int l=a.length();
        int count=0;
        int count1=0;
        for(int i=0;i<l;i++)
        {
            char b=a.charAt(i);
            if(b=='[')
            count++;
            else if(b==']')
            {
                count--;
                if(count<0)
                {
                    count1++;
                    count++;
                }
            }
        }
        if(count==0&&count1==0)
        System.out.println("No errors");
        else
        System.out.println("Number of errors: "+(count1+count));
    }
}
        