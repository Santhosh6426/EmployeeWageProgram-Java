import java.util.Random;
class employeeWage { 
	public static void main(String args[]){
		System.out.println("Welcome to Employee Wage Computation Program");
		int fullDayHours = 8;
		int wagePerHour = 20;
		Random rand = new Random();
		int randomNum = rand.nextInt(2);
		if(randomNum==0) {
			int dailyWage = fullDayHours * wagePerHour;
			System.out.println("Employee is Present! DailyWage is "+dailyWage);
		}
		else {
			System.out.println("Employee is Absent");
		}
	}
}
