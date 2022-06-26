package com.xcc.service;

import com.xcc.pojo.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    //获得所有员工信息
    List<Employee> getEmployee();
    //通过ID查询员工
    Employee getEmployeeById(Integer id);
    //增加一个员工
    void save(Employee employee);
    //修改员工信息
    void updateEmployee(Employee employee);

    void delEmployeeById(Integer id);
}
