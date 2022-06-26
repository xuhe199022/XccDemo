package com.xcc.service.imp;

import com.xcc.dao.DepartmentMapper;
import com.xcc.dao.EmployeeMapper;
import com.xcc.pojo.Employee;
import com.xcc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

/**
 * @author xuhe
 * @PackageName:com.xcc.service.imp
 * @ClassName:EmployeeServiceImp
 * @Description:
 * @data 2022/4/5 16:07
 */
@Service
public class EmployeeServiceImp implements EmployeeService {
    @Autowired
    DepartmentMapper departmentMapper;
    @Resource
    EmployeeMapper employeeMapper;
    @Override
    public List<Employee> getEmployee() {
        List<Employee> employees = employeeMapper.getEmployee();
        for(Employee emp:employees){
            System.out.println(emp);
        }
        return employees;
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeMapper.getEmployeeById(id);
    }

    @Override
    public void save(Employee employee) {

        employee.setDepartment(departmentMapper.getDepartmentById(employee.getDepartment().getId()));
        employeeMapper.save(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeMapper.updateEmployee(employee);
    }

    @Override
    public void delEmployeeById(Integer id) {
        employeeMapper.delEmployeeById(id);
    }
}
