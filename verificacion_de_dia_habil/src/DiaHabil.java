import java.util.Scanner;

public class DiaHabil {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un día de la semana (en minusculas): ");
        String dia = scanner.next();

        if (dia.equalsIgnoreCase("lunes") ||
                dia.equalsIgnoreCase("martes") ||
                dia.equalsIgnoreCase("miercoles") ||
                dia.equalsIgnoreCase("jueves") ||
                dia.equalsIgnoreCase("viernes")){
            System.out.println(dia + " es un día habil.");
        } else {
            System.out.println(dia + " no es un dia habil.");
        }
    }
}
