
import java.util.Scanner; // import the Scanner class 

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number=0, somme=0;
   
    
    // Enter number to test
    System.out.println("Enter a number to test"); 
    number = input.nextInt();
    int i = 0;
      while (i <= number) {
       somme=somme+i ;
       i++;
    } 
    System.out.println("somme = "+somme); 
    

  } 
    
}