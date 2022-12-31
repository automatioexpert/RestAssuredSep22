package Models;

public class Booking {

	private String firstName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getDepositPaid() {
		return depositPaid;
	}
	public void setDepositPaid(int depositPaid) {
		this.depositPaid = depositPaid;
	}
	public String getAdditionalDetails() {
		return additionalDetails;
	}
	public void setAdditionalDetails(String additionalDetails) {
		this.additionalDetails = additionalDetails;
	}
	public BookingDates getBookingDates() {
		return bookingDates;
	}
	public void setBookingDates(BookingDates bookingDates) {
		this.bookingDates = bookingDates;
	}
	private String lastName;
	private int totalPrice;
	private int depositPaid;
	private String additionalDetails;
	private BookingDates bookingDates;
	
}
