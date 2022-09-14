package javaPoo.cl;

/*class Car {
	public String name;
	
	public void present() {
		System.out.println("My name is " + name);
	}
}
*/
class Encap {
	private String ville;
	
	public String getVille () {
		return ville;
	}
	
	public String setVille (String nomVille) {
		return this.ville = nomVille;
	}
}

public class Main {
	/*
	int a;
	
	public Main(int c) {
		this.a = c;
	}
	static void myMethod() {
	    System.out.println("Hello World!");
	  }
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		Car c1 = new Car();
		c1.name = "Belley";
		c1.present();
		System.out.println(c1.name);
		 myMethod();
		 Main bx = new Main(10);
		 int z = bx.a;
		 System.out.println(z);
		 */
		
		Encap en1 = new Encap();
		
		en1.setVille("Man");
		 System.out.println(en1.getVille());
		
	}

}
