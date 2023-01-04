package inClassDay06_12_2022;

public class TestMethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class hhgf{
	public int sum(int x,int y) {
		System.out.println("Sum: "+ (x+y));
		return 0;
		
	}
}
class jhg extends hhgf{
	public int sum(int x,int y) {
		return (x+y);
	}
}
