package com.testtest.op.employeeop.repository;

import com.testtest.op.employeeop.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
