import java.util.Scanner;

public class verificadorSangre {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad del donante: ");
        int edad = scanner.nextInt();

        System.out.println("Ingrese el peso del donante (en kg): ");
        int peso = scanner.nextInt();

        if (edad >= 18 && edad <=65){;
            if(peso >= 50){
                System.out.println("El donante es compatible.");
            }else{
                System.out.println("El donante no es compatible. Motivo: Peso inferior a 50kg");
            }
        }else{
            System.out.println("El donante no es compatible. Motivo: Debe tener entre 18 y 65 años.");
        }
        scanner.close();
    }
}
