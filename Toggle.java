import java.util.*;

public class Toggle{

	public static String toggle(String s){
		
		StringBuilder str=new StringBuilder(s.length());
		
		for(char x: s.toCharArray()){
			
			if(Character.isUpperCase(x)){
				
				x=Character.toLowerCase(x);
			}
			else{
				
				x=Character.toUpperCase(x);
			}
			str.append(x);
		}
		return str.toString();
		
	}
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		String s=sc.nextLine();
		
		System.out.println(toggle(s));

		sc.close();
	}

}