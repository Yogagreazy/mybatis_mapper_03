package com.mybatis.mappers;

import com.mybatis.beans.Employee;
import org.apache.ibatis.annotations.Select;

public interface EmployeeMapperAnnotation {

    @Select("SELECT * FROM employee where id = #{id}")
    Employee getEmployeeById(Integer id);
}
