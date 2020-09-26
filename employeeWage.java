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
	static int num=1;
	int hours=0;
	Random rand = new Random();	
	static ArrayList<Integer> totalWage = new ArrayList<Integer>();
	public void monthlyWages() {
		for(int i=0; i<workingDays; i++) {
			if(hours<=workingHours) {
				int randomNum = rand.nextInt(3);
				switch (randomNum) {
				case 0:
					dailyWage = fullDayHours * wagePerHour;
					monthlyWage = monthlyWage + dailyWage;
					hours = hours + fullDayHours;
					break;
				case 1:
					dailyWage = partTimeHours * wagePerHour;
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
			System.out.println("Following are the companies : ");
			System.out.println(org);
			while( num== 1 ) {
			sc.nextLine();
			System.out.println("Enter the company name to get the details : ");
			String company = sc.nextLine();
			for(int m=0; m<numCompany; m++) {
				String val = org.get(m);
				if(company.equals(val)) {
					System.out.println("\nOrganization = "+org.get(m));
					System.out.println("Monthlywage = "+totalWage.get(m)+" TotalHours = "+hr.get(m));
				}
			}
			System.out.println("\nEnter 1 to re - search company details\nenter 0 to exit ");
			num=sc.nextInt();
		}
			System.out.println("Program completed! Thank you!");
			sc.close();
			
		}
}
