public class Employee{
	String empName, empTitle, empDept;
	int empID, empPayRate, empHours, empWages;
	static int IDCounter = 1;
	
	public void setEmployee(String name, String title, String department,
			int rate, int hours) {
		//Setter for new employee instances
		empName = name;
		empTitle = title;
		empDept = department;
		empPayRate = rate;
		empHours = hours;
		empID = IDCounter;
		empWages = empPayRate * empHours;
		IDCounter++;
	}
	public void moveEmployee(String name, String title, String department, int rate, int hours, int ID) {
		//Employee mover for sorting method
		empName = name;
		empTitle = title;
		empDept = department;
		empPayRate = rate;
		empHours = hours;
		empID = ID;
		empWages = empPayRate * empHours;
	}
	public static void sortByWage(Employee[] payroll) {
		//Bubble sort by Employee wages
		Employee temp = new Employee();
		for(int i=0;i<payroll.length;i++) {
			for (int h=0; h<payroll.length-1;h++) {
				if(payroll[h].empWages < payroll[h+1].empWages) {
					temp.moveEmployee(payroll[h].empName, payroll[h].empTitle,
							payroll[h].empDept, payroll[h].empPayRate,
							payroll[h].empHours, payroll[h].empID);
					payroll[h].moveEmployee(payroll[h+1].empName,
							payroll[h+1].empTitle, payroll[h+1].empDept, 
							payroll[h+1].empPayRate, payroll[h+1].empHours,
							payroll[h+1].empID);
					payroll[h+1].moveEmployee(temp.empName, temp.empTitle,
							temp.empDept, temp.empPayRate, temp.empHours,
							temp.empID);
				}
			}
		}
	}
	public static void printEmpDetails(Employee[] payroll) {
		//Printing loop for array of Employee instances
		for(int i=0; i<payroll.length;i++) {
			System.out.println("Employee ID#" + payroll[i].empID + " : " + payroll[i].empName + ", "
					+ payroll[i].empTitle + " for " + payroll[i].empDept + ", earning $"
					+ payroll[i].empWages + " per week." );
		}
	}
	
	public static void main(String [] args) {
		Employee[] myPayroll = new Employee[7];
		for(int i=0;i<myPayroll.length;i++) {
			myPayroll[i] = new Employee();
		}
		myPayroll[0].setEmployee("Norton", "Emperor", "People", 25, 20);
		myPayroll[1].setEmployee("Karl", "Fog", "Atmosphere", 15, 168);
		myPayroll[2].setEmployee("Dreymond Green", "Power Forward", "Warriors", 600, 4);
		myPayroll[3].setEmployee("Homer Simpson", "Engineer", "Nuclear", 30, 30);
		myPayroll[4].setEmployee("London Breed", "Mayor", "San Francisco", 35, 50);
		myPayroll[5].setEmployee("Bob", "Owner", "Bob's Donuts", 22, 45);
		myPayroll[6].setEmployee("Foo", "Bartender", "Cafeteria", 18, 35);
		sortByWage(myPayroll);
		printEmpDetails(myPayroll);
		
	}
	
	
	
	
	
}