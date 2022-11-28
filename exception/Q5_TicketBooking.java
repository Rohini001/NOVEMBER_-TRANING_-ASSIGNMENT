package com.example.assigment.exception;

import java.util.Scanner;

public class Q5_TicketBooking {

	public static void main(String[] args) throws LimitExceedBookingException, BookingNotAllowedException, NormalTicketBookingException, SameAgeGroupException {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter bookingType :");
		String bookingType = scn.nextLine();
		System.out.println("Enter time :");
		int time = scn.nextInt();
		System.out.println("Enter age :");
		int age = scn.nextInt();
		System.out.println("Enter noofTickets :");
		int noofTickets = scn.nextInt();
		RailwaySystem rs = new RailwaySystem(bookingType, time, age, noofTickets);

		if (rs.getBookingType().equalsIgnoreCase("Tatkal") && (rs.getTime() >= 10 && rs.getTime() <= 12)
				&& rs.getNoofTickets() == 4) {
			System.out.println("User has booked 4 tickets in Tatkal.");
		}else {
			throw new LimitExceedBookingException("User tries to book more than 4 ticket in tatkal.");
		} 
		
		if (rs.getTime() >= 11 && rs.getTime() <= 1) {
			System.out.println("User is allowed to book any ticket ");
		}else {
			throw new BookingNotAllowedException("During 11:00 PM to 1:00 AM user is not \r\n"
					+ "allowed to book any ticket ");
		}
		
		if ( !(rs.getTime() >= 11 && rs.getTime() <= 1) && rs.getBookingType().equalsIgnoreCase("Normal")
				&& rs.getNoofTickets() <=6) {
			System.out.println("User can book normal ticket. ");
		}else {
			throw new NormalTicketBookingException("User tries to book more than 6 tickets in normal. ");
		}
		

		if (rs.getAge()>=0 && rs.getAge()<=5) {
			System.out.println("Ticket for age limit 0 year to 5 is not allowed.");
		}else {
			throw new SameAgeGroupException("Ticket for age limit 0 year to 5 is not allowed.");
		}
		
	}

}

class RailwaySystem {
	private String bookingType;
	private int time;
	private int age;
	private int noofTickets;

	public RailwaySystem(String bookingType, int time, int age, int noofTickets) {
		super();
		this.bookingType = bookingType;
		this.time = time;
		this.age = age;
		this.noofTickets = noofTickets;
	}

	public String getBookingType() {
		return bookingType;
	}

	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNoofTickets() {
		return noofTickets;
	}

	public void setNoofTickets(int noofTickets) {
		this.noofTickets = noofTickets;
	}

	@Override
	public String toString() {
		return "RailwaySystem [bookingType=" + bookingType + ", time=" + time + ", age=" + age + ", noofTickets="
				+ noofTickets + "]";
	}

}
class LimitExceedBookingException extends Exception {
	private static final long serialVersionUID = 1L;

	public LimitExceedBookingException(String s) {
		super(s);
	}
}

class NormalTicketBookingException extends Exception {
	private static final long serialVersionUID = 1L;

	public NormalTicketBookingException(String s) {
		super(s);
	}
}

class BookingNotAllowedException extends Exception {
	private static final long serialVersionUID = 1L;

	public BookingNotAllowedException(String s) {
		super(s);
	}
}
class SameAgeGroupException extends Exception {
	private static final long serialVersionUID = 1L;

	public SameAgeGroupException(String s) {
		super(s);
	}
}