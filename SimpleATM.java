import java.util.Scanner;
public class SimpleATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float balance=1000;

        while (true) {
            System.out.println("Welcome to Simple ATM!");
            System.out.println("1.Press 1 to Check Balance");
            System.out.println("2.Press 2 for Deposit");
            System.out.println("3.Press 3 for Withdraw");
            System.out.println("4.Press 4 for Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Your current balance is : RS " + balance);
            } else if (choice == 2) {
                System.out.print("Enter amount to deposit in your account: RS");
                float depositAmount = sc.nextFloat();
                balance = balance+ depositAmount;
                System.out.println("Deposit successful! New balance is : RS. " + balance);
            } else if (choice == 3) {
                System.out.print("Enter amount which you want to withdraw: RS. ");
                float withdrawAmount = sc.nextFloat();

                if (withdrawAmount > balance) {
                    System.out.println("Oops! Insufficient funds!");
                } else {
                    balance = balance-withdrawAmount;
                    System.out.println("Withdrawal Done! Remaining balance is : RS. " + balance);
                }
            } else if (choice == 4) {
                System.out.println("Thank you for visiting this simple ATM!");
                break;
            } else {
                System.out.println("SORRY...!Invalid choice!");
            }
        }

    }
}

