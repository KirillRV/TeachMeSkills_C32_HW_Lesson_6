package lesson_6.task_2;

public class CreditCard {
    String accountNumber;
    double currentBalance;

    public CreditCard(String accountNumber, double currentBalance) {
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
    }

    public void printCardInfo() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Current amount: " + currentBalance);
    }

    public void displayIfo() { System.out.println("Account Number: " + accountNumber + "\nCurrent Balance: " + currentBalance);

    }
}
