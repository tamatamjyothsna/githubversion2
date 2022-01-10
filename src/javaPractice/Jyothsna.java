package javaPractice;



interface jo {
	public void Adisplay();
	public void Ashow();
	
}
interface bhavi {
	public void Bdisplay();
	public void Bshow();
	
}

public class Jyothsna implements jo,bhavi{
	

	public static void main(String[] args) {
		Jyothsna obj = new Jyothsna();
		obj.Adisplay();
		obj.Ashow();
		obj.Bdisplay();
		obj.Bshow();
		

	}


	public void Bdisplay() {
		System.out.println("Bdisplay");
		
	}

	
	public void Bshow() {
		System.out.println("BShow");
		
	}

	
	public void Adisplay() {
		System.out.println("Adisplay");	
	}

	
	public void Ashow() {
		System.out.println("Ashow");
		
	}

}


