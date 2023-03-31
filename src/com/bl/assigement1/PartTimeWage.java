package com.bl.assigement1;

public class PartTimeWage {

    public static void main(String[] args) {

        int isFulltime = 2;
        int isParttime = 1;
        int employeerateperhrs = 20;
        int emphrs;
        int salary;
        int random = (int) (Math.random() * 10 % 3);

        switch (random) {
            case 1:
                if (isFulltime == 2) {
                    emphrs = 16;
                    salary = (emphrs * employeerateperhrs);
                    System.out.println("Employee FullTime Salary : ");
                    System.out.println(salary);
                }
                break;  //optional
            case 2:
                if (isParttime == 1) {
                    emphrs = 8;
                    salary = (emphrs * employeerateperhrs);
                    System.out.println("Employee PartTime Salary :");
                    System.out.println(salary);

                }
                break;

            //Default case statement
            default:
                System.out.println("Employee Not Preent :");


        }
    }
}
