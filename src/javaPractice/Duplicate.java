package javaPractice;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		 
		 String infra [] = {"Amazon","GCP","Azure","Amazon","AliBaba","SauceLabs","Azure","GCP"};
		 
		 //Approach1(hash map stores the value in key and value pair format)
		// Approach 2 (hash set)
		
		 System.out.println("*************hash set***************");
		  //HashSet =class
		 Set<String> data = new HashSet<String>();    //set = interface ; creating object for Set :data
	
		 //property of Hashset is it cannot store duplicate elements
		
		 for(String e : infra) {	// e will check one by one in the array										
			
			 if(data.add(e)==false) { // 
				 
				 System.out.println(e);
			 }
		 }
}
}