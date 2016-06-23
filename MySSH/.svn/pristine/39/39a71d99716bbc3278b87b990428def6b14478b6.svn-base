package com.luo.web.action;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import luo.domin.Employee;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;


import com.luo.service.interfaces.EmployeeServiceInterface;
import com.luo.web.from.EmployeeForm;

public class loginAction extends DispatchAction{
//	响应登陆
	public ActionForward login(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
//		通过下面的语句可以直接获取spring容器中的实例。相当于ApplactinoContext
		WebApplicationContext ctx=
				WebApplicationContextUtils
				.getWebApplicationContext(this.getServlet()
						.getServletContext());
//	从spring容器中获取bean
	    EmployeeServiceInterface  emp=(EmployeeServiceInterface) ctx.getBean("employeeServiceImp");
//	    构建一个employee对象
	    Employee  employee=new Employee();
	    EmployeeForm employeeform=(EmployeeForm) form;
	    employee.setName(employeeform.getUsername());
	    employee.setPsw(employeeform.getPassword());
	    
	    System.out.println(employeeform.getUsername()+"    "+employeeform.getPassword()+"123".equals(employeeform.getUsername()));
	    
	    employee=emp.checkEmployee(employee);
	    
	    if (employee!=null){
//	    	如果不为空 ，则把它放入session 中已备后面是用
	    	request.getSession().setAttribute("loginguser", employee);
			  return mapping.findForward("ok");
		  }else{
			  return mapping.findForward("err");
		  }
		
	}
//	响应注销
	public ActionForward logout(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		return super.execute(mapping, form, request, response);
	}
}
