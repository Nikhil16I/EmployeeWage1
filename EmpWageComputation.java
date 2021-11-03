   public class EmpWageComputation{

            public static void main(String[] args) {
  

             int Parttime = 1;

            int Fulltime = 2;

            int EmpRateprHr = 20; 

                   int EmpHrs = 0;

                    int EmpWage = 0;



                          double empCheck = Math.floor(Math.random()* 10) % 3;

                             if (empCheck == Parttime)

                                EmpHrs = 4; 

                                   else if (empCheck == Fulltime)

                                      EmpHrs = 8;

                                           else
                                                 EmpHrs =0 ;
                                        EmpWage = EmpHrs * EmpRateprHr;

                                            System.out.println("Emp Wage: "+EmpWage);



                }


            }
