import java.io.*;
class project
{
public void disp()throws IOException
{
BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Choose the Program Type:-");
System.out.println("*************************");
System.out.println("(1) Area of a Square");
System.out.println("(2) Area of Rectangle");
System.out.println("(3) Area of Circle");
System.out.println("(4) Area of Triangle");
System.out.println("Enter your choice");
int ch1=Integer.parseInt(r.readLine());
switch(ch1)
{
case 1:
{
System.out.println("Enter the side of the Square=");
double s=Double.parseDouble(r.readLine());
double area=s*s;
System.out.println("***************************");
System.out.println("Area of the Square :"+area);
System.out.println("Do you want to continue? y or n ");
String x=r.readLine();
if(x.equals("y"))
disp();
else
System.out.println("Thank you");
break;
}
case 2:
{
System.out.println("Enter the length of the Rectangle=");
double r1=Double.parseDouble(r.readLine());
System.out.println("Enter the breath of the Rectangle=");
double l=Double.parseDouble(r.readLine());
double ar=2*(r1+l);
System.out.println("***************************");
System.out.println("Area of the Rectangle :"+ar);
System.out.println("Do you want to continue? y or n ");
String x=r.readLine();
if(x.equals("y"))
disp();
else
System.out.println("Thank you");
break;
}
case 3:
{
System.out.println("Enter the radius of the Circle =");
double ra=Integer.parseInt(r.readLine());
double cir=22.7*ra;
System.out.println("*************************");
System.out.println("Area of the Circle :"+cir);
System.out.println("Do you want to continue? y or n ");
String x=r.readLine();
if(x.equals("y"))
disp();
else
System.out.println("Thank you");
break;
}
case 4:
{
System.out.println("The Type of Triangle are:");
System.out.println("****************************");
System.out.println("(1) Equilateral Triangle");
System.out.println("(2) Isosceles Triangle");
System.out.println("(3) Scalene Triangle");
System.out.println("Enter your choice");
int tri=Integer.parseInt(r.readLine());
switch(tri)
{
case 1:
{
System.out.println("Enter the Side of equilateral Triangle");
double eq=Double.parseDouble(r.readLine());
double are=(Math.sqrt(3))/4*eq*eq;
System.out.println("*****************************");
System.out.println("Area of the triangle :"+are);
System.out.println("Do you want to continue? y or n ");
String x=r.readLine();
if(x.equals("y"))
disp();
else
System.out.println("Thank you");
break;
}
case 2:
{
System.out.println("Enter a height of Isosceles Triangle");
double iso=Double.parseDouble(r.readLine());
System.out.println("Enter the base of Isosceles Triangle");
double ba=Double.parseDouble(r.readLine());
double ari=(1/2)*ba*iso;
System.out.println("*************************************");
System.out.println("Area of the Isosceles Triangle :"+ari);
System.out.println("Do you want to continue? y or n ");
String x=r.readLine();
if(x.equals("y"))
disp();
else
System.out.println("Thank you");
break;
}
case 3:
{
System.out.println("Enter the 1st side of the Scalene Triangle :");
double s1=Double.parseDouble(r.readLine());
System.out.println("Enter the 2nd side of the Scalene Triangle :");
double s2=Double.parseDouble(r.readLine());
System.out.println("Enter the 3rd side of the Scalene Triangle :");
double s3=Double.parseDouble(r.readLine());
double s=(s1+s2+s3)/2.0;
double sx=s*(s-s1)*(s-s2)*(s-s3);
double sar=(Math.sqrt(sx));
System.out.println("********************************");
System.out.println("Area of Scalene Triangle :"+sar);
System.out.println("Do you want to continue? y or n ");
String x=r.readLine();
if(x.equals("y"))
disp();
else
System.out.println("Thank you");
break;
}
default:
System.out.println("Wrong choice");
System.out.println("Do you want to continue? y or n ");
String x=r.readLine();
if(x.equals("y"))
disp();
else
System.out.println("Thank you");
}
}
break; 
default:
System.out.println("Wrong choice");
System.out.println("Do you want to continue? y or n ");
String x=r.readLine();
if(x.equals("y"))
disp();
else
System.out.println("Thank you");
}
}
}
