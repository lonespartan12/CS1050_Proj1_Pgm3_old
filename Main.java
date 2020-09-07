/*
Program name: Program #3: PACE (Physical Activity Calori Equivalent) and Calories
Description: Calculate walking time for a given amount of caloric intake
Author: Christian Mudd
Date: 07/09/2020
Version: 1.0
*/

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // promp user
    System.out.println("Enter food: ");
    String food = scan.nextLine();
    System.out.println("Enter Calories for " + food + ": ");
    int calories = scan.nextInt();

    // display users inputs and calculate output
    System.out.println("Food: " + food + ".");
    System.out.println("Calories: " + calories + ".");
    
    System.out.println("Minutes to walk: " + (int)(calories/5.4));
  }
}