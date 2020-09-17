package OOPSConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		
		HSBCBank h = new HSBCBank();
		h.credit();
		h.debit();
		h.transferMoney();
		h.educationLoan();
		h.carLoan();
		h.mutualFund();
	
		System.out.println("------------------");
		
		// dynamic polymorphism
		// Child class object can be referred by Parent interface reference variable
		
		USBank u = new HSBCBank();  
		u.credit();
		u.debit();
		u.transferMoney();
		
		System.out.println("-------------------");
		
		BrazilBank b = new HSBCBank();
		b.mutualFund();

	}

}
