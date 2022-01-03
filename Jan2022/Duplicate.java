package practice;

public class Duplicate {

	public static void main(String[] args) {

		String s="Java Programming";
		char[] c = s.toCharArray();
		
		System.out.println("Duplicate characters in a given string: ");
		
		for(int i=0; i<s.length(); i++)
			for(int j=i+1; j<s.length(); j++)
			{
				if(c[i]==c[j])
				{
					System.out.println(c[j]+"");
				}
			}
		
	}

}

