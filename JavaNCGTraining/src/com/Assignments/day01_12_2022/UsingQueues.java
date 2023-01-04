package com.Assignments.day01_12_2022;

import java.util.Scanner;

public class UsingQueues {
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
	   Queue queue = new Queue();
	   queue.enqueue(10);
	   queue.enqueue(20);
	   queue.enqueue(30);
	   queue.enqueue(40);
	   queue.enqueue(50);
	   queue.enqueue(60);
	   queue.enqueue(70);
	   queue.enqueue(80);
	   queue.enqueue(90);
	   queue.enqueue(100);
	   queue.diaplay();
	   queue.enqueue(190);
	   queue.dequeue();
	   queue.dequeue();
	   queue.dequeue();
	   queue.diaplay();
	   queue.dequeue();
	   queue.diaplay();
	   queue.dequeue();
	   queue.diaplay();
	   queue.dequeue();
	   queue.dequeue();
	   queue.dequeue();
	   queue.dequeue();
	   queue.dequeue();
	   queue.dequeue();
	}

}
class Queue{
	private static int frontIdx = -1;
	private static int rearIdx = -1;
	private static int capacity = 10;
	private static int[] arr = new int[10];
	public static boolean isEmpty() {
        if(rearIdx==-1) {
        	return true;
        }
        return false;
	}

	public static boolean isFull() {
         if((rearIdx+1)==capacity) {
        	 return true;
         }
         return false;
	}
	public static void diaplay() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		else {
			for(int i=frontIdx;i<=rearIdx;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}

	public static void enqueue(int value) {
		if (isFull()) {
			System.out.println("Queue is full");
		} else {
			if (frontIdx == -1) {
				frontIdx = 0;
			}
			arr[++rearIdx] = value;
		}
	}

	public static void dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
		} else {
			if(rearIdx==0) {
				frontIdx=-1;
			}
			for (int i = 0; i < rearIdx; i++) {
				arr[i] = arr[i + 1];
			}
			rearIdx--;
		}
	}
}
