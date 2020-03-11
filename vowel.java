class vowel
{
public void disp(String a)
{
int m=0;
int l=a.length();
for(int i=0;i<=l-1;i++)
{
char b=a.charAt(i);
switch(b)
{
case 'A':
case 'a':
case 'E':
case 'e':
case 'I':
case 'i':
case 'O':
case 'o':
case 'U':
case 'u':
m++;
break;
}
}
System.out.println(m);
}
}