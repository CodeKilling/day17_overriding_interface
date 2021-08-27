package quiz01;

import java.util.HashMap;

public class Quiz01_RunProcess extends Quiz01_Login{
	HashMap<String, String> mapProcess = new HashMap<String, String>();
	
	public HashMap<String, String> getMapProcess() {
		return mapProcess;
	}

	public void setMapProcess(HashMap<String, String> mapProcess) {
		this.mapProcess = mapProcess;
	}

	public void runProc(String cmd) {
		ProcessBuilder proc = new ProcessBuilder(this.mapProcess.get(cmd));
		try {
			Process pr = proc.start();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void generateMap() {
		this.mapProcess.put("1", "notepad");
		this.mapProcess.put("2", "mspaint");
		this.mapProcess.put("3", "calc");
		this.mapProcess.put("4", "control");
		this.mapProcess.put("5", "exit");
	}
	
	public void printList() {
		for(HashMap.Entry<String, String> entry : this.mapProcess.entrySet()) {
			if(entry.getKey().equals("1")) {
				System.out.println(entry.getKey() + ". 메모장");
			}else if(entry.getKey().equals("2")) {
				System.out.println(entry.getKey() + ". 그림판");
			}else if(entry.getKey().equals("3")) {
				System.out.println(entry.getKey() + ". 계산기");
			}else if(entry.getKey().equals("4")) {
				System.out.println(entry.getKey() + ". 제어판");
			}else if(entry.getKey().equals("5")) {
				System.out.println(entry.getKey() + ". 나가기");
			}
		}
	}
	
	public int exitLoop() {
		return -1;
	}
}
