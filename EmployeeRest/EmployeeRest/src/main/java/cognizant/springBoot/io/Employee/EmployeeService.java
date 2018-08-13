package cognizant.springBoot.io.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
public class EmployeeService {
	
	
List<Employee> list= new ArrayList<>(Arrays.asList(
			new Employee(123,"abc",500),
			new Employee(456,"jsjs",5245400),
			new Employee(8321,"abcak",5242200)
			
		));
	
	@Autowired
	EmployeeRepo er;
	
	public List<Employee> getAllEmployees() {
		
		
		List<Employee> list= new ArrayList<>();
		er.findAll()
		.forEach(list::add);
		return list;
			//return list;
	}


	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		
		er.save(e);
		
	}


	public String updateEmployee(Employee e, int id) {
		// TODO Auto-generated method stub
	er.save(e);
		String s= "The Employee with id  has been replaced by Employee with id "+e.getId();
		return s;
	}


	public String deleteEmployee(int id) {
		//  Auto-generated method stub
		er.deleteById(id);
		return "Employee withh id "+id+" has been removed from the company";
	}


	public Employee getEmployee(int id) {
		return er.findById(id).get();
	}
	
	
}
