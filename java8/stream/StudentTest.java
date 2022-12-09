package com.example.assigment.java8.stream;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentTest {

	static Map<Student, Integer> studentMap;

	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<Student>();
		
		listOFStudent(studentList);
		
		// 1. WAP to print list of all students who’s total marks are less than 40%.
		System.out.println("1. List of all students who’s total marks are less than 40% are ->\n");
		List<Student> list = studentMap.entrySet().stream().filter(s -> s.getValue() < 40).map(Map.Entry::getKey)
				.collect(Collectors.toList());
		for (Student s : list) {
			System.out.println(s);
		}
		
		// 3.WAP to print list of all those students who scored more than 75% in all
		// subjects.
		System.out.println("\n3. List of all those students who scored more than 75% in all subjects are ->\n");
		List<Student> list2 = studentMap.entrySet().stream().filter(s -> s.getValue() > 75).map(Map.Entry::getKey)
				.collect(Collectors.toList());
		for (Student s : list2) {
			System.out.println(s);
		}
		// System.out.println("List of all those students who scored more than 75% in
		// all subjects are\n" + list2 +"\n");
		
		// 2.WAP to print list of all those students who scored more than 75% in any of
		// 3 subjects.
		// studentMap.entrySet().stream().filter(s -> s.getValue() >
		// 75).map(Map.Entry::getKey);

		// 4.WAP to find those students who are fail in at least one subject.
		System.out.println("\n4. List of students who are fail in at least one subject ->\n");
		List<Student> slist = studentList.stream().filter(n -> (n.getChemistry() < 33 || n.getEnglish() < 33
				|| n.getHindi() < 33 || n.getMaths() < 33 || n.getPhysics() < 33)).collect(Collectors.toList());
		for (Student s1 : slist) {
			System.out.println(s1);
		}

		// 5. Find how many students are promoted to another class.
		System.out.println("\n5. The List of students are promted to another class ->\n");
		List<Student> collect = studentList.stream().filter(n -> (n.getChemistry() > 33 && n.getEnglish() > 33
				&& n.getHindi() > 33 && n.getPhysics() > 33 && n.getMaths() > 33)).collect(Collectors.toList());
		for (Student std : collect) {
			System.out.println(std);
		}

		// 6. Find how many students need to give exam in two subjects to promoted to
		// another class.
		System.out.println(
				"\n6. The List of students need to give exam in two subjects to promoted to another class. ->\n");

		List<Student> stList = studentList.stream()
				.filter(n -> (n.getChemistry() < 33 && n.getEnglish() < 33)
						|| (n.getChemistry() < 33 && n.getHindi() < 33) || (n.getChemistry() < 33 && n.getMaths() < 33)
						|| (n.getChemistry() < 33 && n.getPhysics() < 33) || (n.getEnglish() < 33 && n.getHindi() < 33)
						|| (n.getEnglish() < 33 && n.getPhysics() < 33) || (n.getEnglish() < 33 && n.getMaths() < 33)
						|| (n.getHindi() < 33 && n.getPhysics() < 33) || (n.getHindi() < 33 && n.getMaths() < 33)
						|| (n.getPhysics() < 33 && n.getMaths() < 33))
				.collect(Collectors.toList());
		for (Student std2 : stList) {
			System.out.println(std2);
		}

	}

	private static void listOFStudent(ArrayList<Student> studentList) {
		Student aayush = new Student(101, LocalDateTime.now(), LocalDateTime.of(1990, 8, 25, 4, 5), 88, 85, 86, 87, 88,
				"10th");
		Student bhagat = new Student(102, LocalDateTime.now(), LocalDateTime.of(1992, 2, 26, 5, 5), 34, 35, 35, 36, 35,
				"10th");
		Student chandan = new Student(103, LocalDateTime.now(), LocalDateTime.of(1995, 11, 6, 2, 8), 43, 44, 45, 46, 47,
				"10th");
		Student divyesh = new Student(104, LocalDateTime.now(), LocalDateTime.of(1994, 12, 18, 3, 9), 40, 34, 35, 33,
				78, "10th");
		Student eminem = new Student(105, LocalDateTime.now(), LocalDateTime.of(1992, 10, 16, 1, 5), 48, 75, 92, 65, 27,
				"10th");
		Student farhan = new Student(106, LocalDateTime.now(), LocalDateTime.of(1990, 9, 19, 1, 6), 33, 55, 66, 88, 77,
				"10th");
		Student gaurav = new Student(107, LocalDateTime.now(), LocalDateTime.of(1991, 8, 20, 1, 7), 49, 59, 69, 89, 79,
				"10th");
		Student harsh = new Student(108, LocalDateTime.now(), LocalDateTime.of(1992, 7, 22, 1, 8), 95, 45, 65, 85, 75,
				"10th");
		Student iktara = new Student(109, LocalDateTime.now(), LocalDateTime.of(1993, 5, 21, 1, 9), 34, 10, 36, 33, 23,
				"10th");
		Student jhony = new Student(109, LocalDateTime.now(), LocalDateTime.of(1993, 5, 21, 1, 9), 23, 20, 43, 53, 63,
				"10th");

		studentList.add(aayush);
		studentList.add(bhagat);
		studentList.add(chandan);
		studentList.add(divyesh);
		studentList.add(eminem);
		studentList.add(farhan);
		studentList.add(gaurav);
		studentList.add(harsh);
		studentList.add(iktara);
		studentList.add(jhony);

		int avgAayush = (aayush.getMaths() + aayush.getPhysics() + aayush.getChemistry() + aayush.getEnglish()
				+ aayush.getHindi()) / 5;
		int avgBhagat = (bhagat.getMaths() + bhagat.getPhysics() + bhagat.getChemistry() + bhagat.getEnglish()
				+ bhagat.getHindi()) / 5;
		int avgChandan = (chandan.getMaths() + chandan.getPhysics() + chandan.getChemistry() + chandan.getEnglish()
				+ chandan.getHindi()) / 5;
		int avgDivyesh = (divyesh.getMaths() + divyesh.getPhysics() + divyesh.getChemistry() + divyesh.getEnglish()
				+ divyesh.getHindi()) / 5;
		int avgEminem = (eminem.getMaths() + eminem.getPhysics() + eminem.getChemistry() + eminem.getEnglish()
				+ eminem.getHindi()) / 5;
		int avgFarhan = (farhan.getMaths() + farhan.getPhysics() + farhan.getChemistry() + farhan.getEnglish()
				+ farhan.getHindi()) / 5;
		int avgGaurav = (gaurav.getMaths() + gaurav.getPhysics() + gaurav.getChemistry() + gaurav.getEnglish()
				+ gaurav.getHindi()) / 5;
		int avgHarsh = (harsh.getMaths() + harsh.getPhysics() + harsh.getChemistry() + harsh.getEnglish()
				+ harsh.getHindi()) / 5;
		int avgIktara = (iktara.getMaths() + iktara.getPhysics() + iktara.getChemistry() + iktara.getEnglish()
				+ iktara.getHindi()) / 5;
		int avgJhony = (jhony.getMaths() + jhony.getPhysics() + jhony.getChemistry() + jhony.getEnglish()
				+ jhony.getHindi()) / 5;

		studentMap = new HashMap<Student, Integer>();

		studentMap.put(aayush, avgAayush);
		studentMap.put(bhagat, avgBhagat);
		studentMap.put(chandan, avgChandan);
		studentMap.put(divyesh, avgDivyesh);
		studentMap.put(eminem, avgEminem);
		studentMap.put(farhan, avgFarhan);
		studentMap.put(gaurav, avgGaurav);
		studentMap.put(harsh, avgHarsh);
		studentMap.put(iktara, avgIktara);
		studentMap.put(jhony, avgJhony);
	}

}

class Student {
	int rollno;
	LocalDateTime date_of_addmission, dob;
	int maths, physics, chemistry, english, hindi; 
	String classname;

	public Student(int rollno, LocalDateTime date_of_addmission, LocalDateTime dob, int maths, int physics,
			int chemistry, int english, int hindi, String classname) {
		super();
		this.rollno = rollno;
		this.date_of_addmission = date_of_addmission;
		this.dob = dob;
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
		this.english = english;
		this.hindi = hindi;
		this.classname = classname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public LocalDateTime getDate_of_addmission() {
		return date_of_addmission;
	}

	public void setDate_of_addmission(LocalDateTime date_of_addmission) {
		this.date_of_addmission = date_of_addmission;
	}

	public LocalDateTime getDob() {
		return dob;
	}

	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getHindi() {
		return hindi;
	}

	public void setHindi(int hindi) {
		this.hindi = hindi;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", date_of_addmission=" + date_of_addmission + ", dob=" + dob + ", maths="
				+ maths + ", physics=" + physics + ", chemistry=" + chemistry + ", english=" + english + ", hindi="
				+ hindi + ", classname=" + classname + "]";
	}

}