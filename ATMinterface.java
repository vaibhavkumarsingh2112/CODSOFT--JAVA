import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public String deposit(double amount) {
        this.balance += amount;
        return "Deposited ₹" + amount + ". New balance: ₹" + this.balance;
    }

    public String withdraw(double amount) {
        if (amount > this.balance) {
            return "Insufficient funds. Withdrawal failed.";
        }
        this.balance -= amount;
        return "Withdraw ₹" + amount + ". New balance: ₹" + this.balance;
    }

    public String checkBalance() {
        return "Current balance: ₹" + this.balance;
    }
}

class ATM {
    private BankAccount userAccount;

    public ATM(BankAccount userAccount) {
        this.userAccount = userAccount;
    }

    public void performTransaction(int option) {
        Scanner scanner = new Scanner(System.in);

        switch (option) {
            case 1:
                System.out.print("Enter the withdrawal amount: ₹");
                double withdrawAmount = scanner.nextDouble();
                System.out.println(userAccount.withdraw(withdrawAmount));
                break;
            case 2:
                System.out.print("Enter the deposit amount: ₹");
                double depositAmount = scanner.nextDouble();
                System.out.println(userAccount.deposit(depositAmount));
                break;
            case 3:
                System.out.println(userAccount.checkBalance());
                break;
            case 4:
                System.out.println("Thank you! Visit Again.");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Please select a valid option.");
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            try {
                System.out.print("Choose an option (1-4): ");
                int option = scanner.nextInt();
                performTransaction(option);
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println(" ATM Machine \n");
        System.out.print("Enter the Current account balance: ₹ ");
        double initialBalance = scanner.nextDouble();

        BankAccount userAccount = new BankAccount(initialBalance);
        ATM atm = new ATM(userAccount);

        atm.run();
    }
}
