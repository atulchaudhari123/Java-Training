package JavaBasics;

public class B extends A {

	public B() {
		super(); // Super keyword is the first statement
		System.out.println("Child default constructor");
	}

	public B(int i) {
		super(i);
		System.out.println("Child 1 parameter constructor");
	}

	public B(int i, int j) {
		super(i, j);
		System.out.println("Child 2 parameter constructor");
	}

	public static void main(String[] args) {
		B b = new B();
		B b1 = new B(10);
		B b2 = new B(30, 20);
	}
}
