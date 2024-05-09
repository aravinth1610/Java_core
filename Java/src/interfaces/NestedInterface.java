package interfaces;

interface Authenticator{
	void authenticate(); 
	
	// nested interface 
	 
	interface TwoFactorAuthentication{
		void sendVerifcationCode(); 
		void verfiycode();
	}
}

class PasswordAuthenticator implements Authenticator{

	@Override
	public void authenticate() {
		System.out.println("authenticated.....");
	}
	
}
class TwoStepVerification implements Authenticator.TwoFactorAuthentication{

	@Override
	public void sendVerifcationCode() {
		System.out.println("verifcation code sent");
	}

	@Override
	public void verfiycode() {
		System.out.println("code verified...");

	}
	
}

public class NestedInterface {

	public static void main(String[] args) {
		PasswordAuthenticator pass = new PasswordAuthenticator(); 
		pass.authenticate(); 
		TwoStepVerification fact = new TwoStepVerification(); 
		fact.sendVerifcationCode();
		fact.verfiycode();
	}
}
