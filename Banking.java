import java.util.Scanner;

public class Banking {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        double balance = 1500;

        while (true) {
            System.out.println("Options:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    balance += depositAmount;
                    System.out.println("Deposited " + depositAmount + ". Current balance: " + balance);
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds.");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Withdrew " + withdrawAmount + ". Current balance: " + balance);
                    }
                    break;
                case 3:
                    System.out.println("Current balance: " + balance);
                    break;
                default:
                    System.out.println("Invalid case");
            }
        }
    }
}
    
    

