package com.luo.service.interfaces;

import java.util.List;

import luo.domin.Employee;

//创建一个雇员类接口
public interface EmployeeServiceInterface {
// 声明一写方法
	public void  addEmployee(Employee employee);
	public List<Employee> showEmployee();
	public void updateEmployee(Employee employee);
//	根据id删除雇员
	public void delEmployee(java.io.Serializable id);
//	如果该雇员存在，则返回该雇员的详细信息
	public  Employee checkEmployee(Employee e);
}
