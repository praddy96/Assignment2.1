import java.io.*;
public class sum3{
public static int sum(int n1, int n2) {
   int sum=n1+n2;
   return sum; 
}
public static void main(String[] args) throws Throwable, IOException{
	int d = 0, e = 0, f;
	BufferedReader BR= new BufferedReader( new InputStreamReader(System.in));

	System.out.println("First number is:" );
		d=Integer.parseInt(BR.readLine());
		System.out.println("Second number is:");
		e=Integer.parseInt(BR.readLine());
	
	f=sum(d, e);
	System.out.println("\nSum of two numbers:"+ f);
}
}