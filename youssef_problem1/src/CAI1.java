import java.security.SecureRandom;
import java.util.Scanner;


public class CAI1
{
	public static void main(String[] args)
	{
		Quiz();
	}
	
	public static void Quiz()
	{	
		boolean isCorrect = false;
		
		while (!isCorrect)
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
	        
	        isCorrect = isAnswerCorrect(answer, correctAnswer);
	        
	        if (isCorrect)
	        	displayCorrectResponse();
	        else
	        	displayIncorrectResponse();
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
			return true;
		
		return false;
	}
	
	public static void displayCorrectResponse()
	{
	    System.out.println("Very good!");

	}
	
	public static void displayIncorrectResponse()
	{
	    System.out.println("No. Please try again.");	   
	}

	
}


