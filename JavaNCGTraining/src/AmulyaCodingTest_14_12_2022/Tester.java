package AmulyaCodingTest_14_12_2022;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tester {
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		
		int movieId = 101;
		int noOftickets=1;
		boolean flag1 = true;
		boolean flag2 = true;
		displayFares();
		BookMyMovieImpl bookMyMovie = new BookMyMovieImpl();
		System.out.println("Enter the Movie Id: ");
		while(flag1) {
			try {
				try {
					movieId = sc.nextInt();
				}
				catch(InputMismatchException e) {
					System.out.println("Invalid MovieID \nPlease Enter A Valid Movie ID:");
					
				}
				if(!(movieId==101|| movieId==102||movieId==103)) {
					throw new InvalidMovieIdException("Movie Id is Invalid");
				}
				bookMyMovie.setMovieId(movieId);
			}
			catch(InvalidMovieIdException e) {
				//e.printStackTrace();
				System.out.println("Thank you!!! \nHope you will visit our page again.");
				System.exit(1);
			}
			
		}
		
		System.out.println("Enter the Number Of Tickets: ");
		
		while(flag2) {
			if(noOftickets>15) {
				try {
					noOftickets = sc.nextInt();
				}
				catch(InputMismatchException e) {
					System.out.println("Invalid Input");
					e.printStackTrace();
				}
				System.out.println("The maximum number of tickets which can we booked at a time are 15.\nPlease enter valid number of tickets: ");
			}
			else {
				flag2 = false;
			}
		}
		bookMyMovie.setNoOfTickets(noOftickets);
		double totalAmount = bookMyMovie.calculateTicketAmount();
		System.out.println("Total amount for booking: "+ totalAmount);
	}
	public static void displayFares() throws IOException {
		FileReader fileInput = new FileReader("C:\\Users\\cvempati\\Downloads\\Movie.txt");
		BufferedReader br = new BufferedReader(fileInput);
		String Line="";
		while((Line=br.readLine())!=null) {
			System.out.println(Line);
		}
		fileInput.close();
		br.close();
	}

}
