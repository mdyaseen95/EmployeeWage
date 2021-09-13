package com.brdlabz.employeewage;

import java.sql.SQLOutput;

public class EmployeeWageUC2 {
    public static void main(String[] args) {
        int IS_EMPLOYEE_FULL = 1 , EmpWageperhr = 20 ,emphrs = 0, Empwageperday = 0;
        double employecheck = (Math.floor(Math.random() * 10) % 2 );
        if ( employecheck == IS_EMPLOYEE_FULL )
            emphrs = 8;
            Empwageperday = emphrs * EmpWageperhr;
        System.out.println("Employee wage for one day is "+Empwageperday);
    }
}

