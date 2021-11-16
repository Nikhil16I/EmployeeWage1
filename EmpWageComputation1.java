package employeewageC;

public class EmpWageComputation1 {
	
	    final  int Parttime = 1;
	    final int Fulltime = 2;
	    final int EmpRateprHr;
	    final int totalwrkDays;
	    final int MaxHrsinMnth;
	    final String companyname;

	 int totalempwage;
	 
     

	public EmpWageComputation1(String companyname, int totalwrkDays, int maxHrsinMnth, int empRateprHr) {

		this.EmpRateprHr = empRateprHr;
		this.totalwrkDays = totalwrkDays;
		this.MaxHrsinMnth = maxHrsinMnth;
		this.companyname = companyname;
	
	}


	
	


	public int ComputeEmployeewage(String companyname2, int numofwrkDays, int maxHrsinMnth2, int empRateprHr2){
	          int empHrs = 0,    totalEmpHrs = 0, NumofDays = 0;
               int EmpWage = 0; 
               
	     while (totalEmpHrs <= MaxHrsinMnth && NumofDays <totalwrkDays) {
	    	 NumofDays++;
	       int empCheck = (int) Math.floor(Math.random()* 18) % 3;

	    switch (empCheck) {
	    case Parttime:

	    empHrs = 4;
	    break;
	    case Fulltime:

	    empHrs = 8;
	    break;

	   default:       //if emp is Absent

	   empHrs = 0;
	}

	  totalEmpHrs += empHrs;
	  EmpWage = totalEmpHrs * EmpRateprHr;
	  totalempwage = totalempwage + EmpWage;
	}
       return totalempwage;
	  
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return companyname +"Employee Wage is = " + totalempwage;
	}


}













