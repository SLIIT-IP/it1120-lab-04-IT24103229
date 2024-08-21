import java.util.Scanner;

public class IT24103229Lab4Q1 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    //Prompt to enter a num
	System.out.print("Enter a number: ");
	//Read the num from user
	int number = scanner.nextInt();
	
	//Check if the number is pos, eg or zero
	if (number > 0) {
	  System.out.println("The number is positive.");
	}else if (number < 0) {
	  System.out.println ("The number is negative.");
	}else {
	  System.out.println("The number is zero.");
	}

    //Close the scanner 
	scanner.close();
}
}
