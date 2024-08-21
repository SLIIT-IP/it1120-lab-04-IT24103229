import java.util.Scanner;

public class IT24103229Lab4Q2 {
   public static void main(String []args) {

     Scanner scanner = new Scanner (System.in);

           //Prompt to enter Exam marks 
           System.out.print ("Please enter exam marks (out of 100):");
           double Emarks= scanner.nextDouble();
             if (Emarks < 0 && Emarks > 100) {
           System.out.println ("Invalid input for exam marks.");
            }

           //Prompt to enter lab submission marks 
           System.out.print ("Please enter lab submission marks (out of 100):");
           double Lmarks= scanner.nextDouble();
		   
		   
              if (Lmarks < 0 && Lmarks > 100){
           System.out.println ("Invalid input for Lab submission marks.");
            }

            //Prompt to enter exam percentage 
            System.out.print ("Please enter the percentage given for the exam:");
            double Epercentage= scanner.nextDouble();

            //Prompt to enter lab percentage 
            System.out.print ("Please enter the percentage given for the lab submission:");
            double Lpercentage= scanner.nextDouble();

            double sum = (Epercentage + Lpercentage);
               if (sum>100) {
            System.out.println ("The percentages must add up to 100.");
            }
            
			//calculation 
			double Fmarks;
			Fmarks= (Emarks + Epercentage)/100 + (Lmarks + Lpercentage)/100;
			System.out.println ("Final exam mark is:" +Fmarks);
			
            //Close scanner 
            scanner.close();

}
}