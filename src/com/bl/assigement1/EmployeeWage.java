package com.bl.assigement1;

public class EmployeeWage {

    public static void main(String[] args) {


        int isPresent = 1;
        int random = (int)(Math.random()*10%2);
        if(isPresent==random){
            int wageparhors=20;
            int dayhors = 8;

            int salary = (wageparhors*dayhors);

            System.out.println(salary);
        }

    }


}

