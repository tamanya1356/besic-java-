
import java.util.*;
public class multiplyfunction {
    // create a function multyply by two numbers
    public static int multiplyfunction(int a, int b) {
        int multiply=a*b;
        return multiply;
    }
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();

 int multiply=multiplyfunction(a, b); // call the function 
 System.out.println(multiply);
   } 
}
