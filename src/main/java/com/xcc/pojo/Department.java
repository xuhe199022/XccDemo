package com.xcc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@ApiModel(description = "部门实体")
public class Department {

    @ApiModelProperty(value = "部门ID", example = "1001")
    private Integer id;
    @ApiModelProperty(value = "部门名称")
    private String departmentName;
}
