import java.util.Scanner;

public class contraseña {
    public static void main (String[] args){
        String contraseñaCorrecta = "123456";

        Scanner ingresoUsuario = new Scanner(System.in);

        System.out.println("Ingrese la contraseña: ");
        String intento = ingresoUsuario.nextLine();

        if (intento.equals((contraseñaCorrecta))){
            System.out.println("¡Acceso permitido!");
        } else {
            System.out.println("¡Acceso denegado!");
        }
        ingresoUsuario.close();
    }
}
