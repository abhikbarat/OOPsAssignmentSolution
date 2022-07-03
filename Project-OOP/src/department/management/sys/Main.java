package department.management.sys;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HrDepartment HrDepartment = new HrDepartment();
		AdminDepartment AdminDepartment = new AdminDepartment();
		TechDepartment TechDepartment = new TechDepartment();

		System.out.println("Which Department do you work for?");
		System.out.println("1) Admin Department");
		System.out.println("2) HR Department");
		System.out.println("3) Tech Department");

		int opt = sc.nextInt();

		switch (opt) {
		
		case 1: //Admin Department
			System.out.println("Welcome to " + AdminDepartment.departmentName());
			System.out.println(AdminDepartment.getTodaysWork());
			System.out.println(AdminDepartment.getWorkDeadline());
			System.out.println(AdminDepartment.isTodayAHoliday());
			break;

		case 2: //HR Department 
			System.out.println("Welcome to " + HrDepartment.departmentName());
			System.out.println(HrDepartment.doActivity());
			System.out.println(HrDepartment.getTodaysWork());
			System.out.println(HrDepartment.getWorkDeadline());
			System.out.println(HrDepartment.isTodayAHoliday());
			break;
		
		case 3: //Tech Department
			System.out.println("Welcome to " + TechDepartment.departmentName());
			System.out.println(TechDepartment.getTodaysWork());
			System.out.println(TechDepartment.getWorkDeadline());
			System.out.println(TechDepartment.getTechStackInformation());
			System.out.println(TechDepartment.isTodayAHoliday());
			break;
		default:
			System.out.println("Please enter a valid department");
			sc.close();

		}

	}

}