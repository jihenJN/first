
import java.util.Scanner; // import the Scanner class 

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a,b,c;
    double delta , x1, x2;
    
    // Enter a,b,c 
    System.out.println("Enter a value"); 
    a = input.nextInt();    
    System.out.println("value a  is: " + a);  
    System.out.println("Enter b value"); 
    b = input.nextInt();    
    System.out.println("value b  is: " + b);
    c = input.nextInt();    
    System.out.println("value b  is: " + c);   

    //calculate delta 
    delta = (b*b) - (4*a*c) ;

    // test delta value 
    if (delta > 0){

      x1 =(-b-Math.sqrt(delta )) /(2*a);
      x2= (-b+Math.sqrt(delta ))/(2*a);
      System.out.println("x1="+x1);
      System.out.println("x2="+x2);

    }else if(delta == 0){
      x1= -b /(2*a);
      System.out.println("x1=x2="+x1);
     
  }
  else {

    System.out.println("pas de racine");
  }

  }
}