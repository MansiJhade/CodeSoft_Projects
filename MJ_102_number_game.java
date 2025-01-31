package com.company;

import java.util.Random;//importing Random function
import java.util.Scanner;//importing Scanner function

     class Game1 {//class Game1
        private static final int MIN_RANGE = 1;//private Access modifier
        private static final int MAX_RANGE = 100;
        private static final int MAX_ATTEMPTS = 5;
        private static final int MAX_ROUNDS = 3;

        public static void main(String[] args) {

            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            int highScore=15;
            int totalScore = 0;

            System.out.println("\t                                          ************ NUMBER GUESSING GAME **************");
            System.out.println("You have to guess a number between 1 to 100 ");
            System.out.println("Total Number Of Rounds : 3 ");
            System.out.println("Attempts To Guess Number In Each Round : 5\n");

            for (int i = 1; i <= MAX_ROUNDS; i++) {
                int number = random.nextInt(MAX_RANGE) + MIN_RANGE;//geneating random number

                int attempts = 0;

                System.out.printf("Round %d: Guess the number between %d and %d in %d attempts.\n", i, MIN_RANGE, MAX_RANGE,
                        MAX_ATTEMPTS);
                while (attempts < MAX_ATTEMPTS) {
                    System.out.print("Enter your guess : ");
                    int guess_number = scanner.nextInt();
                    attempts = attempts + 1;

                    if (guess_number == number) {
                        int score = MAX_ATTEMPTS - attempts;
                        totalScore = totalScore + score;
                        System.out.printf("\t *********** Hurray! Number Guessed Successfully ************\n.  Attempts = %d.\n Round Score = %d\n",
                                attempts, score);
                        break;
                    }

                    else if (guess_number < number) {
                        System.out.printf("\tThe number is greater than %d. Attempts Left = %d.\n", guess_number,
                                MAX_ATTEMPTS - attempts);
                    }

                    else if (guess_number > number) {
                        System.out.printf("\tThe number is less than %d. Attempts Left = %d.\n", guess_number,
                                MAX_ATTEMPTS - attempts);
                    }
                }
                if (attempts == MAX_ATTEMPTS) {
                    System.out.printf("\nRound = %d\n", i);
                    System.out.println("Attempts = 0");
                    System.out.printf("The Random Number Is : %d\n\n", number);
                }
            }
            System.out.println("            **************** Game Over ************** ");
            System.out.printf("\tYour total Score = %d\n",totalScore);
            scanner.close();

            if(totalScore<highScore){
                System.out.println("\t  $$$$$$$$$$$$$$$$$$*************** Great !You have just broken the highScore :) ***********$$$$$$$$$$$$$$" );
            }
        }
    }



