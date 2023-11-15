public class CuurentAccount  extends Account
{
    private Double OverDraftLimit;
    public CuurentAccount(int AccountNumber,int Pin,Double Balance,Double OverDraftLimit) 
    {
        super(AccountNumber, Pin, Balance);
        this.OverDraftLimit=OverDraftLimit;

        
    }
    public double OverDraftLimit()
    {
       
        return OverDraftLimit;
    }
    
     public boolean Withdraw(double Amount)
    {
        double totalfund=GetBalance()+OverDraftLimit;
        if(totalfund>=Amount)
        {
            SetBalance(GetBalance()-Amount);
            AddToTransactionHistory("Withdrawal: -"+Amount);
            return true;
        }
        else{
            System.out.println("Insufficient Fund");
            return false;
        }
    }
    
   
   
}
