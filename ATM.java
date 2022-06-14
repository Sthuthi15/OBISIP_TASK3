import java.util.Scanner;
public class ATM
{
    public static void main(String args[] )
    { 
        int balance = 50000, withdraw=0, deposit=0;
        try (Scanner s = new Scanner(System.in)) {
            while(true)
            {
                System.out.println("Automated Teller Machine");
                System.out.println("Choose 1 for Withdraw");
                System.out.println("Choose 2 for Deposit");
                System.out.println("Choose 3 for Check Balance");
                System.out.println("Choose 4 for transaction details");
                System.out.println("Choose 5 for exit");
                System.out.print("Choose the operation you want to perform:");
                int n = s.nextInt();
                switch(n)
                {
                    case 1:
                    System.out.print("Enter money to be withdrawn:");
                    withdraw = s.nextInt();
                    if(balance >= withdraw)
                    {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    }
                    else
                    {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;
 
                    case 2:
                    System.out.print("Enter money to be deposited:");
                    deposit = s.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully depsited");
                    System.out.println("");
                    break;
 
                    case 3:
                    System.out.println("Balance : "+balance);
                    System.out.println("");
                    break;
                
                    case 4:
                    System.out.println("Transaction Details");
                    System.out.println("Withdrawn Amount: "+ withdraw);
                    System.out.println("Deposit Amount: "+ deposit);
                    System.out.println("Current balance :"+balance);                        
                    break;
 
                    case 5:
                    System.exit(0);
                }
            }
        }
    }
}