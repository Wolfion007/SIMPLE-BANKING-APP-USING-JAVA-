import java.util.Scanner;
public class bankOperation {
    
    int balance=10000;
    int cash=balance;
    public static void bankOperation(){
  
          
     while(true){
        cashDeposit cd = new cashDeposit();
        cashWithdraw cw= new cashWithdraw();
        printSlip  ps= new printSlip();

        Scanner s1= new Scanner(System.in);
        System.out.println("CHOICES");
        System.out.println(".............");
        System.out.println("CHOOSE 1 TO DEPOSIT");
         System.out.println("CHOOSE 2 TO WITHDRAW");
         System.out.println("CHOOSE 3 TO BALANCE ENQUIRY");
         System.out.println("CHOOSE 4  TO PRINT THE  SLIP");
         //getting choices
         int choice=s1.nextInt();
    
         switch(choice){
    
         case 1:
         System.out.println("CHOOSE AMOUNT TO DEPOSIT");
         cd.cashToDeposit();
        
         break;
    
         case 2:
         System.out.println("CHOOSE AMOUNT TO WITHDRAW");
         cw.cashToWithdraw();
         
         break;
    
         case 3:
         System.out.println("THE BALANCE IS");
          ps.printTheSlip();
         break;
    
         case 4:
         System.out.println("HERE'S YOUR BALANCE SLIP");
    
        
         break;
        }
    }
    
    }
    
}
