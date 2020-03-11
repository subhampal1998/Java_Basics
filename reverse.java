class reverse
{
   public void display(String a)
   {
       int l=a.length();
       for(int i=l-1;i>=0;i--)
       {
           System.out.print (a.charAt(i));
        }
    }
}