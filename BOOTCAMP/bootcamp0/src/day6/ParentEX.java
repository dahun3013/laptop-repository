package day6;

public class ParentEX {
	public static void main(String[] args) {
		Child c = new Child("������",28,"010-1234-5678");
		c.method1();
		c.method2();
	}
}

class Parent{
	String name;
	int age;
	Parent(String name, int age){
		this.name = name;
		this.age = age;
	}
	void method1() {
		System.out.println(name);
		System.out.println(age);
	}
}

class Child extends Parent{
	String phone;
	Child(String name, int age, String phone){
		super(name, age);
		this.phone = phone;	
	}
	void method2() {
		System.out.println(phone);
	}
}
