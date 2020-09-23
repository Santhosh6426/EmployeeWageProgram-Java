import java.util.Random;
public class employeeWage {
	int fullDayHours = 8;
	int wagePerHour = 20;
	int partTimeHours = 4;
	int dailyWage = 0;
	int workingDays = 20;
	public int monthlyWage;
	public int workingHours;
	Random rand = new Random();
	
	public void monthlyWages() {
		for(int i=0; i<=workingDays; i++) {
			if(workingHours<=100) {
				int randomNum = rand.nextInt(3);
				switch (randomNum) {
				case 0:
					dailyWage = fullDayHours * wagePerHour;
					System.out.println("Employee is Present Fullday! DailyWage is "+dailyWage);
					monthlyWage = monthlyWage + dailyWage;
					workingHours = workingHours + fullDayHours;
					break;
				case 1:
					int dailyWage = partTimeHours * wagePerHour;
					System.out.println("Employee is Present for Halfday. Dailywage is "+dailyWage);
					monthlyWage = monthlyWage + dailyWage;
					workingHours = workingHours + partTimeHours;
					break;
				case 2:
					System.out.println("Employee is Absent");
					break;
				}
				System.out.println("Monthly Wage of the Employee is "+monthlyWage);
				System.out.println("Total Working Hours is "+workingHours);
			}
		}
	}
		public static void main(String args[]) {
			System.out.println("Welcome to Employee Wage Computation Program");
			employeeWage obj=new employeeWage();
			System. out. println(); 
			obj.monthlyWage=0;
			obj.workingHours=0;
			System.out.println("Month January");
			obj.monthlyWages();
			System. out. println(); 
			obj.monthlyWage=0;
			obj.workingHours=0;
			System.out.println("Month February");
			obj.monthlyWages();
			System. out. println(); 
			obj.monthlyWage=0;
			obj.workingHours=0;
			System.out.println("Month March");
			obj.monthlyWages();
			System. out. println(); 
			obj.monthlyWage=0;
			obj.workingHours=0;
			System.out.println("Month April");
			obj.monthlyWages();
			
		}
		
	}
