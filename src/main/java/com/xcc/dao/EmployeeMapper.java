package com.xcc.dao;

import com.xcc.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Map;

//员工dao
@Repository
@Mapper
public interface EmployeeMapper {

    //增加一个员工
    public void save(Employee employee);

    //获得所有员工信息
    List<Employee> getEmployee();

    //通过ID查询员工
    Employee getEmployeeById(Integer id);

    //通过ID删除员工
    void delEmployeeById(Integer id);

    //更改员工信息
    void updateEmployee(Employee employee);
}
