package com.techB;

import java.util.Scanner;

public class ClassA // Object variables

{
	Scanner scanner = new Scanner(System.in);
    String Name;
    int Age;
    double Weight;
    double Height;
    double ExerciseHours;
    int SleepHours;

    
    
    
   public ClassA(String name, int age, double weight, double height)// Constructor
    {
        Name = name;
        Age = age;
        Weight = weight;
        Height = height;
        ExerciseHours = 0.0;
        SleepHours = 0;
    }

   
    public static double BMI(double weight, double heightM) // Static method for calculating BMI (Body Mass Index)
    {
    	
    	
    	return weight / (heightM * heightM);
    }

    
    public void ExerciseHours(double exerciseHours) // Method to set exercise hours
    {
        ExerciseHours = exerciseHours;
    }

    
    public void SleepHours(int inputsleepHours) // Method to set sleep hours
    {
        SleepHours = inputsleepHours;
    }


    public void displayHealthReport() // Method to display health metrics and generate progress report
    {
    	double heightM = Height * 0.3048; // Convert feet to meters (We need in meters for BMI converter)
    	
    	double bmi = BMI(Weight, heightM);
        
        

        System.out.println("   ");
        System.out.println("Health Report for " + Name);
        System.out.println("Age: " + Age + " years");
        System.out.println("Weight: " + Weight + " kg");
        System.out.println("Height: " + Height + " Feet");

        System.out.println("BMI: " + bmi+"\n");

        System.out.println("Daily Activities:");
        System.out.println("Exercise Hours: " + ExerciseHours + " hours");
        System.out.println("Sleep Hours: " + SleepHours + " hours");

        
        if (ExerciseHours >= 2.0)// Generate progress report based on exercise hours
        {
            System.out.println("Good job, your exercise goals is awesoe!");
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
        System.out.print("Enter your height (feet): ");
        double height = scanner.nextDouble();
        
      

        
        ClassA userHealth = new ClassA(name, age, weight, height);// Create HealthTracker object

        
        System.out.print("Enter your daily exercise hours: ");// Set exercise and sleep hours
        double exerciseHours = scanner.nextDouble();
        userHealth.ExerciseHours(exerciseHours);

        System.out.print("Enter your daily sleep hours: ");
        int sleepHours = scanner.nextInt();
        userHealth.SleepHours(sleepHours);

        
        userHealth.displayHealthReport();// Display health Report 

      
        scanner.close();
    }
}


