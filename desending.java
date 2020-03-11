class desending extends positive
{
public void disp(String a)
{
int l=a.length();
for(int i=90;i>=65;i--)
{
for(int j=0;j<l;j++)
{
char c=a.charAt(j);
int x=(int)c;
if(i==x)
System.out.print(c);
}
}
}
}
