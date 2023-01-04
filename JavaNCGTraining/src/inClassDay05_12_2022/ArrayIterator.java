package inClassDay05_12_2022;

// Example of nested classes , 
public class ArrayIterator {

	public static void main(String[] args) {
		IntArray ia = new IntArray(5);
		IntArray.IntIterator itr = ia.getIntIerator();
		while(itr.hasNextElement()) {
			System.out.println(itr.nextElement());
		}

	}

}
class IntArray{
	int[] array;
	public IntArray(int n) {
		array = new int[n];
	}
	public IntIterator getIntIerator() {
		return new IntIterator();
	}
	class IntIterator{
		private int index =0;
		private IntIterator() {}
		public boolean hasNextElement() {
			return index < array.length;
		}
		public int nextElement() {
			return array[index++];
		}
	}
}
