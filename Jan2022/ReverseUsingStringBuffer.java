package practice;

public class ReverseUsingStringBuffer {

	public static void main(String[] args) {
		
		String s ="Maveric-systems";
		String r = new StringBuffer(s).reverse().toString();
		
		System.out.println(s);
		System.out.println(r);
			
	}

}
