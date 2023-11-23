import java.util.Scanner;

public class EstebanLopez {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a Esteban Lopez - Calculadora de Sumas");
        System.out.println("Ingrese la cantidad de números a sumar:");
        int cantidadNumeros = scanner.nextInt();

        int suma = 0;
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ":");
            int numero = scanner.nextInt();
            suma += numero;
        }

        System.out.println("La suma de los números es: " + suma);
        scanner.close();
    }
}
