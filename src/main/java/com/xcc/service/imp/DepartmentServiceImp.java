package com.xcc.service.imp;

import com.xcc.dao.DepartmentMapper;
import com.xcc.dao.EmployeeMapper;
import com.xcc.pojo.Department;
import com.xcc.pojo.Employee;
import com.xcc.service.DepartmentService;
import com.xcc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xuhe
 * @PackageName:com.xcc.service.imp
 * @ClassName:EmployeeServiceImp
 * @Description:
 * @data 2022/4/5 16:07
 */
@Service
public class DepartmentServiceImp implements DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public List<Department> getDepartments() {
        List<Department> departments;
        return departmentMapper.getDepartments();
    }
}
