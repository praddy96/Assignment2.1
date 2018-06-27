
import java.util.Scanner;
class numbers{
	
	public static void main(String[] args){
		int x,i;
		int y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		x = sc.nextInt();
		System.out.println("Enter the second number:");
		y = sc.nextInt();
		sc.close();
		int n = (y-x)-1;
		int arr[] = new int[10];
		for(i = 0; i<n; i++){
			x = x+1;
			arr[i]= x;
			System.out.println(" " + arr[i]);
		}
		System.out.println("The Even numbers between the two numbers are: ");
		for(i=0;i<n;i++){
			if(arr[i]%2==0){
				System.out.println(" " + arr[i]);
			}
		}
		System.out.println("The Odd numbers between the two numbers are: ");
		for(i=0;i<n;i++){
			if(arr[i]%2!=0){
				System.out.println(" " + arr[i]);
			}
		}
		
	}
}