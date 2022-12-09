package com.example.assigment.java8.lambda;

import java.util.Scanner;

public class Q8_MultiThreading {

	static int num = 100;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number till when the thread runs");
		int choice = sc.nextInt();
		Runnable thread1 = () -> {
			for (int i = 0; i <= choice; i++) {
				num = (num + (num / 100) * 10);
				System.out.println(num);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread t = new Thread(thread1);
		t.setName("Thread1");
		t.start();

		Runnable thread2 = () -> {
			for (int i = 0; i <= choice; i++) {
				num = num - ((num / 100) * 7);
				System.out.println(num);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread t2 = new Thread(thread2);
		t2.setName("Thread2");
		t2.start();

	}
}
