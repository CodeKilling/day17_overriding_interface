package quiz02;

import java.util.Scanner;

class army implements Quiz02_interface{

	@Override
	public void attack() {
		System.out.println("army :: attack");
	}
	@Override
	public void defense() {
		System.out.println("army :: defense");
	}
}

class airforce implements Quiz02_interface{

	@Override
	public void attack() {
		System.out.println("airforce :: attack");
	}

	@Override
	public void defense() {
		System.out.println("airforce :: defense");
	}
}

public class Quiz02_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Quiz02_interface myForce = null;
		
		int input = 0;
		
		while(true) {
			System.out.println("1. army. \t2.airforce");
			input = sc.nextInt();
			if(input == 1) {
				myForce = new army();
				System.out.println("Select Army");
			}else if(input ==2) {
				myForce = new airforce();
				System.out.println("Select Airforce");
			}
			
			System.out.println("1. attack. \t2.defense");
			input = sc.nextInt();
			if(input == 1) {
				myForce.attack();
			}else if(input ==2) {
				myForce.defense();
			}
		}
	}

}
