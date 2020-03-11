class abcc
{
    public void disp(int a, int b, int n)
    {
        switch(n)
        {
            case 1:
            System.out.println(a+b);
            break;
            case 2:
            System.out.println(a-b);
            break;
            case 3:
            System.out.println(a*b);
            break;
            case 4:
            System.out.println(a/b);
            break;
            default:
            System.out.println("Invalid Choice");
        }
    }
}
