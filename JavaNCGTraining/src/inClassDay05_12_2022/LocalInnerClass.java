package inClassDay05_12_2022;

// Example of Local Inner class
public class LocalInnerClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntArrays ia = new IntArrays(5);
		ia.printArrayElements();

	}
}

class IntArrays {
	int[] array;
	public IntArrays(int n) {
		array = new int[n];
	}
	public void printArrayElements() {
		class Iterator {
			private int index = 0;
			private Iterator() {
			}
			public boolean hasNextElement() {
				return index < array.length;
			}
			public int nextElement() {
				return array[index++];
			}
		}
		Iterator itr = new Iterator();
		while(itr.hasNextElement()) {
			System.out.println(itr.nextElement());
		}
	}
}