import java.util.Scanner;

public class BankDemoTest {

    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CheckingAccount ca = new CheckingAccount(0.00f, 249039271);
        System.out.printf("Enter amount to deposit into account %d: $",ca.getAccountNumber());
        ca.deposit(in.nextDouble());
        System.out.printf("Enter amount to withdraw from account %d: $",ca.getAccountNumber());
        try {
            ca.withdraw(in.nextDouble());
            System.out.printf("The balance after withdraw is: $%.2f\n",ca.getBalance());
        } catch (InsufficientFundsException ifE) {
            //TODO: handle exception
            System.out.printf("Sorry, but your account is short by: $%.2f\n",ifE.getAmount());
        }
    }
}
