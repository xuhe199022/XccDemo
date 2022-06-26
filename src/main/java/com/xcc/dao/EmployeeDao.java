package com.xcc.dao;

import com.xcc.pojo.Department;
import com.xcc.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xuhe
 * @PackageName:com.xcc.dao
 * @ClassName:DepartDao
 * @Description:
 * @data 2022/3/29 17:06
 */
//部门Dao
@Repository
public class EmployeeDao {
    //模拟数据库
    private static Map<Integer, Employee> employeeMap = null;
    //员工有所属部门
    @Autowired
    private  DepartmentMapper departmentMapper;

    //自增主键
    private static Integer initId = 1006;
    //增加一个员工
    public void save(Employee employee){
        if(employee.getId()==null){
            employee.setId(initId++);
        }
        employee.setDepartment(departmentMapper.getDepartmentById(employee.getDepartment().getId()));
        employeeMap.put(employee.getId(),employee);
    }

    //获得所有员工信息
    public Collection<Employee> getEmployee(){
        return employeeMap.values();
    }

    //通过ID查询员工
    public Employee getEmployeeById(Integer id){
        return employeeMap.get(id);
    }

    //通过ID删除员工
    public void delEmployeeById(Integer id){
        employeeMap.remove(id);
    }
    //更改员工信息
    public void updateEmployee(Employee employee){

        employeeMap.remove(employee.getId());
        save(employee);
    }
}
