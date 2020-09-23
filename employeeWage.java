import java.util.Random;
class employeeWage {
	public static void main(String args[]){
		System.out.println("Welcome to Employee Wage Computation Program");
		int fullDayHours = 8;
		int wagePerHour = 20;
		int partTimeHours = 4;
		Random rand = new Random();
		int randomNum = rand.nextInt(3);
		if(randomNum==0) {
			int dailyWage = fullDayHours * wagePerHour;
			System.out.println("Employee is Present! DailyWage is "+dailyWage);
		}
		else if(randomNum==1) {
			int dailyWage = partTimeHours * wagePerHour;
			System.out.println("Employee is Present for Halfday. Dailywage is "+dailyWage);
		}
		else {
			System.out.println("Employee is Absent");
		}
	}
}
