

	import java.util.Scanner;

	public class User 
	{
	    private ATM atm;
	    private Scanner scanner;

	    public User(ATM atm) 
	    {
	        this.atm = atm;
	        this.scanner = new Scanner(System.in);
	    }

	    public void start() 
	    {
	        System.out.print("Enter your PIN: ");
	        String inputPin = scanner.nextLine();

	        if (atm.verifyPin(inputPin)) {
	            menu();
	        } else {
	            System.out.println("Incorrect PIN. Access denied.");
	        }
	    }

	    private void menu() 
	    {
	        int choice;
	        do 
	        {
	            atm.displayMenu();
	            System.out.print("Select an option (1-4): ");
	            choice = scanner.nextInt();

	            switch (choice) 
	            {
	                case 1:
	                    atm.checkBalance();
	                    break;
	                case 2:
	                    System.out.print("Enter amount to deposit: ");
	                    double depositAmount = scanner.nextDouble();
	                    atm.deposit(depositAmount);
	                    break;
	                case 3:
	                    System.out.print("Enter amount to withdraw: ");
	                    double withdrawAmount = scanner.nextDouble();
	                    atm.withdraw(withdrawAmount);
	                    break;
	                case 4:
	                    System.out.println("Thank you for using the ATM. Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 4);
	    }
	}

