package inClassDay05_12_2022;

//Simple Inner class

public class InOut {
	public static void main(String args[]) {
		 Outer out = new Outer();
		 out.showMessage();
		// Outer.Inner in = out.new Inner();
		// in.display();
	 }
}
class Outer {
	private int x = 10;

	public void showMessage() {
		System.out.println("From Outer x=" + x);
		//System.out.println("from outer Y inout obj = "+ y);
		System.out.println("from Outer y ="+in.y);
		in.display();
	}

	private class Inner {
		private int y = 20;

		public void display() {
			System.out.println("from Inner x = " + x + " y=" + y);
		}
	}
	Inner in = new Inner();
}



