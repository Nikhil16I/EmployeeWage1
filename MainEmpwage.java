package employeewageC;

public class MainEmpwage{
	public static void main(String[] args) {		
		System.out.println("Welcome to Employee Wage Computation");
	
EmpWageComputation1 TCS = new EmpWageComputation1 ("TCS",25,80,35);
    TCS.ComputeEmployeewage(null, 0, 0, 0);	
             System.out.println(TCS);	
	
	
EmpWageComputation1 CapeGemini = new EmpWageComputation1("CapeGemini",30,90,45);
    CapeGemini.ComputeEmployeewage(null, 0, 0, 0);
           System.out.println(CapeGemini );    
              
EmpWageComputation1  HCL = new  EmpWageComputation1("HCL",35,85,30);
     HCL.ComputeEmployeewage(null, 0, 0, 0);
              System.out.println(HCL);
  }
}