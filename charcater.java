class charcater
{
public void disp( char a)
{
if(a>= 'A' && a<= 'Z')
System.out.println("Uppercase");
else if(a>='a' && a<='z')
System.out.println("Lowercase");
else if(a>='0' && a<='9')
System.out.println("Number");
else
System.out.println("Special Character");
}
}