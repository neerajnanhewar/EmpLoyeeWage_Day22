interface Present{
	public void PresentCheck();
} 
class PresentCheck implements Present{
	public static final int Is_Present = 1 ;
	double checkPresent = Math.floor(Math.random()*10) % 2 ;
	public void PresentCheck(){
		if(checkPresent== Is_Present){
			System.out.println("Employee is Present");
		}else{
			System.out.println("Employee is Absent");
		}
	}
}
class EmployeeWageBuilder {
	public static void main (String[] args){
		PresentCheck p_check = new PresentCheck();
		p_check.PresentCheck();
	}
}