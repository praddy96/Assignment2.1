
import java.util.*;
class prg5{
	public static void main(String[] args){
		int p;
		int i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to fint the first 10 multiples:");
		p = s.nextInt();
		s.close();
		System.out.println("The ten multiples are as under:");
		for(i=1;i<11;i++){
			System.out.println(p+"*"+i+" =" + p*i);
			
		}
	}
	
}