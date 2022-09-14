package javaPoo.cl;

class Cat implements Animal {

	
	public void play() {
		System.out.println("Les chats aiment jouer sauter sauter!!");
	}

	public String dance() {
		String danse = "Gbegbe";
		return "J'aime danser " + danse;
	}
	
}


public class Main {

	public static void main(String[] args) {

	Cat c1 = new Cat();
	
	c1.play();
	System.out.println(c1.dance());
	}

}
