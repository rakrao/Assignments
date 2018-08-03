package com.app;

import java.util.Collection;
import java.util.Map;

import com.pojo.Employee;

public abstract class AppController {
	public abstract void addEmployee(Map<String, Object> account);
	public abstract Collection<Employee> viewEmployee();
}
