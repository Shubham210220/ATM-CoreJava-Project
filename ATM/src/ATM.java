import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {

		System.out.println("Welcome to ATM");
		System.out.println();

		Scanner sc = new Scanner(System.in);// pin
		System.out.println("Enter PIN Here: ");
		int PIN = sc.nextInt();
		if (PIN == 1234) {
			System.out.println("PIN is correct...");
		} else {
			System.out.println("Incorrect PIN 😟, Try again...");
			System.exit(0);
		}

		int balance = 55000;
		int n = 5;
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("1. Cash Withdraw");
			System.out.println("2. Cash Deposit");
			System.out.println("3. Mini Statement");
			System.out.println("4. Balance Inquiry");
			System.out.println("5. Exit");
			System.out.println("Enter Choise");

			int choise = sc.nextInt();

			switch (choise) {
			case 1:
				System.out.println("Enter Amount For Withdraw"); // withdraw
				int withdraw = sc.nextInt();
				if (balance >= withdraw) {
					balance = balance - withdraw;
					System.out.println("Collect Your Cash = " + withdraw);
				} else {
					System.out.println("Insufficient Balance 🥲");
				}
				break;

			case 2:
				System.out.println("Enter Amount for Deposite"); // Deposit
				int deposite = sc.nextInt();
				balance = balance + deposite;
				System.out.println(deposite + " is deposite to your account 😀");
				break;

			case 3:
				System.out.println("  Mini Statement  "); // miniStatement
				System.out.println("Name            : Shubham____");
				System.out.println("Mobile Number   : 999999XXXX");
				System.out.println("Mail Id         : xxxx@gmail.com");
				System.out.println("Account Balance :" + balance);
				break;

			case 4:
				System.out.println("Account Balance :" + balance); // Balance
				break;

			case 5:
				System.out.println("******  Thank You , Collect your Card ******");
				System.exit(0); // exit
			}
		}
		System.out.println();
		System.out.println("******  Thank You , Collect your Card  ******");
	}
}
