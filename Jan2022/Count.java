package Jan2022;

public class Count {
	
	public static void main(String[] args)
	{
		int count = 0;
		
		String s="udayashankar ramamoorthy";

		for (int i=0; i< s.length(); i++)
		{
			if(s.charAt(i)!=' ')
			count++;
		}
		System.out.println("Count: "+count);
	}

}
