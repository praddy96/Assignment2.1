import java.util.*;
class prg7{
	public static void main(String args[]){
		int n,i;
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		int arr1[] = new int[n];
		for(i=0;i<n;i++){
			arr1[i] = scan.nextInt();
		}
		scan.close();
		Arrays.sort(arr1);
		System.out.println("The sorted array is:" + Arrays.toString(arr1));
		
	}
}