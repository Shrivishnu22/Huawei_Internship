package huaweiAssignmentII;

import java.util.ArrayList;

public class Bank {
	
	static ArrayList<String> banks=new ArrayList<>();//Append all the bank names into the ArrayList.
	static{
		banks.add("State Bank Of India");
		banks.add("City Union Bank");
		banks.add("Indian Overseas Bank");
		banks.add("HDFC Bank");
		banks.add("Union Bank of India");
		banks.add("Axis Bank");
	}
	private String bankName;
	
	public Bank(String bankName) {
		super();
		this.bankName=bankName;
			banks.add(bankName);

	}
	public static void BankName()
	{
		
		for(int i=0;i<banks.size();i++)
		{
			System.out.println(i+1+") "+banks.get(i));//prints all bank names on the screen.
		}
	}
}
