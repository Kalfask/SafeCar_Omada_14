
public class InsuranceContract {
	private Customer customer;
	private Vehicle vehicle;
	private InsurancePolicy insurancepolicy;
	private double cost;
	
	public InsuranceContract(Customer customer, Vehicle vehicle, InsurancePolicy insurancepolicy, double cost) {
		this.customer = customer;
		this.vehicle = vehicle;
		this.insurancepolicy = insurancepolicy;
		this.cost = cost;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public InsurancePolicy getInsurancepolicy() {
		return insurancepolicy;
	}

	public void setInsurancepolicy(InsurancePolicy insurancepolicy) {
		this.insurancepolicy = insurancepolicy;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
}
