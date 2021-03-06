package com.example.springboot.service;

import com.example.springboot.dao.EmployeeDao;
import com.example.springboot.entity.Employee;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class EmployeeServiceImpl implements EmployeeService{

    @Resource
    EmployeeDao employeeDao;

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    @Override
    public void insertEmployee(Employee emp) {
        employeeDao.insertEmployee(emp);
    }

    @Override
    public void updateEmployee(Employee emp) {
        employeeDao.updateEmployee(emp);
    }

    @Override
    public void executeUpdateEmployee(Employee emp) {
        employeeDao.executeUpdateEmployee(emp);
    }

    @Override
    public void deleteEmployee(Employee emp) {
        employeeDao.deleteEmployee(emp);
    }

}