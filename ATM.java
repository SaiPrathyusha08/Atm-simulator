
	public class ATM {
	    private double balance;
	    private final String pin = "1234"; // Predefined PIN 

	    public ATM() 
	    {
	        this.balance = 0.0;
	    }

	    public boolean verifyPin(String inputPin) 
	    {
	        return pin.equals(inputPin);
	    }

	    public void checkBalance() {
	        System.out.printf("Your current balance is: ₹%.2f%n", balance);
	    }


	    public void withdraw(double amount) 
	    {
	        if (amount > 0 && amount <= balance) 
	        {
	            balance -= amount;
	            System.out.printf("₹%.2f withdrawn successfully.%n", amount);
	        } else {
	            System.out.println("Invalid withdrawal amount or insufficient funds.");
	        }
	    }

	    public void displayMenu() {
	        System.out.println("\n--- ATM Menu ---");
	        System.out.println("1. Check Balance");
	        System.out.println("2. Deposit Money");
	        System.out.println("3. Withdraw Money");
	        System.out.println("4. Exit");
	    }

		public void deposit(double depositAmount) {
			// TODO Auto-generated method stub
			
		}
	}

