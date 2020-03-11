class prime
{
public void disp(int p)
{
int f=0;
for(int i=2;i<p;i++)
{
if(p%i==0)
{
System.out.println("not prime");
f=1;
break;
}
}
if(f==0)
System.out.println("prime");
}
}
