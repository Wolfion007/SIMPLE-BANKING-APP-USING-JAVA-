import java.util.Scanner;
public class cashDeposit extends bankOperation{
    public static int cashToDeposit(){
        try (Scanner s2 = new Scanner(System.in)) {
            int depositAmount=s2.nextInt();
            bankOperation bo= new bankOperation();
      int balanceDeposit= bo.cash;
      balanceDeposit=balanceDeposit+depositAmount;
      System.out.println("Amount Deposited:"+balanceDeposit);
            

            return balanceDeposit;
        }
    }
}