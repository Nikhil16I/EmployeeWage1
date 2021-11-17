package employeewageC;

public class EmpWageCompany {
	interface InterfaceEmpWageCompany {
		public abstract void AddCompanyEmpWage(String companyname, int totalwrkDays, int maxHrsinMnth, int empRateprHr);

		public abstract void ComputeEmployeewage();
	}

	final int EmpRateprHr;
    final int totalwrkDays;
    final int MaxHrsinMnth;
    final String companyname;

      int totalempwage;

	public EmpWageCompany(int empRateprHr, int totalwrkDays, int maxHrsinMnth, String companyname, int totalempwage) {
		super();
		this.EmpRateprHr = empRateprHr;
		this.totalwrkDays = totalwrkDays;
		this.MaxHrsinMnth = maxHrsinMnth;
		this.companyname = companyname;
		this.totalempwage = totalempwage;
	}

	public int getTotalempwage() {
		return totalempwage;
	}

	public void setTotalempwage(int totalempwage) {
		this.totalempwage = totalempwage;
	}

	

	@Override
	public String toString() {
		return "EmpWageCompany [totalempwage=" + totalempwage + "]";
	}
 
	
	}
	 





 
	