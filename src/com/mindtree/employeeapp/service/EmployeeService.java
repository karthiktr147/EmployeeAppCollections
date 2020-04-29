package com.mindtree.employeeapp.service;


import java.util.List;
import java.util.Map;
import java.util.Set;


import com.mindtree.employeeapp.entities.Employee;

public interface EmployeeService {
	public List<Employee> addEmployeeArrayList(Employee employee);
	
	public List<Employee> readEmployeeArrayList();
	
	public List<Employee> updateEmployeeArrayList(String mId,float salary);
	
	public List<Employee> deleteEmployeeArrayList(String mId);
	
	public List<Employee> addEmployeeLinkedList(Employee employee);
	
	public List<Employee> readEmployeeLinkedList();
	
	public List<Employee> updateEmployeeLinkedList(String mId,float salary);
	
	public List<Employee> deleteEmployeeLinkedList(String mId);
	
	public Set<Employee> addEmployeeHashSet(Employee employee);
	
	public Set<Employee> readEmployeeHashSet();
	
	public Set<Employee> updateEmployeeHashSet(String mId,float salary);
	
	public Set<Employee> deleteEmployeeHashSet(String mId);
	
	public Set<Employee> addEmployeeLinkedHashSet(Employee employee);
	
	public Set<Employee> readEmployeeLinkedHashSet();
	
	public Set<Employee> updateEmployeeLinkedHashSet(String mId,float salary);
	
	public Set<Employee> deleteEmployeeLinkedHashSet(String mId);
	
	public Set<Employee> addEmployeeTreeSet(Employee employee);
	
	public Set<Employee> readEmployeeTreeSet();
	
	public Set<Employee> updateEmployeeTreeSet(String mId,float salary);
	
	public Set<Employee> deleteEmployeeTreeSet(String mId);
	
	public Map<Integer,Employee> addEmployeeHashMap(Employee employee);
	
	public Map<Integer,Employee> readEmployeeHashMap();
	
	public Map<Integer,Employee> updateEmployeeHashMap(String mId,float salary);
	
	public Map<Integer,Employee> deleteEmployeeHashMap(String mId);
	
	public Map<Integer,Employee> addEmployeeLinkedHashMap(Employee employee);
	
	public Map<Integer,Employee> readEmployeeLinkedHashMap();
	
	public Map<Integer,Employee> updateEmployeeLinkedHashMap(String mId,float salary);
	
	public Map<Integer,Employee> deleteEmployeeLinkedHashMap(String mId);
	
	public Map<Integer,Employee> addEmployeeTreeMap(Employee employee);
	
	public Map<Integer,Employee> readEmployeeTreeMap();
	
	public Map<Integer,Employee> updateEmployeeTreeMap(String mId,float salary);
	
	public Map<Integer,Employee> deleteEmployeeTreeMap(String mId);
	

}
