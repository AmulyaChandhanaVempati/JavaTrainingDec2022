package inClassDay16_12_2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Repeating {
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
		ArrayList<Character> listOfRepeatCharacters = new ArrayList<>();
		ArrayList<Character> listOfNonRepeatCharacters = new ArrayList<>();
		for(Map.Entry<Character, Integer> e: map.entrySet()) {
			if(e.getValue()==1) {
				listOfNonRepeatCharacters.add(e.getKey());
			}
			else {
				listOfRepeatCharacters.add(e.getKey());
			}
		}
		System.out.println("List of Repeating Charcters: "+ listOfRepeatCharacters);
		System.out.println("List of Non Repeating CHaracters: "+ listOfNonRepeatCharacters);
	}
}
