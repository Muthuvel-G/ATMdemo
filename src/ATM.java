import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ATM 
{
    private HashMap<Integer,Account> accounts;
    public ATM() 
    {
        super();
        accounts=new HashMap<>();
        
    }
    public void AddAccount(int AccountNumber,int pin,double Balance)
    {
    Account account=new Account(AccountNumber, pin, Balance);
    accounts.put(AccountNumber, account);
    }
    public void AddAccount(int AccountNumber,int Pin,double Balance,String Accounttype,double Specificparameter )
    {
        Account account;
    if("Savings".equals(Accounttype))
    {
        account=new SavingsAccount(AccountNumber,Pin,Balance,Specificparameter);
    }
   else if("CuurentAccount".equals(Accounttype))
   {
    account=new CuurentAccount(AccountNumber, Pin, Balance, Specificparameter);
   }
   else
   {
    account=new Account(AccountNumber,Pin,Balance);
   }
    }
    public Boolean ValidatePin(int AccountNumber,int Pin)
    {
     if(accounts.containsKey(AccountNumber))
     { 
        return accounts.get(AccountNumber).GetPin()==Pin;
     }
     return false;
    }
    public HashMap<Integer,Account> GetAccounts()
    {
    return accounts;
    }
    public void DisplayMenu(int AccountNumber)
    {
     System.out.println("1.CheckBalance");
     System.out.println("2.Deposit");
     System.out.println("3.Withdraw");
     System.out.println("4.View Transaction History");
     System.out.println("5.Exit");
     Scanner sc=new Scanner(System.in);
     int Choice=sc.nextInt();
     switch(Choice)
     {
        case 1:
        System.out.println("Balance"+accounts.get(AccountNumber).GetBalance());
        break;
        case 2:
        System.out.println("Enter Your Depsoit Amount");
        double Amount=sc.nextDouble();
        accounts.get(AccountNumber).Debosit(Amount);
        System.out.println("Transaction SuccesFully");
        break;
        case 3:
        System.out.println("Enter Your Withdraw Amount");
        double WithdrawAmount=sc.nextDouble();
        accounts.get(AccountNumber).Withdraw(WithdrawAmount);
        System.out.println("Transaction Succesfully");
        break;
        case 4:
        List<String> transaction=accounts.get(AccountNumber).GettransactionHistory();
        System.out.println("Transaction History");
        for(String Transaction:transaction)
        {
            System.out.println(Transaction);
        }
        break;
        case 5:
        System.out.println("Exiting...");
        System.exit(0);
        break;
        default:
        System.out.println("Invalid Chocie.Please Try Again");
        break;
     }

    }


}
