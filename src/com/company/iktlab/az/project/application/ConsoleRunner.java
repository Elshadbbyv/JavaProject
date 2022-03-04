package com.company.iktlab.az.project.application;

import com.company.iktlab.az.project.controller.FlightController;
import com.company.iktlab.az.project.controller.bookController;


import java.util.Scanner;

public class ConsoleRunner {
    public  static  void RunConsole(){
        Scanner sc = new Scanner(System.in);
        int command= sc.nextInt();
        System.out.println("Please Enter number:");
                while (true){
            switch (command){
                case 1:
                    FlightController.show();
                    break;
                case 2:
                    FlightController.info();
                    break;
                case 3:
                    bookController.book();
                    break;
                case 4:
                    bookController.cancel();
                    break;
                case 5:
                    FlightController.flights();
                    break;
                case 6:
                    System.out.println("- Thanks for choosing us\n");
                    break;
            }
        }
    }
}
