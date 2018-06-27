import java.util.*;
class Adder{  
static int add(int a)
	{
		return a;
		}	
static int add(int a,int b)
{
	return a+b;
	}  
static int add(int a,int b,int c){
	return a+b+c;
	}
static int add(int a,int b,int c, int d)
{
	return a+b+c+d;
	}
static int add(int a,int b, int c, int d, int e)
{
	return a+b+c+d+e;
	}
}  
class prg6{  
public static void main(String[] args){
int n,q,r,s,t,u;
int sum = 0;
Scanner sca = new Scanner(System.in);
System.out.println("Enter number of numbers to be added(max 5):");
n=sca.nextInt();
if(n==1){
	System.out.println("Enter the numbers:");
	q=sca.nextInt();
	sum=Adder.add(q);
	System.out.println("The sum of the numbers is:" + sum);
}
else if(n==2){
	System.out.println("Enter the numbers:");
	q=sca.nextInt();
	r=sca.nextInt();
	sum=Adder.add(q, r);
	System.out.println("The sum of the numbers is:" + sum);
}
else if(n==3){
	System.out.println("Enter the numbers:");
	q=sca.nextInt();
r=sca.nextInt();
	s=sca.nextInt();
	sum=Adder.add(q, r, s);
	System.out.println("The sum of the numbers is:" + sum);
}
else if(n==4){
	System.out.println("Enter the numbers:");
	q=sca.nextInt();
	r=sca.nextInt();
	s=sca.nextInt();
	t=sca.nextInt();
	sum=Adder.add(q, r, s, t);
	System.out.println("The sum of the numbers is:" + sum);
}
else if(n==5){
	System.out.println("Enter the numbers:");
	q=sca.nextInt();
	r=sca.nextInt();
	s=sca.nextInt();
	t=sca.nextInt();
	u=sca.nextInt();
	sum=Adder.add(q, r, s, t, u);
	System.out.println("The sum of the numbers is:" + sum);
	
}
sca.close();
}
}  