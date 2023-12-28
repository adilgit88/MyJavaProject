package com.techB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Question 
{
    private String question;
    private ArrayList<String> options;
    private int correctOption;

    public Question(String question, ArrayList<String> options, int correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }

    public String getQuestion() {
        return question;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public int getCorrectOption() {
        return correctOption;
    }
    public static void main(String[] args) {
		
	}
}

class Quiz
{
    private ArrayList<Question> questions;
    private int score;

    public Quiz(ArrayList<Question> questions) {
        this.questions = questions;
        this.score = 0;
    }

    public void start() 
    {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.size(); i++) {
            Question currentQuestion = questions.get(i);

            System.out.println("Question " + (i + 1) + ": " + currentQuestion.getQuestion());

            ArrayList<String> options = currentQuestion.getOptions();
            for (int j = 0; j < options.size(); j++) {
                System.out.println((j + 1) + ". " + options.get(j));
            }

            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == currentQuestion.getCorrectOption()) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " +
                        currentQuestion.getOptions().get(currentQuestion.getCorrectOption() - 1) + "\n");
            }
        }

        System.out.println("Quiz completed! Your final score is: " + score + "/" + questions.size());
    }


//public class QuizGame {
    public static void main(String[] args)
    {
        // Sample questions
        ArrayList<Question> questions = new ArrayList<>();
        questions.add(new Question("What is the capital of France?",
                new ArrayList<>(List.of("Berlin", "Paris", "Madrid", "Rome")), 2));
        questions.add(new Question("Which planet is known as the Red Planet?",
                new ArrayList<>(List.of("Mars", "Venus", "Jupiter", "Saturn")), 1));
        questions.add(new Question("What is the largest mammal in the world?",
                new ArrayList<>(List.of("Elephant", "Blue Whale", "Giraffe", "Lion")), 2));

        Quiz quiz = new Quiz(questions);
        quiz.start();
        
    }
}

