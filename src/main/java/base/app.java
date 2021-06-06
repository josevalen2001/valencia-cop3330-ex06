package base;
import java.util.*;
import java.time.YearMonth;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jose Valencia
 */

public class app {

    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);

        //Input
        System.out.print("What is your current age? ");
        String input1 = newScan.nextLine();

        System.out.print("At what age would you like to retire? ");
        String input2 = newScan.nextLine();

        //Convert strings to ints
        int ageCur = Integer.parseInt(input1);
        int ageRet = Integer.parseInt(input2);

        //Calculations
        int yearsLeft = ageRet - ageCur;
        int curYear = YearMonth.now().getYear();
        int retYear = curYear + yearsLeft;

        //Output
        System.out.println("You have " + yearsLeft + " years left until you can retire.");
        System.out.println("It's " + curYear + ", so you can retire in " + retYear + ".");


    }

}
