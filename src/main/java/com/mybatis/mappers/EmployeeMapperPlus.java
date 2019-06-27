package com.mybatis.mappers;

import com.mybatis.beans.Employee;

import java.util.List;

public interface EmployeeMapperPlus {

    Employee getEmployeeById(Integer id);

    Employee getEmployeeAndDept(Integer id);

    Employee getEmployeeByIdStep(Integer id);

    List<Employee> getEmployeeByDeptId(Integer deptId);
}
