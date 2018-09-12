package DynamicProgramming;
import java.math.BigInteger;
import java.util.Scanner;
public class HitungFibonacci {
        private static void tampilJudul(String identitas){
        System.out.println("Identitas : " + identitas);
        
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
    }
    private static int tampilInput() {
            Scanner arsha = new Scanner(System.in);
            
            System.out.print("Bilangan ke-: ");
           
            int n = arsha.nextInt();
            return n;
        }
     private static BigInteger fibo(int n) {
            
            BigInteger[] arshanda = new BigInteger[n];
            
            arshanda[0] = BigInteger.ONE;
            arshanda[1] = BigInteger.ONE;
            
            for (int i = 2; i < n; i++) {
                arshanda[i] = arshanda[i-1].add(arshanda[i-2]);
            }
            
            return arshanda[n-1];
                
            }
        private static void tampilArsha(int n, BigInteger arshanda) 
        {
            System.out.println("Bilangan Fibonacci ke- " + n + " : " + arshanda);
            
            
        }
       
     public static void main(String[] args) 
        {   
        String identitas = "Laveda Nafis Arshanda / X RPL 3 / 19";
        
         tampilJudul(identitas);
         
        int n = tampilInput();
          
        BigInteger arshanda = fibo(n);
        
        tampilArsha(n, arshanda);
        
        }    
        }


