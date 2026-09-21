import java.util.*;

class BankAccount {
    int balance = 0;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        balance -= amount;
    }

    int getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String operation = sc.next();
            int amount = sc.nextInt();

            if (operation.equals("Deposit"))
                account.deposit(amount);
            else if (operation.equals("Withdraw"))
                account.withdraw(amount);
        }

        System.out.println(account.getBalance());
    }
}


Input
3
Deposit 5000
Withdraw 2000
Deposit 1000
Output
4000
