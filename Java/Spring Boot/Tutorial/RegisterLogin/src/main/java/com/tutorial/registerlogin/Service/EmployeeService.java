package com.tutorial.registerlogin.Service;

import org.springframework.stereotype.Service;

import com.tutorial.registerlogin.Dto.EmployeeDTO;
import com.tutorial.registerlogin.Dto.LoginDTO;
import com.tutorial.registerlogin.Response.LoginResponse;

@Service()
public interface EmployeeService {

	String addEmployee(EmployeeDTO employeeDTO);

	LoginResponse loginEmployee(LoginDTO loginDTO);

}
