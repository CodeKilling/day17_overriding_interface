package overriding;

public class NewFerrari extends Ferrari{
	public NewFerrari(int year) {
		super(year);
	}
	public void autoSystem() {
		System.out.println("자동 운전모드를 시작합니다.");
	}
	/*
	 * public void speed() { System.out.println(super.getYear() +
	 * "년식 페라리 속도 : 500km"); System.out.println("터보 speed 달리자~"); }
	 */
	@Override
	public void speed() {
		// TODO Auto-generated method stub
		super.speed();
		System.out.println(super.getYear() + "년식 페라리 속도 : 500km");
		System.out.println("터보 speed 달리자~");
	}
	
}
