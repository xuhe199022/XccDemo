package com.xcc.dao;

import com.xcc.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
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
@Mapper
public interface DepartmentMapper {

    //获得所有部门信息
    List<Department> getDepartments();

    //通过ID获取部门
    Department getDepartmentById(Integer id);
}
