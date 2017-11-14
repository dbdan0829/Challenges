package challenges;
import java.util.Scanner;
public class Challenges {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = reader.nextInt();
        
        System.out.println("Enter a letter: ");
        String c = reader.next();
        
        for (int i = 0; i < n; i++) {
            // contents
            System.out.print(c);
              
        } 
        
    }
    
}
