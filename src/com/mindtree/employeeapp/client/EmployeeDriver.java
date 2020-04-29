package com.mindtree.employeeapp.client;


import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


import com.mindtree.employeeapp.entities.Employee;
import com.mindtree.employeeapp.service.EmployeeService;
import com.mindtree.employeeapp.service.impl.EmployeeServiceImpl;
import com.mindtree.employeeapp.utilities.DisplayUtilities;
import com.mindtree.employeeapp.utilities.InputUtilities;

public class EmployeeDriver {
static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		int flag=0,choice =0;
		EmployeeService empObject=new EmployeeServiceImpl();
		do
		{
			DisplayUtilities.displayMessage("Press 1 to add Employess");
			DisplayUtilities.displayMessage("Press 2 to display all the employees data");
			DisplayUtilities.displayMessage("Press 3 to update salary by mid");
			DisplayUtilities.displayMessage("Press 4 to delete by mid");
			choice=InputUtilities.getInt(scan);
			switch(choice)
			{
			case 1:
				Employee emp=InputUtilities.getEmployeeData(scan);
				List<Employee> arrayList=empObject.addEmployeeArrayList(emp);
				List<Employee> linkedList=empObject.addEmployeeLinkedList(emp);
				Set<Employee> hashSet=empObject.addEmployeeHashSet(emp);
				Set<Employee> linkedHashSet=empObject.addEmployeeLinkedHashSet(emp);
				Set<Employee> treeSet=empObject.addEmployeeTreeSet(emp);
				Map<Integer,Employee> hashMap=empObject.addEmployeeHashMap(emp);
				Map<Integer,Employee> linkedHashMap=empObject.addEmployeeLinkedHashMap(emp);
				Map<Integer,Employee> treeMap=empObject.addEmployeeTreeMap(emp);
				System.out.println("array List : "+arrayList);
				System.out.println("Linked List : "+linkedList);
				System.out.println("hash set : "+hashSet);
				System.out.println("linked hash set : "+linkedHashSet);
				System.out.println("tree set : "+treeSet);
				System.out.println("hashmap : "+hashMap);
				System.out.println("linked hashmap : "+linkedHashMap);
				System.out.println("treemap : "+treeMap);
				break;
			case 2:
				
				List<Employee> arrayList1=empObject.readEmployeeArrayList();
				List<Employee> linkedList1=empObject.readEmployeeLinkedList();
				Set<Employee> hashSet1=empObject.readEmployeeHashSet();
				Set<Employee> linkedHashSet1=empObject.readEmployeeLinkedHashSet();
				Set<Employee> treeSet1=empObject.readEmployeeTreeSet();
				Map<Integer,Employee> hashMap1=empObject.readEmployeeHashMap();
				Map<Integer,Employee> linkedHashMap1=empObject.readEmployeeLinkedHashMap();
				Map<Integer,Employee> treeMap1=empObject.readEmployeeTreeMap();
				System.out.println("array List : "+arrayList1);
				System.out.println("Linked List : "+linkedList1);
				System.out.println("hash set : "+hashSet1);
				System.out.println("linked hash set : "+linkedHashSet1);
				System.out.println("tree set : "+treeSet1);
				System.out.println("hashmap : "+hashMap1);
				System.out.println("linked hashmap : "+linkedHashMap1);
				System.out.println("treemap : "+treeMap1);
				break;
			case 3:
				DisplayUtilities.displayMessage("Enter the mid to be updated : ");
				String mId=InputUtilities.getString(scan);
				DisplayUtilities.displayMessage("Enter the salary to be update : ");
				float salary=InputUtilities.getFloat(scan);
				List<Employee> arrayList12=empObject.updateEmployeeArrayList(mId, salary);
				List<Employee> linkedList12=empObject.updateEmployeeLinkedList(mId, salary);
				Set<Employee> hashSet12=empObject.updateEmployeeHashSet(mId, salary);
				Set<Employee> linkedHashSet12=empObject.updateEmployeeLinkedHashSet(mId, salary);
				Set<Employee> treeSet12=empObject.updateEmployeeTreeSet(mId, salary);
				Map<Integer,Employee> hashMap12=empObject.updateEmployeeHashMap(mId, salary);
				Map<Integer,Employee> linkedHashMap12=empObject.updateEmployeeLinkedHashMap(mId, salary);
				Map<Integer,Employee> treeMap12=empObject.updateEmployeeTreeMap(mId, salary);
				System.out.println("array List : "+arrayList12);
				System.out.println("Linked List : "+linkedList12);
				System.out.println("hash set : "+hashSet12);
				System.out.println("linked hash set : "+linkedHashSet12);
				System.out.println("tree set : "+treeSet12);
				System.out.println("hashmap : "+hashMap12);
				System.out.println("linked hashmap : "+linkedHashMap12);
				System.out.println("treemap : "+treeMap12);
				break;
			case 4:
				DisplayUtilities.displayMessage("Enter the mid to be updated : ");
				String mId1=InputUtilities.getString(scan);
				List<Employee> arrayList3=empObject.deleteEmployeeArrayList(mId1);
				List<Employee> linkedList3=empObject.deleteEmployeeLinkedList(mId1);
				Set<Employee> hashSet3=empObject.deleteEmployeeHashSet(mId1);
				Set<Employee> linkedHashSet3=empObject.deleteEmployeeLinkedHashSet(mId1);
				Set<Employee> treeSet3=empObject.deleteEmployeeTreeSet(mId1);
				Map<Integer,Employee> hashMap3=empObject.deleteEmployeeHashMap(mId1);
				Map<Integer,Employee> linkedHashMap3=empObject.deleteEmployeeLinkedHashMap(mId1);
				Map<Integer,Employee> treeMap3=empObject.deleteEmployeeTreeMap(mId1);
				System.out.println("array List : "+arrayList3);
				System.out.println("Linked List : "+linkedList3);
				System.out.println("hash set : "+hashSet3);
				System.out.println("linked hash set : "+linkedHashSet3);
				System.out.println("tree set : "+treeSet3);
				System.out.println("hashmap : "+hashMap3);
				System.out.println("linked hashmap : "+linkedHashMap3);
				System.out.println("treemap : "+treeMap3);
				
				break;
			default :
				flag=1;
				break;
			}
		}while(flag==0);
	}
}
