import java.util.Scanner;

public class CalculadoraCuadratica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repetir = true;

        while (repetir) {
            System.out.println("Paso 1: Ingrese los valores de a, b y c:");
            System.out.print("a: ");
            double a = scanner.nextDouble();
            System.out.print("b: ");
            double b = scanner.nextDouble();
            System.out.print("c: ");
            double c = scanner.nextDouble();

            if (a == 0) {
                System.out.println("El valor de 'a' no puede ser cero. Por favor, inténtelo de nuevo.");
                continue;
            }

            System.out.println("Paso 2: Realizando operación cuadrática...");

            double discriminante = b * b - 4 * a * c;
            double x1, x2;

            if (discriminante > 0) {
                x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("Solución: x1 = " + x1 + ", x2 = " + x2);
            } else if (discriminante == 0) {
                x1 = -b / (2 * a);
                System.out.println("Solución doble: x = " + x1);
            } else {
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-discriminante) / (2 * a);
                System.out.println("Solución imaginaria: x1 = " + realPart + " + " + imaginaryPart + "i, x2 = " + realPart + " - " + imaginaryPart + "i");
            }

            System.out.println("Paso 4: ¿Desea repetir el proceso? (s/n)");
            String respuesta = scanner.next();
            if (!respuesta.equalsIgnoreCase("s")) {
                repetir = false;
            }
        }

        scanner.close();
        System.out.println("Programa finalizado.");
    }
}

