import java.security.SecureRandom;
import java.util.Scanner;
import java.util.Random;


public class CAI4
{
	public static void main(String[] args)
	{
		Quiz();
	}
	
	public static void Quiz()
	{	
		int playAgain = 1;
		
		while (playAgain == 1)
		{
			int difficultyLevel = readDifficulty();
			int numCorrects = 0, numIncorrects = 0;
			
			for (int i = 0; i <= 9; i++)
			
			{
				// Generate random numbers
				// for first and second values.
				int firstRandomNumber = generateQuestionArgument(difficultyLevel);			
				int secondRandomNumber = generateQuestionArgument(difficultyLevel);
		        
				int correctAnswer = (firstRandomNumber * secondRandomNumber);
				
		        int answer = askQuestion(firstRandomNumber,secondRandomNumber);
		        boolean isCorrect = isAnswerCorrect(answer, correctAnswer);
		        
		        if (isCorrect)
		        {
		        	numCorrects++;
		    	
		        }
		        else
		        {
		        	numIncorrects++;
	
		        } 
			}
			
			displayCompletionMessage(numCorrects, numIncorrects);
			System.out.println("Play again? (1 for yes 0 for no)");
			playAgain = readResponse();
		}
	}
	
	// This function asks for the user's difficulty level.
	public static int readDifficulty()
	{
		System.out.print("Enter a level of difficulty from 1 to 4: ");
		return readResponse();
	}
	
	// This function returns a random number generator that has a range based on the 
	// difficult level passed to it.
	public static int generateQuestionArgument(int difficultyLevel)
	{
		SecureRandom randomNumber = new SecureRandom();


		switch (difficultyLevel)
		{
		case 1 : 
			return randomNumber.nextInt(9);
		case 2 : 
			return randomNumber.nextInt(99);
		case 3 : 
			return randomNumber.nextInt(999);
		default : 
			return randomNumber.nextInt(9999);
		}
	}
	
	// This function asks the user a multiplication problem based on the two numbers
	// passed to it and returns the user's answer.
	public static int askQuestion(int firstRandomNumber,int secondRandomNumber)
	{
		System.out.printf("How much is %d times %d?\n", firstRandomNumber, secondRandomNumber);
		System.out.print("Enter your answer: ");
		return readResponse();
	}

	// This function reads a reponse from the user.
	public static int readResponse()
	{
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	
	// This function checks if the two values passed to it are equal
	// and returns a boolean representing that condition.
	public static boolean isAnswerCorrect(int num, int correctAnswer)
	{
		if (num == correctAnswer)
		{	
			displayCorrectResponse();
			return true;
		}
		

		displayIncorrectResponse();
		return false;
	}
	
	public static void displayCorrectResponse()
	{
		// Use this random number generator to determine which message to print.
		Random randomCorrectResponse = new Random();
        int possibleCorrectResponses = randomCorrectResponse.nextInt(3) + 1;
        
        switch(possibleCorrectResponses)
        {
	        case 1 : System.out.println("Very good!");
	        break;
	        
	        case 2 : System.out.println("Excellent!");
	        break;
	
	        case 3 : System.out.println("Nice work!");
	        break;
	
	        case 4 : System.out.println("Keep up the good work!");
	        break;
        }
	}
	
	public static void displayIncorrectResponse()
	{
		// Use this random number generator to determine which message to print.
		Random randomIncorrectResponse = new Random();
        int possibleIncorrectResponses = randomIncorrectResponse.nextInt(3) + 1;
        
        switch(possibleIncorrectResponses)
        {
	        case 1 : System.out.println("No. Please try again.");
	        break;
	        
	        case 2 : System.out.println("Wrong. Try once more.");
	        break;
	
	        case 3 : System.out.println("Don't give up!");
	        break;
	
	        case 4 : System.out.println("No. Keep trying.");
	        break;
        }		
	}
	
	public static void displayCompletionMessage(int numCorrects, int numIncorrects)
	{
		int finalScore = numCorrects * 10;
		System.out.println("Your score is " + finalScore + "%");
		
		if(finalScore >= 75)
		{
			System.out.println("Congratulations, you are ready to go to the next level!");
		}
		else
		{
			System.out.println("Please ask your teacher for extra help.");
		}
	}

	
}