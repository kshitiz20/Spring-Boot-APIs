package cognizant.springBoot.io.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;



@Service
public class EmployeeService {
	
	
List<Employee> list= new ArrayList<>(Arrays.asList(
			new Employee(123,"abc",500),
			new Employee(456,"jsjs",5245400),
			new Employee(8321,"abcak",5242200)
			
		));
	
	
	public List<Employee> getAllEmployees() {
		
			return list;
	}


	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		
		list.add(e);
		
	}


	public String updateEmployee(Employee e, int id) {
		// TODO Auto-generated method stub
		String s;
		int rid=0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getId()==id) {
				rid=list.get(i).getId();
				list.set(i, e);
				
				break;
				
			}
		}
		s= "The Employee with id "+rid+" has been replaced by Employee with id "+e.getId();
		return s;
	}


	public String deleteEmployee(int id) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getId()==id) {
				list.remove(i);
			}
		}
		return "Employee withh id "+id+" has been removed from the company";
	}
	
	
}
