	public class UC4{
	static final int IS_FULL_TIME =1;
	static final int IS_PART_TIME =2;
	static final int EMP_RATE_PER_HR=20;
// main method
	public static void main(String[]args){
	 System.out.println("Welcome to emp wage computation ");
	 int empHrs = 0;
	 int empWage = 0;
	 int empCheck = (int) Math.floor(Math.random()* 10) % 3;
// Switch Case
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
	 empWage=empHrs * EMP_RATE_PER_HR;
// Employe Wage
	 System.out.println("Employee_Wage: " + empWage );
	 }
	}
	


