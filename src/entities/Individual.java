package entities;

public class Individual extends TaxPayer{

	private Double healthCare;
	
	public Individual() {
		super();
	}
		
	public Individual(String name, Double annualIncome, Double healthCare) {
		super(name, annualIncome);
		this.healthCare = healthCare;
	}
	
	public Double getHealthCare() {
		return healthCare;
	}

	public void setHealthCare(Double healthCare) {
		this.healthCare = healthCare;
	}

	@Override
	public double tax() {
		if(getAnnualIncome() < 20000.00) {
			return getAnnualIncome() * 0.15 - healthCare * 0.50;
		}
		else {
			return getAnnualIncome() * 0.25 - healthCare * 0.50;
		}
	}
}
