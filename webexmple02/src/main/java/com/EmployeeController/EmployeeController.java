package com.EmployeeController;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.EmployeeRepository.EmployeeRepository;
import com.Entity.Employee;




@Controller
public class EmployeeController {
	@Autowired
private EmployeeRepository empreository;
	@RequestMapping(value="/" ,method=RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("index");
		return modelAndView;
	}
	
	@RequestMapping(value="/regi" ,method=RequestMethod.GET)
	public ModelAndView registration() {
		ModelAndView modelAndView=new ModelAndView();
		Employee employee =new Employee();
		modelAndView.addObject("employee", employee);
		modelAndView.setViewName("regi");
		return modelAndView;}
	
	@RequestMapping(value="/regi" ,method=RequestMethod.POST)
	public ModelAndView createNewUser(@Valid Employee employee, BindingResult bindingResult) {
		ModelAndView modelAndView=new ModelAndView();
		Employee employeeExists=empreository.findByEmail(employee.getEmail());
		if (employeeExists != null) {
			bindingResult.rejectValue("email", "error.employee", "You are already a"+" registered with this email");
		}
		if(bindingResult.hasErrors()) {
			modelAndView.setViewName("regi");
		}
		else {
			empreository.save(employee);
			modelAndView.addObject("successMessage", "Employee registration success!!!");
			modelAndView.addObject("employee", new Employee());
			modelAndView.setViewName("regi");
			
			
		}
		return modelAndView;}
	
	
}
