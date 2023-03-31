package com.bl.assigement1;

public class EmployeeAttendance {
    public static void main(String[] args) {

        int isPresent = (int)(Math.random()*10%2);
        System.out.println("value:" + isPresent);

        if(isPresent==1){

            System.out.println("Employee is Present");
        }else {

            System.out.println("Employee Is Not Present");
        }

//        System.out.println("hello word");

    }

}
