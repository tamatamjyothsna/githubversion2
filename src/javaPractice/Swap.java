package javaPractice;

public class Swap {

	public static void main(String[] args) {
	int a= 10;
	int b =20;
	
	//before
	System.out.println("Before swapping: X= " +a+ " y="+b );
	 //swap 
	
	a=a+b;  // 10+20 = 30
	b=a-b;  // 30-20 = 10
	a=a-b;  // 30-21 =10
	
	//after
	System.out.println("After swapping : x= "+a+" y="+b);

	}

}
