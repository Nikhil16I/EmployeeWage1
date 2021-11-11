package employeewageC;

	  public class EmpWageComputation{

	  public static final int Parttime = 1;
	  public static final int Fulltime = 2;
	  public static final int EmpRateprHr= 20;
	  public static final int NumOfwrkDays = 2;
	  public static final int MaxHrsinMnth = 10;

       public void  ComputeEmployeewage(){
	          int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

	     while (totalEmpHrs <= MaxHrsinMnth &&totalWorkingDays <NumOfwrkDays) {
	           totalWorkingDays++;
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
	    System.out.println(" no.of Days - " + totalWorkingDays + " Employee Hour - " +empHrs);
	}

	  int totalEmpwage = totalEmpHrs * EmpRateprHr;
	        System.out.println();   //space
	   System.out.println("Total Employee Wage = " + totalEmpwage);
	}

}










