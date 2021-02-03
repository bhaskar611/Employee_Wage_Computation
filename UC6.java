public class UC6{
 static final int IS_FULL_TIME =1;
 static final int IS_PART_TIME =2;
 static final int EMP_RATE_PER_HRS=20;
 static final int WORKING_DAYS=20;
 static final int MAX_HRS=100;
 
 public static void main(String[]args){

   int empHrs = 0;
   int empWage = 0;
   int totalEmpHrs=0;
   int totalEmpWage=0;
   int count=0;
    while (totalEmpHrs <= MAX_HRS &
         count < WORKING_DAYS) {
     count++;

     int empCheck = (int) Math.floor(Math.random()* 10) % 3;
     switch (empCheck){
       case IS_PART_TIME:
          empHrs=8;
          break;
       case IS_FULL_TIME:
          empHrs=8;
          break;
       default:
         empHrs=0;
    }
    totalEmpHrs += empHrs;
    System.out.println("Day#: "  + count + " Emp Hr: " +empHrs );
    System.out.println( totalEmpHrs );
   }
   totalEmpWage=totalEmpHrs * EMP_RATE_PER_HRS;
   System.out.println("Total Emp Wage: " + totalEmpWage );
 }
}
