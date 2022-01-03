package practice;

public class ReverseUsingForLoop {

	public static void main(String[] args) {
		
		String s ="Maveric-systems";
		
		System.out.println("Reverse of a String '"+s+"' is  :");
		for(int i=s.length();i>0;--i)
		{
			System.out.println(s.charAt(i-1));
		}
			
	}

}
