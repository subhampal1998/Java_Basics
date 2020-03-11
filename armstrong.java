 class armstrong
{
public void disp(int n)
{
 int t=n;
 int sum=0;
 while(t>0)
 
 {
     int r=t%10;
     sum=sum+(r*r*r);
     t=t/10;
    }
    if(sum==n)
    System.out.println("armstrong");
    else
    System.out.println("not armstrong");
}
}
