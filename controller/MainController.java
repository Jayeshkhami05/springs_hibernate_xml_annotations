package springs_hibernate_xml_annotations_pesm7.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springs_hibernate_xml_annotations_pesm7.dao.EmployeeDao;
import springs_hibernate_xml_annotations_pesm7.dto.Employee;

public class MainController {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myemployee.xml");
		Employee employee = applicationContext.getBean("employee", Employee.class);
		EmployeeDao dao = applicationContext.getBean("employeeDao", EmployeeDao.class);
		dao.saveEmployee(employee);
	}

}
