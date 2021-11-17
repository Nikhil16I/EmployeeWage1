package employeewageC;

import employeewageC.EmpWageCompany.InterfaceEmpWageCompany;

public class EmpWageComputation1 implements InterfaceEmpWageCompany {
	
	    final  int Parttime = 1;
	    final int Fulltime = 2;
	    
	 int Numofcompanies =0;
     
	 EmpWageCompany[]empwageCompanyArray = new EmpWageCompany[5];
	 
	 public void AddCompanyEmpWage(String companyname, int totalwrkDays, int MaxHrsinMnth, int EmpRateprHr) {
		 empwageCompanyArray[Numofcompanies] = new EmpWageCompany(companyname, totalwrkDays, MaxHrsinMnth, EmpRateprHr);
		 Numofcompanies++;
	 }
	public  void ComputeEmployeewage() {
	for(int i = 0; i<Numofcompanies; i++) {
		empwageCompanyArray[i].settotalempwage(this.ComputeEmployeewage(empwageCompanyArray[i]));
		   System.out.println(empwageCompanyArray[i]);
	}
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
	  EmpWage = totalEmpHrs * EmpWageCompany.EmpRateprHr;
	  EmpWageCompany.totalempwage = EmpWageCompany.totalempwage + EmpWage;
	}
       return EmpWageCompany.totalempwage;
	  
	}


}













