package com.example.assignment.tdd.intermediate;

import java.util.ArrayList;
import java.util.List;

public class Q4_CarApp {

	public int NoofCarSold() {
		Car c1 = new Car(80, "aaa", "swift");
		Car c2 = new Car(70, "bbb", "alto");
		Car c3 = new Car(60, "ccc", "bmw");
		Car c4 = new Car(90, "ddd", "oddi");
		Car c5 = new Car(50, "eee", "ciaaz");
		Car c6 = new Car(70, "fff", "baleno");
		Car c7 = new Car(80, "ggg", "nexon");
		Car c8 = new Car(90, "hhh", "tiago");
		Car c9 = new Car(60, "iii", "brizza");
		Car c10 = new Car(50, "jjj", "zen");

		CarShop cs1 = new CarShop(c1, true);
		CarShop cs2 = new CarShop(c2, false);
		CarShop cs3 = new CarShop(c3, true);
		CarShop cs4 = new CarShop(c4, true);
		CarShop cs5 = new CarShop(c5, true);
		CarShop cs6 = new CarShop(c6, true);
		CarShop cs7 = new CarShop(c7, true);
		CarShop cs8 = new CarShop(c8, false);
		CarShop cs9 = new CarShop(c9, true);
		CarShop cs10 = new CarShop(c10, false);

		List<CarShop> list = new ArrayList<CarShop>();

		list.add(cs1);
		list.add(cs2);
		list.add(cs3);
		list.add(cs4);
		list.add(cs5);
		list.add(cs6);
		list.add(cs7);
		list.add(cs8);
		list.add(cs9);
		list.add(cs10);

		int count = 0;

		for (CarShop cs : list) {

			if (cs.isIs_sold() == true) {
				count++;
			}
		}

		return count;

	}

	public static void main(String[] args) {

		Q4_CarApp csa = new Q4_CarApp();
		int c = csa.NoofCarSold();
		System.out.println(c);

	}
}

class Car {
	private int speed;
	private String car_owner;
	private String car_type;

	public Car(int speed, String car_owner, String car_type) {
		super();
		this.speed = speed;
		this.car_owner = car_owner;
		this.car_type = car_type;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", car_owner=" + car_owner + ", car_type=" + car_type + "]";
	}

}

class CarShop {
	private Car car;
	private boolean is_sold;

	public CarShop(Car car, boolean is_sold) {
		super();
		this.car = car;
		this.is_sold = is_sold;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public boolean isIs_sold() {
		return is_sold;
	}

	public void setIs_sold(boolean is_sold) {
		this.is_sold = is_sold;
	}

	@Override
	public String toString() {
		return "CarShop [car=" + car + ", is_sold=" + is_sold + "]";
	}

}