class primereturn
 {
   public boolean disp(int p)
     {
          for(int i=2;i<=Math.sqrt(p);i++)
           {
               if(p%i==0)
               return false;
            }
               return true;
        }
    }

    
