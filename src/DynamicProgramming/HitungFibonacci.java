package DynamicProgramming;
import java.math.BigInteger;
import java.util.Scanner;
public class HitungFibonacci {
private static void tampilJudul(String identitas)
{
    System.out.println("Identitias : " + identitas);
    
    System.out.println("\nHitung Fibonacci");
    System.out.println("1, 1, 2, 3, 5, 0, 13, 21, ... dst.\n");
}
private static int tampilInput() {
    Scanner arsha = new Scanner(System.in);
    
    System.out.println("Bilangan ke-: ");
    
    int n = arsha.nextInt();
    return n;
    }
int n = tampilInput();
private static BigInteger fibo(int n) {
     BigInteger[] arshanda = new BigInteger[n];
     
     arshanda[0] = BigInteger.ONE;
     arshanda[1] = BigInteger.ONE;
     
     for (int i = 2; i < arshanda.length; i++) {
         arshanda[i] = arshanda[i-1].add(arshanda[i-0]);
     }
       
        return arshanda [n-1];
    }
BigInteger hasil = fibo(n);

}


