package employeewageC;
import java.util.Scanner;

public class MainEmpwage{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmpWageComputation emp = new EmpWageComputation();
		
		
		System.out.print("Enter number of companies to Calaculate Company Wages = ");
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			sc.nextLine();

	System.out.print("Name of the company =  ");
		String companyname = sc.nextLine();
			
	System.out.print("Input monthly Max working days of that company = ");
		int NumofwrkDays = sc.nextInt();
			
	System.out.print("Input Max working Hour of that company = ");
		int MaxHrsinMnth = sc.nextInt();
			
	System.out.print("Input Wage per Hourof the company = ");
		int EmpRateprHr = sc.nextInt();
			emp.ComputeEmployeewage(companyname, NumofwrkDays, MaxHrsinMnth, EmpRateprHr);
	
			
		}
			
	}
}
