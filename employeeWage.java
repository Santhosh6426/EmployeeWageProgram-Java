import java.util.Random;
class employeeWage {
	public static void main(String args[]){
		System.out.println("Welcome to Employee Wage Computation Program");
		Random rand = new Random();
		int randomNum = rand.nextInt(2);
		if(randomNum==0) {
			System.out.println("Employee is Present");
		}
		else {
			System.out.println("Employee is Absent");
		}
	}
}
