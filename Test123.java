import java.util.Scanner; 
 
 
class Test123
{
 public void main()
	{
     int age;
	float amount;
	String name;
	Scanner in = new Scanner(System.in);
	
	for(int i=1;i<=10;i++)
	{
	
  	System.out.println("Enter Your Name");	
	name=in.nextLine();
	
	System.out.println("Enter Your Age");	
	age=in.nextInt();
 
	System.out.println("Enter Your Amount");	
	amount=in.nextFloat();
 
		System.out.println("You Nameis "+name);
 		System.out.println("You Age is "+age);
 		System.out.println("You Amount is "+amount);
 		//sc.nextLine();
		}
}
}