package entities;

public class TaxPayer {

	private double salaryIncome;
	private double servicesIncome;
	private double capitalIncome;
	private double heathSpending;
	private double educationSpending;
	
	
	public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double heathSpending,
			double educationSpending) {
		
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.heathSpending = heathSpending;
		this.educationSpending = educationSpending;
	}

	public double salaryTax() {
		if (salaryIncome >= 60000) {
			return salaryIncome *= 0.2;
		} else if (salaryIncome >= 36000) {
			return salaryIncome *= 0.1;
		} else {
			return salaryIncome  = 0;
		}
	}
	
	public double serviceTax() {
		return servicesIncome *= 0.15;
	}
	public double capitalTax() {
		return capitalIncome *= 0.2;
	}
	public double grossTax() {
		return (salaryIncome + servicesIncome + capitalIncome);
	}
	public double taxRebate() {
		if (heathSpending + educationSpending >= 0.3* grossTax()) {
			return 0.3*grossTax();
		} else {
			return (heathSpending + educationSpending);
			
		}
	}
	
	public double netTax() {
		return grossTax() -  taxRebate();
	}
	
}

