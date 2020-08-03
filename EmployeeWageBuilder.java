
interface EmployeeWage{
	public void emp_Wage_Cal();
} 
class Wage_Cal implements EmployeeWage{
	public static final int Is_Full_Time = 1 ;
	public static final int Is_Part_Time = 2;
	public static final int Emp_Rate_PerHr=20;
	int emp_FullDay_Hr = 0 ;
	int emp_Wage = 0 ;
	double empCheck = Math.floor(Math.random()*10) % 3 ;
	public void emp_Wage_Cal(){
		if(empCheck == Is_Full_Time){
			emp_FullDay_Hr=12;
		}else if(empCheck == Is_Part_Time){
			emp_FullDay_Hr=8;
		}else{
			System.out.println("Employee is Absent");
		}
		emp_Wage = Emp_Rate_PerHr * emp_FullDay_Hr ;
		System.out.println("Employee Total wage is " + emp_Wage);
	}
}
class EmployeeWageBuilder {
	public static void main (String[] args){
		Wage_Cal wagecal= new Wage_Cal();
		wagecal.emp_Wage_Cal();
	}
}