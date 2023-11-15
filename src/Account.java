import java.util.ArrayList;
import java.util.List;

public class Account 
{
    private int AccountNumber;
    private int pin;
    private double Balance;
    ArrayList<String>transactionHistory;
    public Account(int Accoutnumber,int pin,double Balance) 
    {
        super();
        this.AccountNumber=Accoutnumber;
        this.pin=pin;
        this.Balance=Balance;
        this.transactionHistory=new ArrayList<>();

    }
    public Double GetBalance()
    {
        return Balance;
    }
    public void Debosit(Double Amount)
    {
        Balance +=Amount;
        transactionHistory.add("Debosit"+Amount);
    }
    protected boolean Withdraw(Double Amount)
    { 
     if(Amount<Balance)
        {
          Balance -=Amount;
          transactionHistory.add("Withdraw"+Amount);
          return true;
        }
       else
       {
        System.out.println("No Balance");
        return false;
       } 
     }
     public List<String> GettransactionHistory()
     {
       return transactionHistory;
     }
     public int GetPin()
     {
        return pin;
     }
     protected void AddToTransactionHistory(String transaction)
     {
      transactionHistory.add(transaction);
     }
     protected void SetBalance(Double Amount)
     {
       Balance=Amount;
     }
}
