package com.example.assignment.array;

import java.util.Scanner;

public class SortStringArrayByLength {

	public static void main(String[] args) {
		
		String temp;
		String arr[] = new String[3];
		int n=arr.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		for(int i=0;i<n;i++){
		 arr[i] = sc.nextLine();
		}
		
		for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i].compareTo(arr[j])>0) {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
		}
		System.out.println("Strings after sorting :");
		for(String a:arr) {
        System.out.println(a);
		}
	}
}
