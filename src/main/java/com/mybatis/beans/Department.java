package com.mybatis.beans;
/**
 * Copyright (C), 2015-2019, 中信银行有限公司
 * FileName: Department
 * Author:   willem
 * Date:     2019-06-23 17:42
 * Description: 部门
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


import java.util.List;
import java.util.Objects;

/**
 * 〈一句话功能简述〉<br>
 * 〈部门〉
 *
 * @author willem
 * @create 2019-06-23
 * @since 1.0.0
 */
public class Department {

    private Integer id;
    private String departmentName;
    private List<Employee> emps;

    public Department() {
    }

    public Department(Integer id, String departmentName, List<Employee> emps) {
        this.id = id;
        this.departmentName = departmentName;
        this.emps = emps;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Employee> getEmps() {
        return emps;
    }

    public void setEmps(List<Employee> emps) {
        this.emps = emps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Department)) {
            return false;
        }
        Department that = (Department) o;
        return id.equals(that.id) &&
                Objects.equals(departmentName, that.departmentName) &&
                Objects.equals(emps, that.emps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, departmentName, emps);
    }
}
