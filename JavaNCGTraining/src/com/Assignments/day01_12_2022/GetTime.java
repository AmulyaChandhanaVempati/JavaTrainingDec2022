package com.Assignments.day01_12_2022;

import java.util.Scanner;

public class GetTime {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Time t = new Time();
		System.out.println("Enter the number of hours: ");
		int hours = sc.nextInt();
		t.setHours(hours);
		System.out.println("Enter the number of minutes: ");
		int minutes = sc.nextInt();
		t.setMinutes(minutes);
		System.out.println("Enter the number of seconds: ");
		int seconds = sc.nextInt();
		t.setSeconds(seconds);
		System.out.println("The time is "+t.getHours()+":"+t.getMinutes()+":"+t.getSeconds());
	}
}

class Time {
	private int hours;
	private int minutes;
	private int seconds;
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = validateHours(hours);
	}
	private int validateHours(int hours) {
		if( hours>23) {
			return hours%24;
		}
		else if (hours<0) {
			return 0;
		}
		return hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = validateMinutes(minutes);
	}
	private int validateMinutes(int minutes) {
		if( minutes>59) {
			return (minutes%60);
		}
		else if (minutes<0) {
			return 0;
		}
		return minutes;
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = validateSeconds(seconds);
	}
	private int validateSeconds(int seconds) {
		if( seconds>59) {
			return (seconds%60);
		}
		else if (seconds<0) {
			return 0;
		}
		return seconds;
	}
}
