package employeewageC;

public class MainEmpwage{
	public static void main(String[] args) {		
		System.out.println("Welcome to Employee Wage Computation");
	
EmpWageComputation1 obj  = new EmpWageComputation1 ();
     
obj.AddCompanyEmpWage("TCS", 25, 80, 35);
obj.AddCompanyEmpWage("CapeGemini", 30, 90, 45);
obj.AddCompanyEmpWage("HCL", 35, 85, 30);


 obj.ComputeEmployeewage();
  }
}