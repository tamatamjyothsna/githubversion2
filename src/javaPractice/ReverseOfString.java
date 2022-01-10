package javaPractice;

public class ReverseOfString {
	
	public static void main(String[] args) {
// 1) Using +(string concatenation)operator
	// length method
	//2) char method	
	
	String Str="Suresh Selenium Training";
	String rev="";  // rev to store rev value
	 String[] words = Str.split("");
	
	int len= Str.length(); // to find length of a string 
	// extract the specific character from the sting
	
	for(int i=len-1;i>=0;i--) {
	rev =rev+Str.charAt(i);
	
}
	System.out.println("Reversed String is :"+ rev);
}
	}