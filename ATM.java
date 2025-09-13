import java.util.Scanner;

public class ATM {
    static int bal = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 1234;
        boolean login = false;

        for (int i = 3; i > 0; i--) {
            System.out.print("Enter PIN: ");
            int p = sc.nextInt();
            if (p == pin) {
                System.out.println("Login successful!");
                login = true;
                break;
            } else {
                System.out.println("Wrong PIN! Attempts left: " + (i - 1));
            }
        }

        if (!login) {
            System.out.println("Account locked. Too many attempts.");
            return;
        }

        while (true) {
            System.out.println("\n==== ATM Menu ====");
            System.out.println("1) Deposit");
            System.out.println("2) Withdraw");
            System.out.println("3) Check Balance");
            System.out.println("4) Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    int d = sc.nextInt();
                    deposit(d);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    int w = sc.nextInt();
                    withdraw(w);
                    break;

                case 3:
                    check();
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option! Try again.");
                    continue;
            }

            if (ch == 4) {
                break;
            }
        }
    }

    public static void deposit(int a) {
        if (a > 0) {
            bal += a;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount! Try again.");
        }
    }

    public static void withdraw(int a) {
        if (a <= 0) {
            System.out.println("Invalid amount! Try again.");
        } else if (a > bal) {
            System.out.println("Insufficient balance!");
        } else {
            bal -= a;
            System.out.println("Withdrawal successful.");
        }
    }

    public static void check() {
        System.out.println("Your balance is: " + bal);
    }
}

