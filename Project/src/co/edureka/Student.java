package co.edureka;

public class Student {
	private String name;

	public Student(){
		System.out.println("Inside Default Constructor");
	}
	
	
	public Student(String name) {
		super();
		System.out.println("Inside Parameterized Constructor");
		this.name = name;
	}

	public String getName() {
		System.out.println("Inside getName method");
		return name;
	}

	public void setName(String name) {
		System.out.println("Inside setName Method");
		this.name = name;
	}
		
	public void hello(){
		System.out.println("Inside Hello Method");
		System.out.println("Hello, "+name);
	}
}
