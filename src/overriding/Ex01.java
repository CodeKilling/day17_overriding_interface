package overriding;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 * 오버라이딩
		 * - 상속받은 메서드의 내용을 변경하는것
		 * - 업데이트(패치)하고자 하는 내용을 작성
		 * 오버라이딩 조건
		 * 부모 메서드와 이름이 같아야 한다.
		 * 매개변수 개수 타입이 같아야 한다.
		 * 접근 제한자가 부모와 같거나 커야한다.
		 * -private < package < protected < public
		 */
		
		Ferrari fe = new Ferrari(2021);
		//fe.speed();
		
		NewFerrari nfe = new NewFerrari(2022);
		nfe.autoSystem(); nfe.speed();
	}

}
