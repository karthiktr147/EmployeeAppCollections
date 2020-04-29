package com.mindtree.employeeapp.utilities;

import java.util.Scanner;

import com.mindtree.employeeapp.entities.Employee;

public class InputUtilities
{
public static int getInt(Scanner scan) throws NumberFormatException {
	int intNumber = 0;
	
	try {
		intNumber = Integer.parseInt(scan.nextLine());
	
	} catch (NumberFormatException f) {
		throw new NumberFormatException("Please enter the Integer value and try again : ");
	}
	return intNumber;
}
public static double getDouble(Scanner scan)throws NumberFormatException
{
	double doubleNumber=0;
	try
	{
		doubleNumber=Double.parseDouble(scan.nextLine());
	}
	catch(NumberFormatException f)
	{
		throw new NumberFormatException("Please Enter the double value and try again");
	}
	return doubleNumber;
}
public static float getFloat(Scanner scan)throws NumberFormatException
{
	float floatNumber=0;
	try
	{
		floatNumber=Float.parseFloat(scan.nextLine());
	}
	catch(NumberFormatException f)
	{
		throw new NumberFormatException("Please Enter the double value and try again");
	}
	return floatNumber;
}
public static String getString(Scanner scan)
{
	String string="";
		string=scan.nextLine();
	return string;
}
public static Employee getEmployeeData(Scanner scan)
{
	Employee emp= new Employee();
	DisplayUtilities.displayMessage("Enter the mid : ");
	String mId=getString(scan);
	emp.setmId(mId);
	DisplayUtilities.displayMessage("Enter the name : ");
	String employeeName=getString(scan);
	emp.setEmployeeName(employeeName);
	DisplayUtilities.displayMessage("Enter the salary : ");
	float salary=getFloat(scan);
	emp.setSalary(salary);
	DisplayUtilities.displayMessage("Enter the track : ");
	String track=getString(scan);
	emp.setTrack(track);
	return emp;
}

}