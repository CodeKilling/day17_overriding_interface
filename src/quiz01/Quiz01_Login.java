package quiz01;
import java.util.HashMap;

public class Quiz01_Login extends Thread{
	private HashMap<String, String> mapLogin = new HashMap<String, String>();

	public HashMap<String, String> getMapLogin() {
		return mapLogin;
	}

	public void setMapLogin(HashMap<String, String> mapLogin) {
		this.mapLogin = mapLogin;
	}

	public int logIn(String _id, String _pass) {
		if(this.mapLogin.size()>0) {
			if(this.mapLogin.get(_id).equals(_pass)) {
				return 1;
			}else
				return -1;
		}else
			return -2;
	}
	
	public int createAccount(String _id,String _pass) {
		if(!this.mapLogin.containsKey(_id)) {
			this.mapLogin.put(_id, _pass);
			return 1;
		}else
			return -1;
	}
}
