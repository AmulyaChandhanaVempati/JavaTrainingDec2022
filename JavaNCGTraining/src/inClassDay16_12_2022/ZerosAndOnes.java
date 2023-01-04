package inClassDay16_12_2022;

import java.util.Scanner;

public class ZerosAndOnes {
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		long n = 1010101000;
		String str = String.valueOf(n);
		System.out.println(str);
		int countOfZeros = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='0') {
				countOfZeros++;
			}
		}
		int countOfOnes = str.length()-countOfZeros;
		System.out.println(countOfOnes+" "+countOfZeros);
		String FinalStr="";
		for(int i=0;i<countOfZeros;i++) {
			FinalStr  = FinalStr+"0";
		}
		for(int i=0;i<countOfOnes;i++) {
			FinalStr +="1";
		}
		System.out.println(FinalStr);
	}

}
