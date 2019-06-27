package com.mybatis.mappers;

import com.mybatis.beans.Department;

public interface DepartmentMapper {
    Department getDeptById(Integer id);

    Department getDeptByIdPlus(Integer id);

    Department getDeptByIdStep(Integer id);
}
