package lesson_6.task_2;

public class TransferService {
    public static void addMoney(double money, CreditCard card) {
        if (money <= 0)
            System.out.println("Operation Declined");
        else
            card.currentBalance += money;
    }

    public static void withdrawMoney(double money, CreditCard card) {
       if (money < 0) {
           System.out.println("Operation Declined");
       } else if (money > card.currentBalance)
          System.out.println("insufficient funds on the card" + card.accountNumber);
      else
           card.currentBalance -= money;
    }

}

