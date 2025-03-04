package exceptiontopic;

// checked Exception
//public class InvalidAgeException extends Exception


// Unchecked Exception
public class InvalidAgeException extends RuntimeException

{
	public InvalidAgeException(String msg) 
	{
		super(msg);
	}
}
