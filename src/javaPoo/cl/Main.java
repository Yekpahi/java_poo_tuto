package javaPoo.cl;

public class Main {

	public static void main(String[] args) {

	OuterClass outter = new OuterClass();
	
	OuterClass.InnerClass inner = outter.new InnerClass();
	
	outter.x = 12;
	inner.str = "My classe interne";
	
	System.out.println(outter.x);
	System.out.println(inner.str);
	}

}
