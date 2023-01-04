package inClassDay08_12_2022.ExceptionHandling;

public class ThrowInException {

	public static void main(String[] args)  throws DepositExeption{
		int deposit = Integer.parseInt(args[0]);
		
		
			if(deposit<1000) {
				throw new DepositExeption("minimum deposit is 1000/-");
			}
	
		/*catch(DepositExeption e) {
			e.printStackTrace();
		}*/

	}

}
class DepositExeption extends Exception{
	public DepositExeption(String msg) {
		super(msg);
		
	}
}
