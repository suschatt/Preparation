package co.edureka;

public class Student {
	private String name;

	public Student(){
		System.out.println("Inside Default Constructor");
	}

	public Student(String name){
		this.name=name;
		System.out.println("Inside Parameterized Constructor");
	}

	public String getName() {
		System.out.println("Inside getName method");
		return name;
	}

	public void setName(String name) {
		System.out.println("Inside setName method");
		this.name = name;
	}

	public void sayHello(){
		System.out.println("Hello, "+this.name);
	}

	public void setup(){
		System.out.println("User defined Initialization Method");
	}

	public void myDestroy(){
		System.out.println("User defined destructor");
	}
}
