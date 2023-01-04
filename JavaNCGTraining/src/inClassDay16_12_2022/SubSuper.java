package inClassDay16_12_2022;

class Super{
	public void printIt() {
		System.out.println("Super Class");
	}
	public void printIt(boolean print) {
		if(print) {
			System.out.println("Super Part 2");
		}
		else {
			printIt();
		}
	}
}
class subClass extends Super{
	public void printIt() {
		System.out.println("sub Class");
	}
}
public class SubSuper {
	public static void main(String[] args) {
		Super s = new subClass();
		s.printIt();
		s.printIt(false);
		char ch = '\u0042';
		System.out.println(ch);
	}
}
