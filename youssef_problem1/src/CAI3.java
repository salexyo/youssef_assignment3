import java.security.SecureRandom;
import java.util.Scanner;
import java.util.Random;


public class CAI3
{
	public static void main(String[] args)
	{
		Quiz();
		
	}
	
	public static void Quiz()
	{	
		int numCorrects = 0, numIncorrects = 0;

		for (int i = 0; i <= 9; i++)
		{
			// Generate random number 
			// using a SecureRandom object.
			SecureRandom randomNumber = new SecureRandom();
			
			// Generate random numbers
			// for first and second values.
	        int firstRandomNumber = randomNumber.nextInt(10);
	        int secondRandomNumber = randomNumber.nextInt(10);
	        
			int correctAnswer = (firstRandomNumber * secondRandomNumber);
			
	        int answer = askQuestion(firstRandomNumber,secondRandomNumber);
	        boolean isCorrect = isAnswerCorrect(answer, correctAnswer);
	        
	        // Based on if the user got the question right, increment the number of correct
	        // answers or the number of incorrect answers.
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
	
	}
	
	// This function asks the user a multiplication problem based on the two numbers
	// passed to it and returns the user's answer.
	public static int askQuestion(int firstRandomNumber,int secondRandomNumber)
	{
		System.out.printf("How much is %d times %d?\n", firstRandomNumber, secondRandomNumber);
		System.out.println("Enter your answer: ");
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
		int finalScore = numCorrects % 10;
		System.out.printf("Your score is %d%%%n", finalScore * 10);
		
		
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