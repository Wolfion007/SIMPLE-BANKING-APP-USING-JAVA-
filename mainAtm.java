import java.util.Scanner;
public class  mainAtm{
    /**
     * @param args
     */
    public static void main(String[] args){
     
        
     Scanner sc= new Scanner(System.in);
     System.out.println("LOGIN ");
     System.out.println("NAME ");
     String name=sc.next();
     System.out.println("ACCOUNT NUMBER ");
     int Accountno=sc.nextInt();
    //for choices
    bankOperation bo= new bankOperation();
    bo.bankOperation();
 
}
}