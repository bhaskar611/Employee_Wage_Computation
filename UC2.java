	public class UC2{

static final int IS_FULL_TIME =1;
static final int IS_PART_TIME =2;
static final int EMP_RATE_PER_HRS=20;

	public static void main(String[]args){

 	int empHrs = 0;
	int empWage = 0;
 	double empCheck =Math.floor(Math.random()* 10) % 3;
	if (empCheck == IS_FULL_TIME)
    		empHrs=8;
 	else if ( empCheck == IS_PART_TIME )
    		empHrs=8;
 	else
    		empHrs=0;
 	empWage=empHrs * EMP_RATE_PER_HRS;
//print Employe Wage
 	System.out.println("Emp Wage: " + empWage );


}
}







