import java.util.*;
public class employeeWage {
	int fullDayHours = 8;
	public static int numCompany;
	private static ArrayList<Integer> org;
	public int wagePerHour;
	int partTimeHours = 4;
	int dailyWage = 0;
	public int workingDays;
	public int monthlyWage;
	public int workingHours;
	int hours=0;
	Random rand = new Random();	
	static ArrayList<Integer> totalWage = new ArrayList<Integer>();
	public void monthlyWages() {
		for(int i=0; i<=workingDays; i++) {
			if(hours<=workingHours) {
				int randomNum = rand.nextInt(3);
				switch (randomNum) {
				case 0:
					dailyWage = fullDayHours * wagePerHour;
					monthlyWage = monthlyWage + dailyWage;
					hours = hours + fullDayHours;
					break;
				case 1:
					int dailyWage = partTimeHours * wagePerHour;
					monthlyWage = monthlyWage + dailyWage;
					hours = hours + partTimeHours;
					break;
				case 2:
					break;
				}
				}
			
			}
    
}
		public static void main(String args[]) {
			System.out.println("Welcome to Employee Wage Computation Program");
			employeeWage obj=new employeeWage();
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter number of commpany details to be entered : ");
			numCompany=sc.nextInt();
			ArrayList<Integer> totalWage = new ArrayList<Integer>();
			ArrayList<String> org = new ArrayList<String>();
			ArrayList<Integer> hr = new ArrayList<Integer>();
			for(int j=1;j<=numCompany; j++) {
				sc.nextLine();
				System.out.println("Enter the name of the Organization - ");
				String organization = sc.nextLine();
				System.out.println();
				System.out.print("Enter max number of working days in a month - ");
				obj.workingDays=sc.nextInt();
				obj.monthlyWage=0;
				obj.hours=0;
				System.out.print("Enter max number of Working Hours in a month - ");
				obj.workingHours=sc.nextInt();
				System.out.print("Enter Wage per hour - ");
				obj.wagePerHour=sc.nextInt();
				System. out. println();
				obj.monthlyWages();	
				org.add(organization);	
				totalWage.add(obj.monthlyWage);
				hr.add(obj.hours);
				
			}
			for(int k=1; k<=numCompany; k++) {
			System.out.println("Organization = "+org.get(k-1));
			System.out.println("Monthlywage = "+totalWage.get(k-1)+" TotalHours = "+hr.get(k-1));
			}
			sc.close();
			
		}
		
	}
