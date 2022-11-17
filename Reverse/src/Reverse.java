import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		  String str;
	         
	        // Taking input through the console using Scanner Class
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter your String");
	        str = in.nextLine();
	         
	        /*
	         * Splitted each character of the String and then
	         * printed the same in the reverse order using
	         * for loop
	         */
	        String[] split = str.split("");
	        for(int i=split.length-1; i>=0; i--)
	        {
	            System.out.print(split[i] + "");
        }
    }

 
	}



