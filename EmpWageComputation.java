   public class EmpWageComputation{

        

                       public static final int Parttime= 1;

                       public static final int Fulltime = 2;  
                       
                       public static final int EmpRateprHr = 20;

                       public static final int NumOfwrkDays = 2; 
       

             
                                            public static void main(String[] args) {

                                                     int empHrs= 0, empWage = 0, totalEmpWage = 0;



                                                  for (int day = 0; day< NumOfwrkDays; day++) { 

                                                      
                                                      int empCheck = (int) Math.floor(Math.random() * 10) % 3;


                                                    switch (empCheck) { 
                   
                                                       case Parttime:

                                                                   empHrs = 4;

                                                         break;

                                                     case Fulltime: 
                                                                     
                                                                     empHrs= 8;

                                                          break;
   
                                                           default:

                                                                 empHrs= 0;

                                                }

                                                          empWage = empHrs * EmpRateprHr;

                                                         totalEmpWage += empWage;
                   
                                                           System.out.println("Emp Wage: " + empWage);
                                                        } 

                                                           System.out.println("Total Emp Wage;" + totalEmpWage);

                                            }
 
                      }
