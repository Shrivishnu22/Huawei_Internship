package huaweiAssignmentII;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   public static void main(String args[])
   {
	   ArrayList<User> users=new ArrayList<>();
	   
	   Scanner scan=new Scanner(System.in);
	  
	   // Fetch the user name.
	   System.out.println("Enter Your Name : ");
	   String username=scan.nextLine();
	 
	   // Fetch the bank name.
	   System.out.println("Select Bank : ");
	   Bank.BankName();
	   String bankName=Bank.banks.get(scan.nextInt()-1);
	 
	   // Fetch the LoanType
	   System.out.println("Select Loan Type : ");
	   Loan.printLoanType();
	   String LoanName=Loan.loantypes.get(scan.nextInt()-1);
	   boolean goldLoan=false;
	   double grams=0;
	 
	   //Enter the grams of gold when loan comes under gold.
	   if(LoanName=="Gold Loan")
	   {
		   goldLoan=true;
		   System.out.println("Enter the Grams");
		   grams=scan.nextDouble();
	   }
	  
	   //Get the Amount needed for user.
	   System.out.println("Enter the Amount($) which is Required now: ");
	   double amount=scan.nextDouble();
	   
	   //Predict the Period of Repay
	    double iar[]=getIntrestRepayMonth(amount);
	    
	    System.out.println("How much months need to repay it:");
	    iar[0]=scan.nextDouble();
	    
	    //add the user details in arrayList DataType: user
	    User user = new User(username, bankName, LoanName, amount,  grams,iar[1],iar[0],goldLoan);
	    user.toString();
	    users.add(user);
	    
	    System.out.println(user);
	    
	    
   }  
   public static double[] getIntrestRepayMonth(double amount)
   {
	   double arr[]=new double[2];
	  
	   if(amount<10000)
	   {
		   arr[1]=amount*.08;
	   }
	   else
	   {
		   arr[1]=amount*.06;
	   }
	   return arr;
   }
}
