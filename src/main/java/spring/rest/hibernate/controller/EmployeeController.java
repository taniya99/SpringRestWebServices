package spring.rest.hibernate.controller;

import java.util.List;
import spring.rest.hibernate.model.Employee;
import spring.rest.hibernate.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	/* Intellij : http://localhost:8080/getAllEmployees */
        /* In Net Beans http://localhost:8080/SpringRestEmployee/getAllEmployees */
	@RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Employee> getEmployees() {
		
		List<Employee> listofemployees = employeeService.getAllEmployees();
		return listofemployees;
	}

        //http://localhost:8080/SpringRestEmployee/getEmployee/3
	@RequestMapping(value = "/getEmployee/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Employee getEmployeeById(@PathVariable("id") int id) {
		return employeeService.getEmployee(id);
	}

        //http://localhost:8080/SpringRestEmployee/addEmployee
	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST, headers = "Accept=application/json")
	public void addCountry(@RequestBody Employee emp) {	
		employeeService.addEmployee(emp);
		
	}

        //http://localhost:8080/SpringRestEmployee/updateEmployee
	@RequestMapping(value = "/updateEmployee", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateCountry(@RequestBody Employee emp) {
		employeeService.updateEmployee(emp);
	}

        //http://localhost:8080/SpringRestEmployee/deleteEmployee/4
	@RequestMapping(value = "/deleteEmployee/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteEmployee(@PathVariable("id") int id) {
		employeeService.deleteEmployee(id);		
	}	
}
