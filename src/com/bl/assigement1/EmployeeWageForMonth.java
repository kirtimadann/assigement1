package com.bl.assigement1;

public class EmployeeWageForMonth {
    public static void main(String[] args) {

        int totalDayMonth = 20;
        int isFullTime = 1;
        int isPartTime = 2;
        int employeeRatePerHros=20;
        int totalSalary=0;
        int time;
        int salary;



        for (int i=0; i<=totalDayMonth; i++){
            int random = (int)(Math.random()*10%3);
            System.out.println("random no.. :" + random);
            switch (random){
                case 1:
                        time=8;
                       salary = (time * employeeRatePerHros);
                        totalSalary = totalSalary + salary;
                       System.out.println("Employee Full Time Total Salary :");
                       System.out.println(totalSalary);


                    break;

                case 2:



                        time=4;
                        salary = (time * employeeRatePerHros);
                        totalSalary = (totalSalary + salary );
                      System.out.println("Employee Part Time Total Salary :");
                      System.out.println(totalSalary);

                    break;

                default:

                    System.out.println("Employee is Not Present");

            }


        }

        System.out.println(totalSalary);
    }
}
