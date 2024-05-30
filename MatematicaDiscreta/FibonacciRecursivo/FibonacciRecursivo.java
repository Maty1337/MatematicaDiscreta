import java.util.Scanner;

public class FibonacciRecursivo {
    
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de términos que desea mostrar: ");
        int numTerminos = scanner.nextInt();
        
        System.out.println("Serie de Fibonacci de " + numTerminos + " términos:");
        for (int i = 0; i < numTerminos; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        
        scanner.close();
    }
}
