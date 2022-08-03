package entities;

public class TaxPayer {
	
	private double salaryincome;
	private double servicesincome;
	private double capitalincome;
	private double healthSpending;
	private double educationSpending;
	
	public TaxPayer() {
		
	}   

	public TaxPayer(double salaryincome, double servicesincome, double capitalincome, double healthSpending,
			double educationSpending) {
		this.salaryincome = salaryincome;
		this.servicesincome = servicesincome;
		this.capitalincome = capitalincome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public double getSalaryincome() {
		return salaryincome;
	}

	public void setSalaryincome(double salaryincome) {
		this.salaryincome = salaryincome;
	}

	public double getServicesincome() {
		return servicesincome;
	}

	public void setServicesincome(double servicesincome) {
		this.servicesincome = servicesincome;
	}

	public double getCapitalincome() {
		return capitalincome;
	}

	public void setCapitalincome(double capitalincome) {
		this.capitalincome = capitalincome;
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
		if (salaryincome / 12 >= 5000.00) {
			return salaryincome * 0.20;
		
		} else if (salaryincome / 12 < 3000.00) {
			return salaryincome = 0.00;
			
			
		} else {
			return salaryincome * 0.10;
		}
    }
    
    public double servicesTax() { 
    	return servicesincome * 0.15;
    }
    
    public double capitalTax() { 
    	return capitalincome * 0.20;
    }
    
    public double grossTax() {
    	return salaryTax() + servicesTax() + capitalTax();
    }
    
    public double TaxRebate() {	
    	
    	if ((grossTax() * 0.30) < (healthSpending + educationSpending)) {
			return grossTax() * 0.30;
		} 
    	else {
			return healthSpending + educationSpending;
		}
    }
    
    public double netTax() {
    	return grossTax() - TaxRebate();
    }
    		
}
