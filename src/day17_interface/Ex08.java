package day17_interface;

interface test{
	public int num = 4000;
	// => public static final int num = 4000;
}
public class Ex08 {
	public static void main(String[] args) {
		System.out.println(test.num);
	}
}
