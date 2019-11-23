package com.sandbox.sandbox.service;

import com.sandbox.sandbox.model.Employee;
import com.sandbox.sandbox.repository.SandboxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SandboxService {
    private final SandboxRepository sandboxRepository;

    @Autowired
    public SandboxService(SandboxRepository sandboxRepository) {
        this.sandboxRepository = sandboxRepository;
    }
    public Employee getEmployee(int id) {
       return this.sandboxRepository.getEmployee(id);
    }
}
