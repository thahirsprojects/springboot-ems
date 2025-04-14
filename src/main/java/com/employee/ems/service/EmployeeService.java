package com.employee.ems.service;

import com.employee.ems.model.Employee;
import com.employee.ems.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo repo;

    public List<Employee> getAllEmployee() {
        return repo.findAll();
    }

    public Employee getEmployeeById(long id) {
        return repo.findById(id).orElse(null);
    }

    public Employee saveEmployee(Employee employee) {
        return repo.save(employee);
    }

    public Employee updateEmployee(long id,Employee employee) {

        Employee employee1 = repo.findById(id).orElse(null);

        assert employee1 != null;
        employee1.setName(employee.getName());
        employee1.setEmail(employee.getEmail());
        employee1.setAddress(employee.getAddress());
        employee1.setDesignation(employee.getDesignation());
        employee1.setQualification(employee.getQualification());
        employee1.setPhNumber(employee.getPhNumber());

        return repo.save(employee1);
    }

    public void deleteEmployee(long id) {
        repo.deleteById(id);
    }

}
