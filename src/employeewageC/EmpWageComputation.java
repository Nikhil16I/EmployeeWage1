package employeewageC;

	  public class EmpWageComputation{

	  public static final int Parttime = 1;
	  public static final int Fulltime = 2;
	 

       public void  ComputeEmployeewage(String companyname,int NumofwrkDays, int MaxHrsinMnth,int EmpRateprHr){
	          int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

                /*Introducing Company Name*/

while (totalEmpHrs <= MaxHrsinMnth &&totalWorkingDays <NumofwrkDays) {
	      totalWorkingDays++;
	 int empCheck = (int) Math.floor(Math.random()* 10) % 3;

       switch (empCheck) {
    case Parttime: //is part time
	empHrs = 4;
	break;

	case Fulltime:
	empHrs = 8;    //is full time
	break;

	default:       //if emp is Absent
    empHrs = 0;

        }

	totalEmpHrs += empHrs;
	 System.out.println(" Number of Days = " + totalWorkingDays + "   Employee Hour = " +empHrs);
	}

        int totalEmpwage = totalEmpHrs * EmpRateprHr;
	        System.out.println();   //space
        System.out.println("Total Employee Wage = " + totalEmpwage);
     }

}
