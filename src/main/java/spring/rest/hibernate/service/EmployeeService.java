package spring.rest.hibernate.service;

import java.util.List;
import spring.rest.hibernate.dao.EmployeeDAO;
import spring.rest.hibernate.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("employeeService")
public class EmployeeService {

	@Autowired
	EmployeeDAO empDao;
	
	@Transactional
	public List<Employee> getAllEmployees() {
		return empDao.getAllEmployees();
	}

	@Transactional
	public Employee getEmployee(int id) {
		return empDao.getEmployee(id);
	}
        
      
	@Transactional
	public void addEmployee(Employee emp) {
		empDao.addEmployee(emp);
	}

	@Transactional
	public void updateEmployee(Employee emp) {
		empDao.updateEmployee(emp);

	}

	@Transactional
	public void deleteEmployee(int id) {
		empDao.deleteEmployee(id);
	}
}
