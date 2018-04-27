package com.coderbd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/idb/user")

public class UserController {
	@Autowired
	private UserRepository userRepository;
	
@GetMapping(path="/add")

public @ResponseBody String addNewUser (@RequestParam String name 
		,@RequestParam String email , @RequestParam Long  role_id) {
			User n=new User();
			n.setName(name);
			n.setEmail(email);
			Role r=new Role();
			r.setId(role_id);
			n.setRole(r);
			userRepository.save(n);
	return "saveed";
	
}
@GetMapping(path="/all")
public @ResponseBody Iterable<User> getAllUsers() {
	// This returns a JSON or XML with the users
	return userRepository.findAll();
}

@GetMapping(path="/user")
public @ResponseBody User getUserByEmail(@RequestParam String email) {
	// This returns a JSON or XML with the users
	return userRepository.findByEmail(email);
}


}
