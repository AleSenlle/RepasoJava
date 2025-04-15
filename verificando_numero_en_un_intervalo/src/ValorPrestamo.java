import java.util.Scanner;

public class ValorPrestamo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor solicitado para el préstamo (en dólares): ");
        double valorSolicitado = scanner.nextDouble();

        if (valorSolicitado >= 1000 && valorSolicitado <= 5000) {
            System.out.println("Verificado. Préstamo permitido.");
        } else if (valorSolicitado < 0){
            System.out.println("Error. Ingrese un valor valido.");
        } else {
            System.out.println("El valor $" + valorSolicitado + " no está dentro del rango permitido ($1000 - $5000).");
        }
        scanner.close();
    }
}