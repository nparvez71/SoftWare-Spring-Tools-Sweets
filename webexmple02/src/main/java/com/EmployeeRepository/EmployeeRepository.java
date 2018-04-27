package com.EmployeeRepository;
/**
 * @author J2EE-33
 */


import org.springframework.data.repository.CrudRepository;

import com.Entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Long>{
	/**
	 * @note for checking email address
	 * @param email
	 * @return
	 */
	Employee findByEmail(String email);

}
