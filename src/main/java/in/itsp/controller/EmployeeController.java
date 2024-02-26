package in.itsp.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.itsp.bean.Employee;
import in.itsp.service.EmployeeService;
 
@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping("/")
	public String showForm(Model model) {
		model.addAttribute("emp", new Employee());
		List<String> listProfession = Arrays.asList("Developer", "Tester", "DevOps");
		model.addAttribute("listProfession", listProfession);
		return "empForm";
	}

	@PostMapping("/register")
	public String registerEmployee(@ModelAttribute("emp") Employee emp, Model mode) {
		String status = service.saveEmployee(emp);
		if (status.equals("success")) {
			return "result";
		}
		return "failed";
	}
}
