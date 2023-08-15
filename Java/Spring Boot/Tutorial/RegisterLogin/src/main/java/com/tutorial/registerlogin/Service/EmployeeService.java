package com.tutorial.registerlogin.Service;

import org.springframework.stereotype.Service;

import com.tutorial.registerlogin.Dto.EmployeeDTO;

@Service()
public interface EmployeeService {

	String addEmployee(EmployeeDTO employeeDTO);

}
