
package problem52;

import java.util.Scanner;

public class problem4 {
    
    public static void main(String[] args) {
        
        int T,N;
      
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("");
        T= input.nextInt();
        
        System.out.println("");
        
        for (int i = 1; i <= T; i++) {
            
             N= input.nextInt();
              System.out.printf("Case %d :",i);
              
            for (int j = 1; j <= N; j++) {
                
                
                if(N%j==0){
                 
                 
                  System.out.printf("%d ",j);  
                }
             
            }

            System.out.println("");
            
        }
    }
    
}
