class palindrome
{
public void disp(String a)
{
String w="";
int l=a.length();
for(int i=l-1;i>=0;i--)
{
char b =a.charAt(i); 
w=w+b;
}
if(a. equals(w))
System.out.println("It's Palindrome");
else
System.out.println("It's not Palindrome");
}
}