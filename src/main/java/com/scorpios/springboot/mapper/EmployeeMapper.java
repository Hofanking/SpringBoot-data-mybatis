package com.scorpios.springboot.mapper;

import com.scorpios.springboot.bean.Employee;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

}
