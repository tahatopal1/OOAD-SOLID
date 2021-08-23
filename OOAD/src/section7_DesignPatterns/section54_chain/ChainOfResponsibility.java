package section7_DesignPatterns.section54_chain;

class Loan{
	
	private int amount;
	
	public Loan(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}

abstract class LoanApproval{
	
	protected LoanApproval nextLoanApproval;

	public void setNextLoanApproval(LoanApproval nextLoanApproval) {
		this.nextLoanApproval = nextLoanApproval;
	}
	
	public abstract void approveLoan(Loan loan);
	
}

class Manager extends LoanApproval{

	@Override
	public void approveLoan(Loan loan) {
		if (loan.getAmount() <= 100000) 
			System.out.println("Approved by manager.");
		else
			nextLoanApproval.approveLoan(loan);
	}
	
}

class Director extends LoanApproval{

	@Override
	public void approveLoan(Loan loan) {
		if (loan.getAmount() <= 250000) 
			System.out.println("Approved by director.");
		else
			nextLoanApproval.approveLoan(loan);
	}
	
}

class VicePresident extends LoanApproval{

	@Override
	public void approveLoan(Loan loan) {
		System.out.println("Approved by vice president.");
	}
	
}

public class ChainOfResponsibility {

	public static void main(String[] args) {
		
		LoanApproval m = new Manager();
		LoanApproval d = new Director();
		LoanApproval v = new VicePresident();
		
		// Chain is ready
		m.setNextLoanApproval(d);
		d.setNextLoanApproval(v);
		
		m.approveLoan(new Loan(500000)); // Approved by vice president
	}

}
