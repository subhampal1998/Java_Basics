class sort1
    {
        public void disp(String a)
        {
            int l=a.length();
            for(int i='A';i<='Z';i++)
            {
                for(int j=0;j<l;j++)
                {
                    char b=a.charAt(j);
                    if(b==i||(i+32)==b)
                    System.out.print(b);
                }
            }
        }
    }