package com.mybatis.pojo;

import java.util.List;

public class Dept {
    private int deptno;
    private String dname;
    private String location;
    private List<Emp> emps;


    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("" + deptno + " " + dname + " " + location);

        if (emps != null) {
            for (Emp emp : emps) {
                sb.append("\n" + emp.toString());
            }
        }

        return sb.toString();
    }
}
