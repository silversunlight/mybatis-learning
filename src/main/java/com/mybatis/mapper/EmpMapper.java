package com.mybatis.mapper;

import com.mybatis.pojo.Emp;

import java.util.List;

public interface EmpMapper {
    List<Emp> getEmpsByDeptno(int deptno);

    Emp getEmpByEmpno(int empno);
}
