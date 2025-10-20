package entities;

public class TaxPayer {

	private double salaryIncome;
	private double servicesIncome;
	private double capitalIncome;
	private double healthSpending;
	private double educationSpending;
	
	
	public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending,
			double educationSpending) {
		
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(double educationSpending) {
		this.educationSpending = educationSpending;
	}

	public double salaryTax() {
		double monthlySalary = salaryIncome/12;
 		if (monthlySalary < 3000) {
			return 0;
		} else if (monthlySalary <= 5000) {
			return salaryIncome * 0.10;
		} else {
			return salaryIncome * 0.20;
		}
	}
	
	public double serviceTax() {
		return servicesIncome * 0.15;
	}
	public double capitalTax() {
		return capitalIncome * 0.20;
	}
	public double grossTax() {
		return salaryTax() + serviceTax() + capitalTax();
	}
	public double taxRebate() {
		double deductibleExpenses = healthSpending + educationSpending;
		double maxDeductible = 0.30 * grossTax();
		return Math.min(deductibleExpenses, maxDeductible);
	}
	
	public double netTax() {
		return grossTax() - taxRebate();
	}
	
}

