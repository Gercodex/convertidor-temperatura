import java.sql.Struct;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp;
        int opcion = 0;

        String menu = """
                
                *** Convertidor de temperatura ***
                Elige la conversión que deseas realizar:
                
                1- Convertir de Celsius a Fahrenheit.
                2- Convertir de Fahrenheit a Celsius.
                3- Salir.
                """;
        String menajePedirTemperatura = "=== Ingresa la temperatura en ";
        String mensajeResultado = "La temperatura es: ";
        while (opcion != 3) {
            System.out.println(menu);
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println(menajePedirTemperatura + "Celsius: ===");
                    temp = (scanner.nextDouble() * 1.8) + 32;
                    System.out.println(mensajeResultado + (int)temp + "° Fahrenheit.");
                    break;
                case 2:
                    System.out.println(menajePedirTemperatura + "Fahrenheit: ===");
                    temp = (scanner.nextDouble() - 32) / 1.8;
                    System.out.println(mensajeResultado + (int)temp + "° Celsius.");
                    break;
                case 3:
                    System.out.println("Ha salido de la aplicación.");
                    break;
                default:
                    System.out.println("Opción no válida. intente de nuevo.");
            }
        }
        scanner.close();
    }
}