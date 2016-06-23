package com.luo.service.imp;

import java.io.Serializable;
import java.util.List;

import luo.domin.Employee;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.luo.service.interfaces.EmployeeServiceInterface;
import com.luo.web.from.EmployeeForm;

//  这里配置@Transactional用处是让spring的事物管理器接管该service的事物
@Transactional
public class EmployeeService implements EmployeeServiceInterface {
    private SessionFactory sessionfactory;
	public void setSession(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

/*
 * 添加雇员
 * */
	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub	
		sessionfactory.getCurrentSession().save(employee);	
//		Session session=sessionfactory.openSession();
//        Transaction transaction=session.beginTransaction();
//        session.save(employee);
//        transaction.commit();
		
	}
/*
 * 查询所雇员
 * */
	@Override
	public List<Employee> showEmployee() {
		// TODO Auto-generated method stub
		String hql="from Employee where id=1 and name='luolibo'";   //Employee是类名而不是表名
		List<Employee> list=sessionfactory.getCurrentSession().createQuery(hql).list();
		return list;
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delEmployee(Serializable id) {
		// TODO Auto-generated method stub
//		Session session=sessionfactory.openSession();
//		Transaction transaction=session.beginTransaction();
//		session.delete(id);
//		transaction.commit();
	}
/*
 * 查询雇员
 * */
	@Override
	public Employee checkEmployee(Employee e) {
		
		System.out.println(e.getName() + e.getPsw());
		// TODO Auto-generated method stub
		String hql="from Employee where name=? and password=?";
		List <Employee> list=sessionfactory.getCurrentSession().createQuery(hql).setString(0, e.getName()).setString(1, e.getPsw()).list();
		
		if(list.size()!=0){
			return list.get(0);	
		}else{
		return null;
		}
	}

}
