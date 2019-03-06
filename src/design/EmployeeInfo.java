package design;

import java.util.Scanner;

public class EmployeeInfo extends Departments implements Employee{

 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 *
 * Important: YOU MUST USE the
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 * Implement Nested class.
 * Use Exception Handling.
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName="PeopleNTech";
	int employeeId;
	String name;
	static double monthly;
	/*
	 * You must implement the logic for below 2 methods and
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo() {
		System.out.println("Nothing Available");
	};
	public EmployeeInfo(int employeeId){
		this.employeeId=employeeId;
		System.out.println("show ID" + employeeId);
	}

    public EmployeeInfo(String name, int employeeId){
		this.name=name;
		this.employeeId=employeeId;
		System.out.println("ID for" +name + "is" + employeeId);
	}

	public void monthlySalary(int a) {
		System.out.println("Salary of the month is: " + a);
	}

	public void yearlySalary(int a, int b){
		System.out.println("salary of two months are: " + (a+b));
	}

	public void monthlySalary(){
		if (monthly>0){
			System.out.println("Salary Per Annum: "+monthly*6);
		}else{
			System.out.println("Not working");
		}
	}

	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 *
	 */
	public static int calculateEmployeeBonus(int numberOfYearsWithCompany){
		double total=monthly;
		if (numberOfYearsWithCompany>=3){total = (int)monthly * 0.10;
			System.out.println("congratulations you have 10% raise and your new salary is" + total);
			return (int) total;}
		else if (numberOfYearsWithCompany>=2) {
			total = (int)monthly * 0.08;
			System.out.println("your new salary with 8% rais is: " +total);}
		return (int) total;
	}

	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 *
	 */
	public static int calculateEmployeePension(){
		int total=0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);


        //implement numbers of year from above two dates
		//Calculate pension

		if (convertedJoiningDate.endsWith("2015") && convertedTodaysDate.endsWith("2019"))
		{total = ((int) (monthly * 0.15 * 12));
			System.out.println("Your pension is: (excluding salary) "+total);}
		else if (convertedJoiningDate.endsWith("2016") && convertedTodaysDate.endsWith("2019"))
		{total = ((int) (monthly * 0.10 * 12));
			System.out.println("Your pension is: (excluding salary) "+total);}
		else if (convertedJoiningDate.endsWith("2017") && convertedTodaysDate.endsWith("2019"))
		{total = ((int) (monthly * 0.05 * 12));
			System.out.println("Your pension is: (excluding salary) "+total);}


		return total;
	}

	@Override
	public void departements() {
		System.out.println("The Four Departments of this organization are: \n" +dep1+"\n"+dep2+"\n"+dep3+"\n"+dep4+"\n"+dep5);

	}

	@Override
	public int employeeId() {
		return employeeId;
	}

	@Override
	public String employeeName() {
		return name;
	}

	@Override
	public void assignDepartment() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your department name: ");
		String department = s.nextLine();
		if (name==null){
			System.out.println("Please enter your name here: ");
			String nName = s.nextLine();
			System.out.println(nName + " has been assign to " + department);
			this.name = nName;
		} else{
			System.out.println(name + " has been assign to " + department);}


	}

	@Override
	public double calculateSalary() {
		Scanner s = new Scanner(System.in);
		System.out.println("please insert your monthly salary");
		double monthly = s.nextInt();
		this.monthly = monthly;
		System.out.println("monthly salary of "+name +"is" +monthly);
		System.out.println("yearly salary of "+name +"is" +monthly*12);
		return monthly;
	}

	@Override
	public void benefitLayout() {
		System.out.println("All employees get health care benifit");

	}

	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}
