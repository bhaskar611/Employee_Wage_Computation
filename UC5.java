	public class UC5{
	static final int IS_FULL_TIME =1;
	static final int IS_PART_TIME =2;
	static final int EMP_RATE_PER_HRS=20;
	static final int NUM_OF_WORKING_DAYS=20;

// main Method
	public static void main(String[]args){

	 int empHrs = 0;
	 int empWage = 0;
	 int totalEmpWage=0;
	 for (int day=0; day < NUM_OF_WORKING_DAYS ; day++ ) {
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
	   empWage=empHrs * EMP_RATE_PER_HRS;
	   totalEmpWage += empWage;
	   System.out.println("Employee_Wage: " + empWage );
	  }
	   System.out.println("Total_Employe_Wage: " + totalEmpWage );
	 }
	}




