package day17_interface;

abstract class Abstract{
	protected int num;
	public void setNum(int num) {
		this.num = num;
	}
	public abstract void combo();
}

class NewAbstract extends Abstract{
	public void test() {}
	public void combo() {
		System.out.println(num + "단 공격 + 발차기");
	}
}
public class Ex04_Abstract {
	public static void main(String[] args) {
		NewAbstract na = new NewAbstract();
		na.setNum(3);
		na.combo();
	}
}
