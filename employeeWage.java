import java.util.Random;
class employeeWage {
	public static void main(String args[]){
		System.out.println("Welcome to Employee Wage Computation Program");
		int fullDayHours = 8;
		int wagePerHour = 20;
		int partTimeHours = 4;
		int dailyWage = 0;
		int workingDays = 20;
		int monthlyWage = 0;
		Random rand = new Random();
		for(int i=0; i<=workingDays; i++) {
			int randomNum = rand.nextInt(3);
			switch (randomNum) {
			case 0:
				dailyWage = fullDayHours * wagePerHour;
				System.out.println("Employee is Present for full day! DailyWage is "+dailyWage);
				monthlyWage = monthlyWage + dailyWage;
				break;
			case 1:
				dailyWage = partTimeHours * wagePerHour;
				System.out.println("Employee is Present for Halfday. Dailywage is "+dailyWage);
				monthlyWage = monthlyWage + dailyWage;
				break;
			case 2:
				System.out.println("Employee is Absent");
				break;
			}
		System.out.println("Monthly Wage of the Employee is "+monthlyWage);
		}
	}
}
