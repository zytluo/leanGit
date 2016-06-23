package Test;

import java.util.List;

import luo.domin.Employee;

import org.springframework.context.ApplicationContext;

import Util.ApplicationContextUtil;

import com.luo.service.interfaces.EmployeeServiceInterface;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext  applicationContext=ApplicationContextUtil.getApplicationContext();
//	TestBean  testbean=(TestBean) applicationContext.getBean("testBean");
//	System.out.println(testbean.getName());
//	实例化一个sessionFactory
//	SessionFactory sessionfactory =(SessionFactory) applicationContext.getBean("sessionFactory");
//	实例化一个session
//	Session sf=sessionfactory.openSession();
//	
//	Employee employee=new Employee("luolibo","luolibo@163.com",12312f);
//	Employee employee=new Employee();
//	开启事物
//	Transaction ts=sf.beginTransaction();
//	sf.save(employee);
//	ts.commit();
	
//	事物代理时代理的事接口
	EmployeeServiceInterface employeeService= (EmployeeServiceInterface) applicationContext.getBean("employeeServiceImp");
	
    List<Employee> list=employeeService.showEmployee();
    System.out.println(list.get(0));
//	EmployeeService employeeService= (EmployeeService) applicationContext.getBean("employeeServiceImp");
//	Employee employee=new Employee(4,"123","luolibo","luolibo@163.com",312342f);
//    employeeService.addEmployee(employee);
//	employeeService.delEmployee(2);
	
	}

}
