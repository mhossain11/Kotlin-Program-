
package problem52;

import java.util.Scanner;


public class problem1 {
  
    public static void main(String[]args){
        
        int b,T;
        Scanner input = new Scanner (System.in);
        
        T=input.nextInt(); 


       
        for (int i = 1; i <= T; i++) {
            
            b =input.nextInt();
           if(b %2==0){
               System.out.println("even");
        
        }
           else{
               System.out.println("odd");
           }
    } 
}
    
}
