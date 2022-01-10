package javaPractice;

public class ReverseEachWord {

	public static void main(String[] args) {
		
		String Str="Suresh Selenium Training";
		
		String[] words=Str.split("  ");// splitting words into multiple words
		
		String reverseString="";
		for(String w:words) {
			String reverseword= "";
			
			for(int i=w.length()-1;i>=0;i--){      //selenium
				
				reverseword=reverseword+w.charAt(i);
				System.out.println(reverseword);
			}
		}

	}

}
