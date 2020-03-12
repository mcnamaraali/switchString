package switchStrings;

public class AutoPolicy {
	private int accountNumber;
	private String makeAndModel;
	private String state;

	//constructor
	public AutoPolicy(int accountNumber, String makeAndModel, String state) {
		this.accountNumber = accountNumber;
		this.makeAndModel = makeAndModel;
		this.state = state;
	}
	
	//sets the accountNumber 
	public void setAccountNumber (int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	//gets the accountNumber
	public int getAccountNumber () {
		return accountNumber;
	}
	
	//sets the Make and Model of the car
	public void setMakeAndModel (String makeAndModel) {
		this.makeAndModel = makeAndModel;
	}
	
	//returns the make and model
	public String getMakeAndModel () {
		return makeAndModel;
	}
	
	//sets the state
	public void setState (String state) {
		this.state = state;
	}
	
	//returns the state
	public String getState () {
		return state;
	}
	
	//predicate method returns the state has no-fault insurance
	public boolean isNoFaultState() {
		boolean noFaultState;
		
		//determine whether state has no-fault car insurance
		switch (getState()) {
			case "LK" : case "GY" : case "KY":
				noFaultState = true;
				break;
			default:
				noFaultState = false;
				break;
		}
		return noFaultState;
		
	}
	
	

}
