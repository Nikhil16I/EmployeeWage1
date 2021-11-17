package employeewageC;

import java.util.ArrayList;

import employeewageC.EmpWageCompany.InterfaceEmpWageCompany;

public class EmpWageComputation1 implements InterfaceEmpWageCompany {
	
	    final  int Parttime = 1;
	    final int Fulltime = 2;
	    
     
static ArrayList<EmpWageCompany>empwageCompanyArray = new ArrayList<EmpWageCompany>();
	 
	 public void AddCompanyEmpWage(String companyname, int totalwrkDays, int MaxHrsinMnth, int EmpRateprHr) {
		 EmpWageCompany EmpWageCompany = new EmpWageCompany(companyname, totalwrkDays, MaxHrsinMnth, EmpRateprHr);
		 empwageCompanyArray.add(EmpWageCompany)
	 }
	public  void ComputeEmployeewage() {
	for(int i = 0; i<empwageCompanyArray.size(); i++) {
		EmpWageCompany empwageCompanyArray = empwageCompanyArray.get(i);
		empwageCompanyArray.settotalempwage(this.ComputeEmployeewage(empwageCompanyArray));
		   System.out.println(empwageCompanyArray);
	}
}

	public int ComputeEmployeewage(EmpWageCompany empwageCompanyArray){
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













