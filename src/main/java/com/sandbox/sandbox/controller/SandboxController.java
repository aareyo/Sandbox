package com.sandbox.sandbox.controller;

import com.sandbox.sandbox.model.Employee;
import com.sandbox.sandbox.service.SandboxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SandboxController {

    private final SandboxService sandboxService;

    @Autowired
    public SandboxController(SandboxService sandboxService) {
        this.sandboxService = sandboxService;
    }
    @GetMapping("/get-something")
    public Employee getEmployee(@RequestParam("employeeId") int id) {
        return this.sandboxService.getEmployee(id);
    }
}
