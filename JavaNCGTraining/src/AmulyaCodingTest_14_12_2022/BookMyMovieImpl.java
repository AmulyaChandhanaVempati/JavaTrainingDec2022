package AmulyaCodingTest_14_12_2022;

public class BookMyMovieImpl implements BookMyMovie {

	private int movieId;
	private int noOfTickets;
	private double discount;
	private double totalAmount;

	public BookMyMovieImpl() {
		super();
	}

	public BookMyMovieImpl(int movieId, int noOfTickets) {
		super();
		this.movieId = movieId;
		this.noOfTickets = noOfTickets;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public void calculateDiscount() {
		if ((movieId == 101 || movieId == 102 || movieId == 103) && noOfTickets < 5) {
			discount = 0;
		} else if (movieId == 101 || movieId == 103) {
			if (noOfTickets >= 5 && noOfTickets < 10) {
				discount = 15;
			} else if (noOfTickets >= 10 && noOfTickets <= 15) {
				discount = 20;
			}
		}
		else if(movieId==102) {
			if(noOfTickets >= 5 && noOfTickets < 10) {
				discount=10;
			}
			else if(noOfTickets >= 10 && noOfTickets <= 15) {
				discount=15;
			}
		}
		else {
			discount =0;
		}
	}
    
	@Override
	public double calculateTicketAmount() {
		int baseFare;
		calculateDiscount();
		if(movieId==101) {
			baseFare = 120;
		}
		else if(movieId==102) {
			baseFare = 170;
		}
		else {
			baseFare = 150;
		}
		int amount = baseFare * noOfTickets;
		totalAmount = amount - (amount* (discount /100));
		return totalAmount;
	}

}
