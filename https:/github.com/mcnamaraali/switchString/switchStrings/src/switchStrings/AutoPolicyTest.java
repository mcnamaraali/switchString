package switchStrings;

public class AutoPolicyTest {

	public static void main(String[] args) {
		AutoPolicy autoPolicy1 = new AutoPolicy(12345, "Audi A1", "LK");
		
		//displays whether each policy is in a no-fault state
		policyInNoFaultState(autoPolicy1);

	}
	//method to display policy is in a no-fault state
	private static void policyInNoFaultState(AutoPolicy autoPolicy1) {
		System.out.println ("The auto policy:");
		System.out.printf("Account %d; car %s%n ; state %s;  %s no-fault state %n", 
				autoPolicy1.getAccountNumber(),
				autoPolicy1.getMakeAndModel(), 
				autoPolicy1.getState(),
				(autoPolicy1.isNoFaultState() ? "is": "is not"));
	}

}
