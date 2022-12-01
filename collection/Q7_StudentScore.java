package com.example.assigment.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Student {
	int rollno;
	String sname, classname;
	int totalmarks;

	public Student(int rollno, String sname, String classname, int totalmarks) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.classname = classname;
		this.totalmarks = totalmarks;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public int getTotalmarks() {
		return totalmarks;
	}

	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", classname=" + classname + ", totalmarks="
				+ totalmarks + "]";
	}

}

public class Q7_StudentScore {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "Rohini", "IT", 90));
		list.add(new Student(2, "Mohini", "Comp", 30));
		list.add(new Student(3, "Omkar", "Mech", 40));
		list.add(new Student(4, "Bhushan", "Auto", 80));
		list.add(new Student(5, "Shivansh", "ETC", 20));

		// a) Print the name of students who score is first, second and third position.
		System.out.println("\nStudents who score is first, second and third position :");

		Collections.sort(list, new MarksComparator());
		/*
		 * for(Student st: list){
		 * System.out.println(st.rollno+" "+st.sname+" "+st.totalmarks); }
		 */		
		System.out.println(list.get(4).sname + " is at first position.");
		System.out.println(list.get(3).sname + " is at second position.");
		System.out.println(list.get(2).sname + " is at third position.");

		// Print name of those students who’s marks are below 50%
		System.out.println("\nStudents who’s marks are below 50% :");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTotalmarks() < 50) {
				System.out.println(list.get(i).getSname() + " got " + list.get(i).getTotalmarks());
			}
		}

		// Print name of those students who’s marks are below 35%
		System.out.println("\nStudents who’s marks are below 35% :");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTotalmarks() < 35) {
				System.out.println(list.get(i).getSname() + " got " + list.get(i).getTotalmarks());
			}
		}

		// Print name of those students who’s marks are above average score.
		float avgNo = findAverage(list);
		System.out.println("\nStudents who’s marks are above average score :");
		for (int j = 0; j < list.size(); j++) {
			if (list.get(j).getTotalmarks() > avgNo) {
				System.out.println(list.get(j).getSname() + " got " + list.get(j).getTotalmarks());
			}
		}

		// Print detail of all students on the basis of Name
		Collections.sort(list, new NameComparator());
		System.out.println("\nStudent details on the basis of Name :");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Student st = (Student) it.next();
			System.out.println("\n"+st.rollno + " " + st.sname + " " + st.classname + " " + st.totalmarks);
		}
	}

	private static float findAverage(List<Student> list) {
		float sum = 0, avg = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i).getTotalmarks();
		}
		avg = (sum / 500) * 100;
		System.out.println("Sum :" + sum + "   Average :" + avg);
		return avg;
	}

}

class NameComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {

		return s1.sname.compareTo(s2.sname);
	}
}

class MarksComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.totalmarks == o2.totalmarks)
			return 0;
		else if (o1.totalmarks > o2.totalmarks)
			return 1;
		else
			return -1;
	}

}