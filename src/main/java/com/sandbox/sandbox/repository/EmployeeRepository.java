package com.sandbox.sandbox.repository;

import com.sandbox.sandbox.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findAll();

//    Employee getEmployee(int id);

//    Employee addEmployee(Employee employee);

//    void deleteEmployee(int id);
}
