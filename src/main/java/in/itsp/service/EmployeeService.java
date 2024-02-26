package in.itsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.itsp.bean.Employee;
import in.itsp.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo repo;
	
	public String saveEmployee(Employee emp) {
		return repo.save(emp);
	}
}
