package inClassDay16_12_2022;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("ENter a String:");
		String str = sc.nextLine();
		char ch;
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else {
				map.put(str.charAt(i), 1);
			}
		}
		for(Map.Entry<Character, Integer> e: map.entrySet()) {
			System.out.println(e.getKey()+"  "+e.getValue());
			
		}
	}
}
