package com.xcc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


/**
 * @author xuhe
 * @PackageName:com.xcc.pojo
 * @ClassName:Department
 * @Description:
 * @data 2022/3/29 17:01
 */
//部门
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;//0-女 1-男
    private Department department;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth;

}
