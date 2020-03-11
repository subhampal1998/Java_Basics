class seris
{
public void disp(int n)
{
double s=1.0;
int sum=0;
int product=1;
for(int i=2;i<=n-1;i++)
{
sum=0;
product=1;
for(int j=1;j<=i;j++)
{
sum +=j;
product*=j;
}
s+=(sum/product);
}
System.out.println(s);
}
}