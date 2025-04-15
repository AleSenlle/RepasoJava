import java.util.Scanner;

public class Descuento {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de compra: $ ");
        double valorCompra = scanner.nextDouble();

        if (valorCompra >= 100.00){
            double descuento = valorCompra * 0.10;
            double valorFinal = valorCompra - descuento;

            System.out.println("Descuento del 10% aplicado.");
            System.out.println("El valor a pagar es de: $" + valorFinal);
        } else {
            System.out.println("No corresponde la aplicacion del descuento.");
            System.out.println("Valor a pagar: $" + valorCompra);
        }
    }
}
