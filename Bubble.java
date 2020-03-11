class Bubble
{
    private void swap(int a[])
    {
        int l=a.length;
        for(int i=0;i<l-1;i++)
        {
            for(int j=0;j<l-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<l;i++)
        System.out.print(a[i]+" ");
    }
    public void main(int n[])
    {
        Bubble x=new Bubble();
        x.swap(n);
    }
}
        
        