package com.mybatis.pojo;

public class Emp {
    private int empno;
    private String ename;
    private int deptno;
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("" + empno + " " + ename + " " + deptno);
        if (null != dept) {
            sb.append(dept.toString());
        }
        return sb.toString();
    }
}
