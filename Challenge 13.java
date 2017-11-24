package challenges;
import java.util.Scanner;
public class Challenges {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
                
        String answer = "Yes";
        
        do {
            
            try{  
                System.out.println("Enter a number: ");
                int n = reader.nextInt();

                System.out.println("Enter another number: ");
                int c = reader.nextInt();

                System.out.println("The output is: " + (n + c));

            } catch(Exception e){

                System.out.println("You entered an incorrect value");
                System.out.println("Program ending");
                break;
            }  
            
        } while (answer != "stop");
        
        
    }
    
}


