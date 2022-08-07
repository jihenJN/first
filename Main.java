import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int lengthTable =0,Sum =0;
    int [] T={};
    // enter length of table
    System.out.println("enter the length of the table");
    lengthTable = input.nextInt();
   
    // enter values of table 
    System.out.println("enter the values of the table");
     for (int i=0; i< T.length ;i++){
        T[i]=input.nextInt();
        }
     // calculate the Sum of table 
     for (int i=0 ;i< T.length ;i++){
        Sum = Sum + T[i];
     }
     System.out.println("Sum values of the table = " + Sum);
     //
    

    


    
 
    
   
    
   

        
       
       
    
    

   
    
}}