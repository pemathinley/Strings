import java.util.*;

public class PalindromeS {

	public static boolean reverse(String s){
		
		StringBuffer str=new StringBuffer(s);
		
		str.reverse();
		
		if(s.equalsIgnoreCase(str.toString())){
			
			return true;
		}
		else 
			return false;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		String s1=sc.nextLine();
		
		System.out.println(reverse(s1));
		
		sc.close();
	}

}