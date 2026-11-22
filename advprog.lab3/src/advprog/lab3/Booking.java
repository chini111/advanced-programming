package advprog.lab3;

import java.time.LocalDate;

public class Booking {
	
	private LocalDate startDate;
	private int numberOfNights;
	private double costPerNight;
	
	public Booking(LocalDate startDate, int numberOfNights, double costPerNight ) {
		
		this.startDate = startDate;
		this.numberOfNights = numberOfNights;
		this.costPerNight = costPerNight;
		
		
	}
	
	

	
	public LocalDate getStartDate() {
		
		return startDate;
	}
	 
	public void setStartDate(LocalDate date) {
		
		startDate = date;
		
	}
	
	public int getNumberOfNights() {
		
		return numberOfNights;
	}
	
	public void setNumberOfNights( int nights) {
		
		numberOfNights = nights;
	}
	
	public double getCostPerNight() {
		
		return costPerNight;
		
		
	}
	
	
	public void setCostPerNight(double cost) {
		
		costPerNight = cost;
	}
	
	public double getTotalCost() {
		
		return numberOfNights * costPerNight;
		
		
		
	}
}


