
public class Loginpojo {

	String uname;
	String pass;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	boolean blLogicLogin() {
		
		if (uname.equals("kevil") && pass.equals("kevil")) {
			
			return true;
			
		}
		else {
			return false;
		}
	}
}
