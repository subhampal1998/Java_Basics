class Lsearch
{
    public void disp(int a[],int n)
    {
        int x=0;
        int l=a.length;
        for(int i=0;i<l;i++)
        {
            if(a[i]==n)
            {
                x=1;
                System.out.println("Value is at "+i);
            }
        }
        if(x==0)
        System.out.println("Not Found");
        }
    }
