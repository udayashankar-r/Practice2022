package practice;

public class Duplicate1 {

	public static void main(String[] args) {
		String s = "Java Programming";  
        int count;  
          
        //Converts given string into character array  
        char c[] = s.toCharArray();  
          
        System.out.println("Duplicate characters in a given string: ");
        //Counts each character present in the string  
        for(int i = 0; i <s.length(); i++) {  
            count = 1;  
            for(int j = i+1; j <s.length(); j++) {  
                if(c[i] == c[j] && c[i] != ' ') {  
                    count++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    c[j] = '0';  
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && c[i] != '0')  
                System.out.println(c[i]);  
        }  
	}

}
