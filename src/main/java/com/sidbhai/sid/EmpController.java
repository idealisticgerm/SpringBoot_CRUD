package com.sidbhai.sid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//import java.util.ArrayList;
import java.util.List;

@RestController
public class EmpController {
//    List<Employee> employees = new ArrayList<>();
//    EmployeeService employeeService = new EmployeeServiceImpl();


    // Dependency Injection
    @Autowired
    EmployeeService employeeService; //its not a good practice but it works,we have to inject dependency in constructor


    @GetMapping("employees")
    public List<Employee> getAllEmployees() {
        return employeeService.readEmployees();
    }


    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee) {
//        employees.add(employee);
        return employeeService.createEmployee(employee);

    }

    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        if (employeeService.deleteEmployee(id))
            return "Delete Successfully";
        return "Not Found";
    }

    @PutMapping("employees/{id}")
    public String updateEmployee(@PathVariable Long id, @RequestBody Employee employee){
        return employeeService.updateEmployee(id,employee);
    }
}
