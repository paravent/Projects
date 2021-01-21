import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate testDate = LocalDate.of(2021, 1, 20);
		Bookings testBooking = new Bookings(testDate, 1, 100);
		Bookings testBooking2 = new Bookings(testDate, 3, 100);
		Bookings testBooking3 = new Bookings(testDate, 5, 100);
		ArrayList<Bookings> testArrayList = new ArrayList<Bookings>(); 
		
		BookingManager testBookingManager = new BookingManager(testArrayList);
		
		testBookingManager.addBooking(testBooking);
		testBookingManager.addBooking(testBooking2);
		testBookingManager.addBooking(testBooking3);
		System.out.println(testBookingManager.getAllBookings()); 
		System.out.println(testBookingManager.getTotalBookingValue());
		System.out.println("All bookings");
		testBookingManager.getAllBookingsInMonth(1); 
		testBookingManager.getAllBookingsInMonth(2); 
		System.out.println("---------------------------------");
		/*
		System.out.println("Before clear ...");
		testBookingManager.clearBookings();
		System.out.println(testBookingManager.getAllBookings()); 
		System.out.println("After clear ...");
		*/
	}

}
