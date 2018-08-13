package cognizant.springBoot.io.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return employeeService.getEmployee(id);
	}
	
	@PostMapping("/employees")
	public String addEmployee(@RequestBody Employee e) {
		employeeService.addEmployee(e );
		return "Employee Records were added successfully";
	}
	
	@PutMapping("/employees/{id}")
	public String updateEmployee(@RequestBody Employee e, @PathVariable int id) {
		return employeeService.updateEmployee(e, id);
		}
	
	@DeleteMapping("/employees/{id}")
	public @ResponseBody String deleteEmployee(@PathVariable int id) {
		return employeeService.deleteEmployee(id);
		
	}
	
}
