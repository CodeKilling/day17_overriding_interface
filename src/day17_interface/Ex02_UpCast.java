package day17_interface;

class Parents{
	public void familyName() {
		System.out.println("김");
	}
	public void name() {
		this.familyName();
		System.out.println("호준");
	}
}

class Daughter extends Parents{
	public void name() {
		super.familyName();
		System.out.println("이슬");
	}
}
class Son extends Parents{
	public void name() {
		super.familyName();
		System.out.println("케인");
	}
}

public class Ex02_UpCast {
	public static void main(String[] args) {
		Parents family = new Parents();
		family.name();
		family = new Daughter();
		family.name();
		family = new Son();
		family.name();
	}
}
