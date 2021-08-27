package quiz01;

import java.util.HashMap;
import java.util.Scanner;

public class Quiz_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select = 0;
		Quiz01_Timer q01 = new Quiz01_Timer();
		Quiz01_Timer02 q02 = new Quiz01_Timer02();
		
		while(true) {
			System.out.println("1. �α���");
			System.out.println("2. ȸ������");
			System.out.println("3. ȸ�����");
			System.out.println("4. �α׾ƿ�");
			System.out.print(" >>>>> ");
			
			select = sc.nextInt();
			sc.nextLine();
			
			switch (select) {
			case 1:
				System.out.print("ID : ");
				String id = sc.nextLine();
				System.out.print("PASS : ");
				String pass = sc.nextLine();
				int temp = q01.logIn(id,pass);
				if( temp == -2) {
					System.out.println("���Ե� ID�� �����ϴ�.");
				}else if(temp == -1) {
					System.out.println("LogIn ����.");
				}else if(temp == 1) {
					System.out.println("LogIn ����.");
					
					q01.setTimer();
					q01.start();
					
					boolean bool = true;
					while(bool) {
						q01.generateMap();
						q01.printList();
						
						System.out.print("�Է� : ");
						String cmd = sc.nextLine();
						int result = 0;
						if(cmd.equals("5")) {
							result = q01.exitLoop();
							if(result == -1) {
								bool=false;
							}
						}else {
							q01.runProc(cmd);
						}
					}
				}
				break;
			case 2:
				System.out.print("ID : ");
				id = sc.nextLine();
				System.out.print("PASS : ");
				pass = sc.nextLine();
				temp = q01.createAccount(id, pass);
				if(temp == 1) {
					System.out.println("���� ����.");
				}else if(temp == -1) {
					System.out.println("�̹� ���Ե� ID �Դϴ�.");
				}
				break;
			case 3:
				HashMap<String, String> map = q01.getMapLogin();
				if(map.size()>0) {
					for(HashMap.Entry<String,String> entry : map.entrySet()) {
						System.out.println("ID : " + entry.getKey() 
										 + " / PASS : " + entry.getValue());
					}
				}else
					System.out.println("���Ե� ID�� �����ϴ�.");
				break;
			case 4:
				System.out.println("���α׷��� ���� �մϴ�.");
				//System.exit(0);
				q02.setTimer();
				q02.start();
			default:
				break;
			}
		}
		
	}
}
