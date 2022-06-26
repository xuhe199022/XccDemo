package com.xcc.service;

import com.xcc.pojo.Department;
import com.xcc.pojo.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {
    //获得所有部门信息
    List<Department> getDepartments();
}
