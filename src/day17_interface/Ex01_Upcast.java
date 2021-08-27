package day17_interface;

class A{
	public void print() {
		System.out.println("A Class");
	}
}

class B extends A{
	public void print() {
		System.out.println("B Class");
	}
}

class C extends A{
	public void print() {
		System.out.println("C Class");
	}
}

public class Ex01_Upcast {
	
	public static void main(String[] args) {
		/*
		B b = new B();
		b.print();
		C c = new C();
		c.print();
		*/
		
		A a = new B();
		a.print();
		a = new C();
		a.print();
	}
}
