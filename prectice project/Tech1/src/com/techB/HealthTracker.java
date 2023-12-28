package com.techB;

import java.util.Scanner;

class HealthTracker // Object variables
{
    
    String username;
    int age;
    double weight;
    double height;
    double exerciseHours;
    int sleepHours;

    
   public HealthTracker(String inputusername, int inputage, double inputweight, double inputheight)// Constructor
    {
        username = inputusername;
        age = inputage;
        weight = inputweight;
        height = inputheight;
        exerciseHours = 0.0;
        sleepHours = 0;
    }

   
    public static double calculateBMI(double weight, double height) // Static method for calculating BMI (Body Mass Index)
    {
        return weight / (height * height);
    }

    
    public void setExerciseHours(double inputexerciseHours) // Method to set exercise hours
    {
        exerciseHours = inputexerciseHours;
    }

    
    public void setSleepHours(int inputsleepHours) // Method to set sleep hours
    {
        sleepHours = inputsleepHours;
    }


    public void displayHealthReport()     // Method to display health metrics and generate progress report
    {
        double bmi = calculateBMI(weight, height);

        System.out.println("   ");
        System.out.println("Health Report for " + username);
        System.out.println("Age: " + age + " years");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " m");
        System.out.println("BMI: " + bmi+"\n");

        System.out.println("Daily Activities:");
        System.out.println("Exercise Hours: " + exerciseHours + " hours");
        System.out.println("Sleep Hours: " + sleepHours + " hours");

        
        if (exerciseHours >= 2.0)// Generate progress report based on exercise hours
        {
            System.out.println("Good job on meeting your exercise goals!");
        }
        else 
        {
            System.out.println("Please increase your exercise time for better health.");
        }
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Get user information
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your weight (kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height (f): ");
        double height = scanner.nextDouble();

        
        HealthTracker userHealth = new HealthTracker(name, age, weight, height);// Create HealthTracker object

        
        System.out.print("Enter your daily exercise hours: ");// Set exercise and sleep hours
        double exerciseHours = scanner.nextDouble();
        userHealth.setExerciseHours(exerciseHours);

        System.out.print("Enter your daily sleep hours: ");
        int sleepHours = scanner.nextInt();
        userHealth.setSleepHours(sleepHours);

        
        userHealth.displayHealthReport();// Display health Report 

      
        scanner.close();
    }
}

