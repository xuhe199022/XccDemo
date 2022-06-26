package com.xcc.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xcc.dao.DepartmentMapper;
import com.xcc.dao.EmployeeDao;
import com.xcc.dao.EmployeeMapper;
import com.xcc.pojo.Department;
import com.xcc.pojo.Employee;
import com.xcc.service.DepartmentService;
import com.xcc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

/**
 * @author xuhe
 * @PackageName:com.xcc.controller
 * @ClassName:EmployeeController
 * @Description:
 * @data 2022/3/30 23:04
 */
@Controller
public class EmployeeController {
    //controller->service->dao

    @Autowired
    EmployeeService employeeService;

    @Autowired
    DepartmentService departmentService;

    @GetMapping("/emps")
    public String list(Model model){
        Collection<Employee> employees = employeeService.getEmployee();
        model.addAttribute("emps",employees);
        return "emp/list";
    }

    @GetMapping("/toAdd")
    public String add(Model model) {
        //查出所有的部门信息,添加到departments中,用于前端接收
        Collection<Department> departments = departmentService.getDepartments();
        model.addAttribute("departments", departments);
        return "emp/add";//返回到添加员工页面
    }

    @PostMapping("/add")   //是rest风格，用请求类型区分
    public String addEmp(Employee employee) {
        employeeService.save(employee);//添加一个员工
        return "redirect:/emps";//重定向到/emps,刷新列表,返回到list页面
    }

    //员工修改页面
    @GetMapping("/emp/{id}")
    public String toUpdateEmp(@PathVariable("id") Integer id, Model model){
        Employee employee = employeeService.getEmployeeById(id);
        model.addAttribute("emp",employee);

        //查询所有的部门信息
        Collection<Department> departments = departmentService.getDepartments();
        model.addAttribute("departments",departments);
        return "emp/update";
    }

    //员工修改页面
    @PostMapping("/updateEmp")
    public String update(Employee employee){
        employeeService.updateEmployee(employee);//更新员工信息
        return "redirect:/emps";//重定向到/emps,刷新列表,返回到list页面
    }

    //删除员工
    @PostMapping("/delEmp/{id}")
    public String delEmp(@PathVariable("id") Integer id){
        employeeService.delEmployeeById(id);
        return "redirect:/emps";
    }

}
