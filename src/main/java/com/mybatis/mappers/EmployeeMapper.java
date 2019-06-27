package com.mybatis.mappers;

import com.mybatis.beans.Employee;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 功能描述: <br>
 * 〈〉
 *
 * @param:
 * @return:
 * @since: 1.0.0
 * @Author:willem
 * @Date: 2019-06-26 10:55
 */

public interface EmployeeMapper {

    //多条记录封装一个map：Map<Integer,Employee>:键是这条记录的主键，值是记录封装后的javaBean
    //@MapKey:告诉mybatis封装这个map的时候使用哪个属性作为map的key
    @MapKey("lastName")
    Map<String, Object> getEmployeeByLastNameLikeReturnMap(String lastName);

    //返回一条记录的map；key就是列名，值就是对应的值
    List<Employee> getEmployeeByIdReturnMap(Integer id);

    Employee getEmpByMap(Map<String, Object> map);

    Employee getEmpsByLastNameLike(String lastName);

    Employee getEmpByIdAndLastName(@Param("id") Integer id, @Param("lastName") String lastName);

    Employee getEmpById(Integer id);

    Long addEmployee(Employee employee);

    Boolean updateEmployee(Employee employee);

    void deleteEmployeeById(Integer id);


}
