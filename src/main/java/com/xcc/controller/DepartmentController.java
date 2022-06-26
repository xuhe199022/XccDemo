package com.xcc.controller;

import com.xcc.dao.DepartmentMapper;
import com.xcc.dao.EmployeeMapper;
import com.xcc.pojo.Department;
import com.xcc.pojo.Employee;
import com.xcc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xuhe
 * @PackageName:com.xcc.controller
 * @ClassName:DepartmentController
 * @Description:
 * @data 2022/4/5 15:44
 */
@RestController
public class DepartmentController {
    @Autowired
    DepartmentMapper departmentMapper;
    @Resource
    EmployeeMapper employeeMapper;
    @Resource
    EmployeeService employeeService;
    //查询部门信息
    @GetMapping("/depart")
    public List<Department> depart(){
        List<Department> departments = departmentMapper.getDepartments();
        return departments;
    }

    //查询员工信息
    @GetMapping("/employee")
    public List<Employee> employee(){
        List<Employee> employees = employeeService.getEmployee();
        return employees;
    }
}
