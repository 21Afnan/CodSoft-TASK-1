import java.util.Scanner;

public class ATMachine extends UsersBankAcc {
    ATMachine(double balance) {
        super(balance);
    }

    void choseOption() {
        Scanner n = new Scanner(System.in);
        do {
            System.out.println("Choose an option: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            choice = n.nextInt();
            if (choice == 1) {
                checkBal();
            } else if (choice == 2) {
                Deposit();
            } else if (choice == 3) {
                Withdrawal();
            }
            else if (choice==4){
                System.out.println("Exiting !");
            }
        }
        while(choice!=4);


    }
}

import java.util.Scanner;
import java.util.Scanner;
public class UsersBankAcc {
    private double balance;
    double amount;
  int choice;
     UsersBankAcc(double balance) {
        this.balance = balance;
         System.out.println("The balance  is "+balance);
    }
    double getBal() {
        return balance;
    }
    void choseOption (){
         Scanner n=new Scanner (System.in);
         choice=n.nextInt();
    }
    void checkBal(){
        System.out.println("The balance in account is "+getBal());
    }
    void Deposit(){
       Scanner s=new Scanner (System.in);
        System.out.println("Enter the amount you want to deposit");
         amount=s.nextDouble();
         this.balance+=amount;
         System.out.println("The balance after deposit is "+balance);
    }
     void Withdrawal() {
         Scanner s=new Scanner (System.in);
         System.out.println("Enter the amount you want to withdraw");
         amount=s.nextDouble();
         if (getBal() >= amount) {
             this.balance -= amount;
             System.out.println("The balance after withdrawal  is " + balance);
         }
         else {
             System.out.println(" Sorry your transaction is failed !" +
                     "Your balance is Insufficient  ");
         }
     }
}

public class Main {
    public static void main(String[] args) {
        ATMachine atm=new ATMachine(20000.00);
        atm.choseOption();
  }
}
