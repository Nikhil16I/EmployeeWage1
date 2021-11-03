   public class EmpWageComputation{

          public static  final int Parttime = 1;

         public static   final int Fulltime = 2;

    public static  final int EmpRateprHr = 20;

                   public static void main(String[] args) {

                             int EmpHrs = 0; 

                             int EmpWage = 0; 

                             
                int empCheck = (int) Math.floor(Math.random()* 10) % 3;

                     switch (empCheck) {
 
                    case Parttime:
                                      EmpHrs = 4;

                 break;

                    case Fulltime:
                                          EmpHrs = 8;
                 break;
               
                   default:

                       EmpHrs = 0;

                      }

                     EmpWage = EmpHrs * EmpRateprHr;
                    
                     System.out.println("Emp Wage: " + EmpWage);
          }
 
}
