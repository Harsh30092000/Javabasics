package Basics;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(Student.SCHOOL_NAME.charAt(5));
		Student s = new Student();
		System.out.println(s.score);
	}
}
