package problem52;


public class progrm3 {
    
    public static void main(String[] args) {
        int n=5;
        for (int i = 1000; i >= 1; i--) {
           
                n=n-1;
             
                  System.out.print(i+"\t");
                  if(n==0){
                      System.out.println("");
                      n=n+5;
                  }
               
           
          
           
        }
    }
    
}
