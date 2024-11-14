import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un numero:");
        int num1 = scanner.nextInt();
        System.out.println("Ingresa otro numero");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;

        System.out.println("El resultado de " + num1 + " mas " + num2 + " es " + suma);
        System.out.println("El resultado de " + num1 + " menos " + num2 + " es " + resta);
        System.out.println("El resultado de " + num1 + " por " + num2 + " es " + multiplicacion);
        System.out.println("El resultado de " + num1 + " entre " + num2 + " es " + division);
        scanner.close();

    }
}