public class Buisness_Data {
	private Statistics _statistics;
	private float _sales;
	private float _income;
	private float _expenses;
	private float _profit;
	private float _payroll;
	private Employee_Catalog employess;
	public Screen _prints;


	public float getSales() {
		return this._sales;
	}

	public void setSales(float aSales) {
		this._sales = aSales;
	}

	


	public float getIncome() {
		return this._income;
	}

	public void setIncome(float aIncome) {
		this._income = aIncome;
	}



	public float getExpenses() {
		return this._expenses;
	}

	public void setExpenses(float aExpenses) {
		this._expenses = aExpenses;
	}

	

	public float getProfit() {
		return this._profit;
	}

	public void setProfit(float aProfit) {
		this._profit = aProfit;
	}

	

	public float getPayroll() {
		return this._payroll;
	}

	public void setPayroll(float aPayroll) {
		this._payroll = aPayroll;
	}

	public Buisness_Data(float _sales, float _income, float _expenses, float _profit, float _payroll,
			Employee_Catalog employess) {
		super();
		this._sales = _sales;
		this._income = _income;
		this._expenses = _expenses;
		this._profit = _profit;
		this._payroll = _payroll;
		this.employess = employess;
	}

}