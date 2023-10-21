package java;

// the private can access within class only
public class PrivateModifier {
	public static void main(String[] args) {
		// and if we make constructor as private then we are not able to create object for that constructor
		//A a = new A();
		// this statement will not be execute it will hrow complie time error
		// System.out.println(a.age + "" + a.name);
	}
}

class A {
	private A() {
		
	}
	private int age = 22;
	private String name = "wasim";
}
