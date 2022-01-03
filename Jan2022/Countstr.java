package practice;

public class Countstr {
	
	public static void main(String args[])
	{
		int count=0;
		String s = "Maveric - systems";
	
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			count++;
		}
		System.out.println("Count is : "+count);
	}

}
