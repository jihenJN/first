
import java.util.Scanner; // import the Scanner class 

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n =0 ,s=1 ;
   
    
    // Enter number to test
    System.out.println("donner n pour calculer"); 
    n = input.nextInt();
    
      /*for (int i=n; i>=1; i--) 
          {
            s=s*i;} 

     System.out.println("factoriel= "+s); */
     int i=n;
     while (i>=1){
      s=s*i;
      i--;
     }
     System.out.println("factoriel of the number  = "+s);

        
       
       
    
    

   
    
}}