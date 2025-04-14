package com.employee.ems.controller;

import com.employee.ems.model.Employee;
import com.employee.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/employee")
    public ResponseEntity<?> getAllEmployee(){
        try {
            List<Employee> allEmployee = service.getAllEmployee();
            return ResponseEntity.ok(allEmployee);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed",HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable long id){
        Employee employee1 = null;
        try {
            employee1 = service.getEmployeeById(id);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed",HttpStatus.BAD_REQUEST);
        }
        if(employee1!=null)
            return ResponseEntity.ok(employee1);
        else
            return new ResponseEntity<>("Employee not found",HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/employee")
    public ResponseEntity<Employee> createUser(@RequestBody Employee employee) {
        Employee savedEmployee = service.saveEmployee(employee);
        return new ResponseEntity<>(savedEmployee,HttpStatus.CREATED);
    }

    @PutMapping("/employee/{id}")
    public ResponseEntity<String> updateEmployee(@PathVariable int id,@RequestBody Employee employee){

        Employee employee1 = null;
        try {
            employee1 = service.updateEmployee(id,employee);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed",HttpStatus.BAD_REQUEST);
        }
        if(employee1!=null)
            return new ResponseEntity<>("Updated",HttpStatus.OK);
        else
            return new ResponseEntity<>("Update failed",HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/employee/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable long id){
        Employee employee = service.getEmployeeById(id);
        if(employee!=null) {
            service.deleteEmployee(id);
            return new ResponseEntity<>("Deleted", HttpStatus.OK);
        }
        else
            return new ResponseEntity<>("Failed",HttpStatus.BAD_REQUEST);
    }

}
