
	public class ATMApplication {
	    public static void main(String[] args) {
	        ATM atm = new ATM();
	        User user = new User(atm);
	        user.start();
	    }
	}

