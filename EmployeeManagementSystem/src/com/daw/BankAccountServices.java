package com.daw;

import java.util.HashSet;
import java.util.Set;

import com.pojo.Employee;

public abstract class BankAccountServices {
	private static Set<Employee> employeeSet;
	
	static {
		employeeSet=new HashSet<>();
	}
public void addEmployeeid (Employee id)
{
	employeeSet.add(id);
}
public void addEmployeename (Employee name)
{
	employeeSet.add(name);
}
public void addEmployeesalary (Employee salary)
{
	employeeSet.add(salary);
}

public Set<Employee> viewAll(){
	return employeeSet;
}

public void getEmpById (Employee id)
{
	 
}

public void deleteEmp (Employee id)
{
	
}
}
