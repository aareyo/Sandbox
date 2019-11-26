package com.sandbox.sandbox.controller;

import com.sandbox.sandbox.model.Employee;
import com.sandbox.sandbox.service.SandboxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sandboxApp")
public class SandboxController {

    private final SandboxService sandboxService;

    @Autowired
    public SandboxController(SandboxService sandboxService) {
        this.sandboxService = sandboxService;
    }

    @GetMapping("/get-something")
    public Employee getEmployee() {
        return this.sandboxService.getEmployee(1);
    }
}
