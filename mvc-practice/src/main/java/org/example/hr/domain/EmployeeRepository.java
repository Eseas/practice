package org.example.hr.domain;

public interface EmployeeRepository {
    void createEmployee(Employee employee);

    Employee findByNo(String no);
}