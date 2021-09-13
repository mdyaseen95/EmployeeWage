package com.brdlabz.employeewage;

public class EmployeeWageUC1 {
    public static void main(String[] args) {
        int IS_EMPLOYEE_FULL = 1;
        double employecheck = (Math.floor(Math.random() * 10) % 2 );
        if ( employecheck == IS_EMPLOYEE_FULL )
            System.out.println("Employee is present");
        else
            System.out.println("Emmployee is Absent");
    }

}
