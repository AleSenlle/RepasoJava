import java.util.Scanner;
public class SistemaDeSeguridad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int CODIGO_CORRECTO = 2023;

        System.out.println("=== Sistema de Seguridad ===");

        // Solicitar credenciales
        System.out.print("Ingrese el código de acceso: ");
        int codigo = scanner.nextInt();

        System.out.print("Ingrese el nivel de permiso (1, 2 o 3): ");
        int nivel = scanner.nextInt();

        // Verificar credenciales
        boolean codigoCorrecto = (codigo == CODIGO_CORRECTO);
        boolean nivelValido = (nivel >= 1 && nivel <= 3);

        // Determinar resultado
        if (codigoCorrecto && nivelValido) {
            System.out.println("Acceso permitido. Bienvenido al sistema.");
        } else {
            System.out.println("Acceso denegado. Motivo(s):");

            if (!codigoCorrecto) {
                System.out.println("- Código de acceso incorrecto.");
            }
            if (!nivelValido) {
                System.out.println("- Nivel de permiso inválido.");
            }
        }
    }
}
