import java.time.LocalDate;
import java.util.ArrayList;

public class BookingManager {
	LocalDate testDate = LocalDate.of(2021, 1, 20);
	private ArrayList<Bookings> bookings;  
	// Constructor of type array list
	public BookingManager(ArrayList<Bookings> bookings){
		this.bookings = bookings;
	}
	
	public void addBooking(Bookings booking) {
		bookings.add(booking);
	}
	
	public int getNumberOfBookings() {
		return bookings.size(); 
	}

	public double getTotalBookingValue() {
		double total = 0; 
		for(int i=0; i<bookings.size(); i++) {
			total = total + bookings.get(i).getTotalCost(); 
		}
		return total;  
	}
	
	public void clearBookings() {
		for(int i=0; (i<bookings.size() + 1); i++) {
			bookings.remove(i);
			System.out.println(i);
		}
	}
	
	public ArrayList<Bookings> getAllBookings(){
		return bookings; 	 
	}
	
	public ArrayList<Bookings> getAllBookingsInMonth(int Month){
		for(int i=0; i<bookings.size(); i++) {
			if(Month == testDate.getMonthValue()) {
				System.out.println("TRUE");
				System.out.println(bookings.toString());
			}
			else {
				System.out.println("FALSE");
			}
		}
		return bookings; 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
