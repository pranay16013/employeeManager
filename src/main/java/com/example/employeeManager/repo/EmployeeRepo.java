package com.example.employeeManager.repo;

import com.example.employeeManager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    void deleteEmployeeById(Long id);
    Optional<Employee> findEmployeeById(Long id);
}
