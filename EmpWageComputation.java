   public class EmpWageComputation{

            public static void main(String[] args){



int PartTime = 1;

int FullTime = 2;

int EmpRateprHr= 20;



              int EmpHrs = 0;

              int EmpWage = 0; 

                  double empCheck = Math.floor(Math.random() * 10) % 3;

            if (empCheck == PartTime)

                       EmpHrs = 4;

            else if (empCheck == FullTime)

                        EmpHrs = 8;

                   else

               EmpWage = EmpHrs * EmpRateprHr;

                     System.out.println("Emp Wage:" + EmpWage);

          }

     }
