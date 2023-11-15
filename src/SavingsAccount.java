public class SavingsAccount extends Account
{
    private double interestRate;
    public SavingsAccount(int AccountNumber,int Pin,Double Balance,double interestRate) 
    {
        super(AccountNumber,Pin,Balance);
        this.interestRate=interestRate;
    }
    public double getinterestRate()
    {
        return interestRate;
    }
    
}
