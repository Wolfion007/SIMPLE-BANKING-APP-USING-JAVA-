import java.util.Scanner;
public class cashWithdraw extends cashDeposit {
    /**
     * @return
     */
    static  int availbal;
    public static int cashToWithdraw(){
       
        try (Scanner s3 = new Scanner(System.in)) {
            int withdrawAmount=s3.nextInt();
            bankOperation b01= new bankOperation();
            int amountWithdraw=b01.cash;
            cashDeposit cd=new cashDeposit();
            int amountDeposit=cd.cashToDeposit();
            
            if(amountDeposit>=withdrawAmount){
              
               availbal =amountDeposit-withdrawAmount;
                
            }
        }
        return availbal; //int;
    }
   
    
}
