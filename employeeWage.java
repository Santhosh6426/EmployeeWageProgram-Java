import java.util.Random;
class employeeWage {
	public static void main(String args[]){
		System.out.println("Welcome to Employee Wage Computation Program");
		int fullDayHours = 8;
		int wagePerHour = 20;
		int partTimeHours = 4;
		Random rand = new Random();
		int randomNum = rand.nextInt(3);
		switch (randomNum) {
		case 0:
			int dailyWage = fullDayHours * wagePerHour;
			System.out.println("Employee is Present! DailyWage is "+dailyWage);
			break;
		case 1:
			int dailywage = partTimeHours * wagePerHour;
			System.out.println("Employee is Present for Halfday. Dailywage is "+dailywage);
			break;
		case 2:
			System.out.println("Employee is Absent");
			break;
		}
	}
}
