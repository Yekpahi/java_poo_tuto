package javaPoo.cl;



public class Main {

	
	public static <E> void display(E[] tab) {
		for (E e : tab) {
			System.out.printf("%s", e);
		}
	}
	public static void main(String[] args) {

		Integer[] i = {1, 2, 3};
		System.out.println("Tableau des entiers : ");
		display(i);
		
		String[] c = {"A", "B", "C"};
		System.out.println("\nTableau des caractères : ");
		display(c);
	}

}
