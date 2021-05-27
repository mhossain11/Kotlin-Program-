
package problem52;

import java.util.Scanner;  //NOT SOLVER 2ND PROGRM

public class Problem2 {
    
    public static void main(String[] args) {
   
       int T;
       char n ;
       Scanner input = new Scanner (System.in);
       
       T =input.nextInt();
       
        for (int i = 1; i <=T; i++) {
          n=input.next().charAt(0);
            if(n%2==0){
                System.out.println("event");
            }
            else{
                System.out.println("odd");
            }
        }
       
    }
    
}
