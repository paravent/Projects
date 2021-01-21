import java.time.LocalDate;

public class Bookings {
	
	private int numberOfNights;
	private double costPerNight;
	private LocalDate startDate; 
	
	Bookings(){
		this.startDate = LocalDate.now(); 
		this.numberOfNights = 0; 
		this.costPerNight = 0; 
		
	}
	
	Bookings(LocalDate startDate, int numberOfNights, double costPerNight){
		this.startDate = startDate; 
		this.numberOfNights = numberOfNights; 
		this.costPerNight = costPerNight;
	}
		
	LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate date) {
		this.startDate = date; 
	}
		
	public int getNumberOfNights() {
		return numberOfNights; 
	}
		
	public void setNumberOfNights(int numberOfNights) {
		this.numberOfNights = numberOfNights; 
	}	
	
	public double getCostPerNight(double cost) {
		return costPerNight; 
	}
	
	public void setCostPerNight(double cost) {
		this.costPerNight = cost;  
	}
	
	public double getTotalCost() {
		return costPerNight * numberOfNights; 
	}
	
	public String toString() {
		return "Date of start is : " + startDate + " Night amount : " + numberOfNights + " Price of each night : " + costPerNight + "\n"; 
	}
	
}
