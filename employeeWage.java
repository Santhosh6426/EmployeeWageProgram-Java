import java.util.*;
import java.util.Random;
public class employeeWage {
	public String organization;
	int fullDayHours = 8;
	public int wagePerHour;
	int partTimeHours = 4;
	int dailyWage = 0;
	public int workingDays;
	public int monthlyWage;
	public int workingHours;
	int hours=0;
	Random rand = new Random();
	
	public void monthlyWages() {
		for(int i=0; i<=workingDays; i++) {
			if(hours<=workingHours) {
				int randomNum = rand.nextInt(3);
				switch (randomNum) {
				case 0:
					dailyWage = fullDayHours * wagePerHour;
					System.out.println("Employee is Present Fullday! DailyWage is "+dailyWage);
					monthlyWage = monthlyWage + dailyWage;
					hours = hours + fullDayHours;
					break;
				case 1:
					int dailyWage = partTimeHours * wagePerHour;
					System.out.println("Employee is Present for Halfday. Dailywage is "+dailyWage);
					monthlyWage = monthlyWage + dailyWage;
					hours = hours + partTimeHours;
					break;
				case 2:
					System.out.println("Employee is Absent");
					break;
				}
				System.out.println("Monthly Wage of the Employee is "+monthlyWage);
				System.out.println("Total Working Hours is "+hours);
			}
		}
	}
		public static void main(String args[]) {
			System.out.println("Welcome to Employee Wage Computation Program");
			employeeWage obj=new employeeWage();
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter the namee of the Organization : ");
			obj.organization=sc.nextLine();
			System.out.print("Enter max number of working days in a month- ");
			obj.workingDays=sc.nextInt();
			obj.monthlyWage=0;
			System.out.print("Enter max number of Working Hours in a month- ");
			obj.workingHours=sc.nextInt();
			System.out.print("Enter Wage per hour - ");
			obj.wagePerHour=sc.nextInt();
			System. out. println();
			System.out.println("Organization : "+obj.organization);
			obj.monthlyWages();
			
		}
		
	}
