import java.util.Scanner;

public class IT24103229Lab4Q3 {
  public static void main(String[] args) {

    String result;
    Scanner scanner = new Scanner(System.in);

    //Prompt to enter a num
	System.out.print("Enter a number: ");
	//Read the num from user
	int number = scanner.nextInt();
	
	//Use Ternary operator 
	result = (number>0) ? "Number is positive" :
	(number<0) ? "Number is negative" :
	"Number is Zero" ;
	
	System.out.println ("The answer:" + result);
	
  }
}
	


