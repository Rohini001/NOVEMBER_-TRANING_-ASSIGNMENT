package com.example.assignment.tdd.advance;

class Application {
	private int id;
	private String name;

	public Application(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Application [id=" + id + ", name=" + name + "]";
	}

}

class ApplicationService {

	public Application addApplication(Application application) {

		if (application != null) {
			System.out.println("Application sucessfully created" + application);
		}

		return application;

	}
}

public class R1_Application {
	public static void main(String[] args) {

		ApplicationService as = new ApplicationService();
		Application app1 = new Application(101, "Welcome");
		Application a = as.addApplication(app1);

	}

}