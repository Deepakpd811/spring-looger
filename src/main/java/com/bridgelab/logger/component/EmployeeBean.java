package com.bridgelab.logger.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {

    private String ename;
    private int eid;

    private DepartmentBean deptBean;

    public static final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);

    //default constructor
    public EmployeeBean(){};

    @Autowired
    public EmployeeBean(DepartmentBean deptBean){
        logger.trace("*** Autowiring by using @Autowire annotation on constructor ***");
        this.deptBean = deptBean;
    }

    // get seteer


    public int getEid() {
        return eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public DepartmentBean getDeptBean() {
        return deptBean;
    }

    @Autowired
    public void setDeptBean(DepartmentBean deptBean) {
        logger.trace("*** Autowiring by using @Autowire annotation on Setter ***");
        this.deptBean = deptBean;
    }

    public  void showDetails(){
        logger.debug("Employee id: " + eid);
        logger.debug("Employee name: " + ename);
        deptBean.setDeptName("Information technology");
        logger.debug("Department :" + deptBean.getDeptName());
    }

}
