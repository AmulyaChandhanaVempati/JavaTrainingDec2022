package inClassDay16_12_2022;

class x {
	public int i=5;
}
class y extends x{
	public int i=10;

}
public class test {

	public static void main(String[] args) {
		x X = new y();
		System.out.println(X.i);

	}

}
