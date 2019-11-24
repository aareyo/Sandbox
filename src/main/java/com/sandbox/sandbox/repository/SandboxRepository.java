package com.sandbox.sandbox.repository;

import com.sandbox.sandbox.model.Employee;
import com.sandbox.sandbox.repository.rowmapper.EmployeeRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SandboxRepository {

    /*
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public SandboxRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

     */

    @Autowired
    public SandboxRepository() {
        super();
    }

    public Employee getEmployee(int id) {
        /*
        String query = "SELECT * FROM EMPLOYEE WHERE ID = ?";
        Employee employee = jdbcTemplate.queryForObject(
                query, new Object[] { id }, new EmployeeRowMapper());

        return employee;

         */
        return new Employee(2, "Testi", "Testaaja", "Testaajakatu 2");
    }
}
