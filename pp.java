class pp
{
   public boolean prime(int a)
   {
       int f=0;
       for(int i=2;i<=Math.sqrt(a);i++)
       {
           if(a%i==0)
           {
               f=1;
               break;
           }
       }
       if(f==1)
       return false;
       return true;
   }
   public boolean palindrome(int a)
   {
       int sum=0;
       int t=a;
       while(t>0)
       {
           int r=t%10;
           sum=sum*10+r;
           t=t/10;
       }
       if(sum==a)
       return true;
       return false;
    }
   public void display()
   {
       for(int i=100;i<=1000;i++)
       {
           if(prime(i)&&palindrome(i))
           System.out.println(i);
       }
   }
}