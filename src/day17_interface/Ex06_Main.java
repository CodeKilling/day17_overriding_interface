package day17_interface;

import java.util.ArrayList;

class army implements Ex06_interface {

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("육군 공격.");
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		System.out.println("육군 방어.");
	}
	
}

class airforce implements Ex06_interface{

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("공군 공격.");
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		System.out.println("공군 방어.");
	}
	
}
public class Ex06_Main {
	
	public static void main(String[] args) {
		Ex06_interface a = new army();
		Ex06_interface b = new airforce();
		
		ArrayList<Ex06_interface> arr = new ArrayList<Ex06_interface>();
		arr.add(a);
		arr.add(b);
		
		for(Ex06_interface it : arr) {
			it.attack();
			it.defense();
		}
	}
	
}
