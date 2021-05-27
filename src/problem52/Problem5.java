
package problem52;

import java.util.Scanner;

public class Problem5 {
    
    public static void main(String[] args) {
        
        Scanner input =new Scanner (System.in);
        System.out.print("");
        int T = input.nextInt();
        
        System.out.print("");
        
        for (int i = 1; i <=T; i++) {
            
           int N=input.nextInt();
            
            for (int j = 1; j <=N; j++) {
                
                for (int k = 1; k <=N; k++) {
                    
                    System.out.print("*");
                    
                }
                System.out.println("");
            }
            
        }
    }
    
}
