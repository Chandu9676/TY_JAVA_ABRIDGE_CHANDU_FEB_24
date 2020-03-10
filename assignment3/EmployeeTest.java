package com.capgemini.javabasics.assignment3;

public class EmployeeTest {
	public static void main(String[] args) {

		Employees[] details = new Employees[4];

		Employees s1 = new Employees(20114, "Ramesh", 48000);
		Employees s2 = new Employees(20225, "Maruthi", 55000);
		Employees s3 = new Employees(20326, "srinivash", 35000);
		Employees s4 = new Employees(20425, "venkatesh", 40000);
		details[0] = s1;
		details[1] = s2;
		details[2] = s3;
		details[3] = s4;

		printEmployees(details);
		Employees[] s = getEmployees();
		printEmployees(s);

	}

	static void printEmployees(Employees[] stu) {
		for (int i = 0; i < stu.length; i++) {
			System.out.println("name --- " + stu[i].name);
			System.out.println("id --- " + stu[i].id);
			System.out.println("percentage ---- " + stu[i].sal);
		}
	}

	static Employees[] getEmployees() {

		Employees[] details = new Employees[4];

		Employees s1 = new Employees(10144, "vivek", 54000);
		Employees s2 = new Employees(10225, "vijay", 46000);
		Employees s3 = new Employees(10312, "kalyan", 40000);
		Employees s4 = new Employees(10465, "Raviteja", 65000);
		details[0] = s1;
		details[1] = s2;
		details[2] = s3;
		details[3] = s4;
		return details;
	}
}
