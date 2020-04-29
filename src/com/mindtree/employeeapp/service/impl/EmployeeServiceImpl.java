package com.mindtree.employeeapp.service.impl;

import java.util.ArrayList;
import java.util.Collections;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import com.mindtree.employeeapp.entities.Employee;
import com.mindtree.employeeapp.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	List<Employee> arrayList = new CopyOnWriteArrayList<Employee>();
	List<Employee> linkedList = new LinkedList<Employee>();
	Set<Employee> hashSet = new HashSet<Employee>();
	Set<Employee> linkedHashSet = new LinkedHashSet<Employee>();
	Set<Employee> treeSet = new TreeSet<Employee>();
	Map<Integer, Employee> hashMap = new ConcurrentHashMap<Integer, Employee>();
	Map<Integer, Employee> linkedHashMap = new LinkedHashMap<Integer, Employee>();
	Map<Integer, Employee> treeMap = new TreeMap<Integer, Employee>();
	static int i = 0, j = 0, k = 0;

	@Override
	public List<Employee> addEmployeeArrayList(Employee employee) {
		arrayList.add(employee);
		return arrayList;
	}

	@Override
	public List<Employee> readEmployeeArrayList() {
		Collections.sort(arrayList);
		return arrayList;
	}

	@Override
	public List<Employee> updateEmployeeArrayList(String mId, float salary) {
		for (Employee emp : arrayList) {
			if (emp.getmId().equals(mId)) {
				Employee newTempEmp = new Employee();
				int position = arrayList.indexOf(emp);
				newTempEmp.setmId(mId);
				newTempEmp.setEmployeeName(emp.getEmployeeName());
				newTempEmp.setSalary(salary);
				newTempEmp.setTrack(emp.getTrack());
				arrayList.set(position, newTempEmp);
			}
		}
		return arrayList;
	}

	@Override
	public List<Employee> deleteEmployeeArrayList(String mId) {
		List<Employee> linkedList1 = new LinkedList<Employee>();

		for (Employee emp : arrayList) {
			if (emp.getmId().equals(mId)) {

			} else
				linkedList1.add(emp);
		}

		ArrayList<Employee> arrayList2 = new ArrayList<Employee>(linkedList1);
		return arrayList2;
	}

	@Override
	public List<Employee> addEmployeeLinkedList(Employee employee) {
		linkedList.add(employee);
		return linkedList;
	}

	@Override
	public List<Employee> readEmployeeLinkedList() {
		Collections.sort(linkedList);
		return linkedList;
	}

	@Override
	public List<Employee> updateEmployeeLinkedList(String mId, float salary) {
		for (Employee emp : linkedList) {
			if (emp.getmId().equals(mId)) {
				Employee newTempEmp = new Employee();
				int position = linkedList.indexOf(emp);
				newTempEmp.setmId(mId);
				newTempEmp.setEmployeeName(emp.getEmployeeName());
				newTempEmp.setSalary(salary);
				newTempEmp.setTrack(emp.getTrack());
				linkedList.set(position, newTempEmp);
			}
		}
		return linkedList;
	}

	@Override
	public List<Employee> deleteEmployeeLinkedList(String mId) {

		for (Employee emp : linkedList) {
			if (emp.getmId().equals(mId)) {
				int position = linkedList.indexOf(emp);
				 linkedList.remove(position);
			}
		}
		return linkedList;

	}

	@Override
	public Set<Employee> addEmployeeHashSet(Employee employee) {
		hashSet.add(employee);
		return hashSet;
	}

	@Override
	public Set<Employee> readEmployeeHashSet() {
List<Employee> setList=new LinkedList<Employee>(hashSet);
Collections.sort(setList);
hashSet=new HashSet<Employee>(setList);
		return hashSet;
	}

	@Override
	public Set<Employee> updateEmployeeHashSet(String mId, float salary) {
		LinkedList<Employee> linked = new LinkedList<Employee>(hashSet);
		for (Employee emp : linked) {
			if (emp.getmId().equals(mId)) {
				Employee newTempEmp = new Employee();
				int position = linked.indexOf(emp);
				newTempEmp.setmId(mId);
				newTempEmp.setEmployeeName(emp.getEmployeeName());
				newTempEmp.setSalary(salary);
				newTempEmp.setTrack(emp.getTrack());
				linked.set(position, newTempEmp);
			}
		}
		hashSet = new HashSet<Employee>(linked);
		return hashSet;
	}

	@Override
	public Set<Employee> deleteEmployeeHashSet(String mId) {
		LinkedList<Employee> linked1 = new LinkedList<Employee>(hashSet);
		for (Employee emp : linked1) {
			if (emp.getmId().equals(mId)) {
				int position = linked1.indexOf(emp);
				linked1.remove(position);
			}
		}
		hashSet = new HashSet<Employee>(linked1);
		return hashSet;
	}

	@Override
	public Set<Employee> addEmployeeLinkedHashSet(Employee employee) {
		linkedHashSet.add(employee);
		return linkedHashSet;
	}

	@Override
	public Set<Employee> readEmployeeLinkedHashSet() {
		List<Employee> setList=new LinkedList<Employee>(linkedHashSet);
		Collections.sort(setList);
		linkedHashSet=new HashSet<Employee>(setList);
		return linkedHashSet;
	}

	@Override
	public Set<Employee> updateEmployeeLinkedHashSet(String mId, float salary) {
		List<Employee> linked = new LinkedList<Employee>(linkedHashSet);
		for (Employee emp : linked) {
			if (emp.getmId().equals(mId)) {
				Employee newTempEmp = new Employee();
				int position = linked.indexOf(emp);
				newTempEmp.setmId(mId);
				newTempEmp.setEmployeeName(emp.getEmployeeName());
				newTempEmp.setSalary(salary);
				newTempEmp.setTrack(emp.getTrack());
				linked.set(position, newTempEmp);
			}
		}
		linkedHashSet = new LinkedHashSet<Employee>(linked);
		return linkedHashSet;
	}

	@Override
	public Set<Employee> deleteEmployeeLinkedHashSet(String mId) {
		List<Employee> linked = new LinkedList<Employee>(linkedHashSet);
		List<Employee> arrlinked = new ArrayList<Employee>();
		for (Employee emp : linked) {
			if (emp.getmId().equals(mId)) {

			} else
				arrlinked.add(emp);
		}
		linkedHashSet = new LinkedHashSet<Employee>(arrlinked);
		return linkedHashSet;
	}

	@Override
	public Set<Employee> addEmployeeTreeSet(Employee employee) {
		treeSet.add(employee);

		return treeSet;
	}

	@Override
	public Set<Employee> readEmployeeTreeSet() {
		return treeSet;
	}
	
	@Override
	public Set<Employee> updateEmployeeTreeSet(String mId, float salary) {
		List<Employee> linked = new LinkedList<Employee>(treeSet);
		for (Employee emp : linked) {
			if (emp.getmId().equals(mId)) {
				Employee newTempEmp = new Employee();
				int position = linked.indexOf(emp);
				newTempEmp.setmId(mId);
				newTempEmp.setEmployeeName(emp.getEmployeeName());
				newTempEmp.setSalary(salary);
				newTempEmp.setTrack(emp.getTrack());
				linked.set(position, newTempEmp);
			}
		}
		treeSet = new TreeSet<Employee>(linked);

		return treeSet;
	}

	@Override
	public Set<Employee> deleteEmployeeTreeSet(String mId) {
		List<Employee> linked = new LinkedList<Employee>(treeSet);
		List<Employee> linked1 = new LinkedList<Employee>();
		for (Employee emp : linked) {
			if (emp.getmId().equals(mId)) {

			} else
				linked1.add(emp);
		}

		treeSet = new TreeSet<Employee>(linked1);

		return treeSet;
	}

	@Override
	public Map<Integer, Employee> addEmployeeHashMap(Employee employee) {
		hashMap.put(i++, employee);
		return hashMap;
	}

	@Override
	public Map<Integer, Employee> readEmployeeHashMap() {
		return hashMap;
	}

	@Override
	public Map<Integer, Employee> updateEmployeeHashMap(String mId, float salary) {
		for (Map.Entry<Integer, Employee> entry : hashMap.entrySet()) {
			if (mId.equals(entry.getValue().getmId())) {
				Employee emp = new Employee();
				emp.setEmployeeName(entry.getValue().getEmployeeName());
				emp.setmId(mId);
				emp.setTrack(entry.getValue().getTrack());
				emp.setSalary(salary);
				hashMap.put(entry.getKey(), emp);
			}
		}
		return hashMap;
	}

	@Override
	public Map<Integer, Employee> deleteEmployeeHashMap(String mId) {
		for (Map.Entry<Integer, Employee> entry : hashMap.entrySet()) {
			if (mId.equals(entry.getValue().getmId())) {
				hashMap.remove(entry.getKey());
			}
		}

		return hashMap;
	}

	@Override
	public Map<Integer, Employee> addEmployeeLinkedHashMap(Employee employee) {
		linkedHashMap.put(j++, employee);
		return linkedHashMap;
	}

	@Override
	public Map<Integer, Employee> readEmployeeLinkedHashMap() {

		return linkedHashMap;
	}

	@Override
	public Map<Integer, Employee> updateEmployeeLinkedHashMap(String mId, float salary) {
		for (Map.Entry<Integer, Employee> entry : linkedHashMap.entrySet()) {
			if (entry.getValue().getmId().equals(mId)) {
				Employee emp = new Employee();
				emp.setEmployeeName(entry.getValue().getEmployeeName());
				emp.setmId(mId);
				emp.setSalary(salary);
				emp.setTrack(entry.getValue().getTrack());
				linkedHashMap.put(entry.getKey(), emp);
			}

		}
		return linkedHashMap;
	}

	@Override
	public Map<Integer, Employee> deleteEmployeeLinkedHashMap(String mId) {
		for (Map.Entry<Integer, Employee> entry : linkedHashMap.entrySet()) {
			if (mId.equals(entry.getValue().getmId())) {
				linkedHashMap.remove(entry.getKey());
			}
		}
		return linkedHashMap;
	}

	@Override
	public Map<Integer, Employee> addEmployeeTreeMap(Employee employee) {
		treeMap.put(k++, employee);
		return treeMap;
	}

	@Override
	public Map<Integer, Employee> readEmployeeTreeMap() {
		return treeMap;
	}

	@Override
	public Map<Integer, Employee> updateEmployeeTreeMap(String mId, float salary) {
		for (Map.Entry<Integer, Employee> entry : treeMap.entrySet()) {
			if (entry.getValue().getmId().equals(mId)) {
				Employee emp = new Employee();
				emp.setEmployeeName(entry.getValue().getEmployeeName());
				emp.setmId(mId);
				emp.setSalary(salary);
				emp.setTrack(entry.getValue().getTrack());
				treeMap.put(entry.getKey(), emp);
			}
		}
		return treeMap;
	}

	@Override
	public Map<Integer, Employee> deleteEmployeeTreeMap(String mId) {
		for (Map.Entry<Integer, Employee> entry : treeMap.entrySet()) {
			if (entry.getValue().getmId().equals(mId)) {
				treeMap.remove(entry.getKey());
			}
		}
		return treeMap;
	}

}
