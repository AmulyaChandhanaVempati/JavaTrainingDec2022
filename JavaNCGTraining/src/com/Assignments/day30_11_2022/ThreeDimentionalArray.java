package com.Assignments.day30_11_2022;

public class ThreeDimentionalArray {
	public static void main(String args[]) {
		int[][][] arr = {
				           { 
				        	   {14,23,36,94,85},
				        	   {10,20,30,40,50},
				        	   {15,27,38,42,57}
				           },
				           {   
				        	   {11,22,33,44,55},
				        	   {14,26,38,42,54},
				        	   {19,82,39,47,45}
				           }
		                };
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<5;k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
