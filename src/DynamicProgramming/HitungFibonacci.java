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

    private static void tampiljudul(String identitas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void tampilarshanda(int n, BigInteger arshanda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
private static void tampilarshanda(int n, String arshanda)
{
    System.out.println("Bilangan Fibonacci ke- " + n + " : " + arshanda);
}
    public static void main(String[] args) {
        String identitas = " Laveda Nafis Arshanda / X RPL 3/ 19";
        
        tampiljudul(identitas);
        
        int n = tampilInput();
        
        BigInteger arshanda = fibo(n);
        
        tampilarshanda(n, arshanda);
    }

}


