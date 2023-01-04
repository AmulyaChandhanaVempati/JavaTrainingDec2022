package inClassDay06_12_2022;

public class MultiLevelInheritence {

	public static void main(String agrs[]) {
		C c1 = new C();
		System.out.println(c1.x + " " + c1.y + " " + c1.z);
		System.out.println("..............");
		c1.showC();
	}

}

class A {
	int x = 10;

	public A() {
		super();
		System.out.println("Class A");
	}

	public void showA() {
		System.out.println(x);
	}

}

class B extends A {
	int y = 20;

	public B() {
		super();
		System.out.println("Class B");
	}

	public void showB() {
		showA();
		System.out.println(y);
	}

}

class C extends B {
	int z = 30;

	public C() {
		super();
		System.out.println("Class C");
	}

	public void showC() {
		showB();
		System.out.println(z);
	}

}
