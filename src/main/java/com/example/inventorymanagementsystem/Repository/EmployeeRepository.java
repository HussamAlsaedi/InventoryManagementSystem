package com.example.inventorymanagementsystem.Repository;

import com.example.inventorymanagementsystem.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

 //   Employee findByEmployeeId(Long employeeId);

    Employee findEmployeeById(Long id);

}
