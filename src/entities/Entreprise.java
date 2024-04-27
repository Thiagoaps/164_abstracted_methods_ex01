package entities;

public class Entreprise extends TaxPayer{
	
	private Integer numberOfEmployees;
	
	public Entreprise() {
		super();
	}
	
	public Entreprise(String name, Double annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		if (numberOfEmployees < 10) {
			return getAnnualIncome() * 0.16;
		}
		else {
			return getAnnualIncome() * 0.14;
		}
	}

}
