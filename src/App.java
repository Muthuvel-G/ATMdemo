import java.util.Scanner;

public class App {
    public static void main(String[] args)  
    {
           ATM atm=new ATM();
           atm.AddAccount(1234, 1212, 100); 
           atm.AddAccount(123456, 1122, 100,"Savings", 0.05);
           atm.AddAccount(654321, 2211, 500, "Current", 100.0);
           System.out.println("Enter Your AccountNumber");
           Scanner sc=new Scanner(System.in);
           int AccountNumber=sc.nextInt();
           System.out.println("Enter Your Pin");
           int Pin=sc.nextInt();
           
           if(atm.ValidatePin(AccountNumber, Pin))
           {
            while(true)
            {
                atm.DisplayMenu(AccountNumber);
            }
           }
           else
           {
            System.out.println("Invalid AccountNumber or Pin");
           }
           }
}
