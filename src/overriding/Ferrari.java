package overriding;

public class Ferrari {
	private int year;
	public Ferrari(int year) {
		this.year = year;
	}
	public int getYear() {
		return this.year;
	}
	public void speed() {
		System.out.println(this.year + "년식 페라리 속도 : 300km");
	}
}
