package com.bl.assigement1;

public class PartTimeworkEmployee {
    public static void main(String[] args) {

         int isPartTime= 1;
         int isFullTime=2;
         int employeeperhrosrate = 20;
         int emphrs;
         int random = (int)(Math.random()*10%3);

         if (isFullTime==random){
             emphrs = 16;
             System.out.println("Full Time :");
         }
         else if (isPartTime==random) {

             emphrs = 8;
             System.out.println("Part Time :");

        }
         else {
             System.out.println("Employee not Present :");
             emphrs = 0;
         }
        int salary = (emphrs * employeeperhrosrate );
        System.out.println(salary);
    }
    }

