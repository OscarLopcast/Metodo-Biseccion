import java.util.Scanner;

public class MetodoBiseccion {

	//metodo funcion
    public static double funcion(double x) {
        return x * x - 2;
    }

	//metodo biseccion
    public static double biseccion(double a, double b, double tolerancia) {
        double c = a;
        while ((b - a) >= tolerancia) {
            c = (a + b) / 2;
            if (funcion(c) == 0.0)
                break;
            else if (funcion(c) * funcion(a) < 0)
                b = c;
            else
                a = c;
        }
        return c;
    }
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //validacion
        double a = 0, b = 0, tolerancia = 0;
        boolean valido = false;
        
        while (!valido) {
            try {
                System.out.print("Ingrese el valor inicial a: ");
                a = scanner.nextDouble();
                System.out.print("Ingrese el valor inicial b: ");
                b = scanner.nextDouble();
                if (a == b) {
                    System.out.println("Los valores de a y b no pueden ser iguales. Intente de nuevo.");
                    continue;
                }
                System.out.print("Ingrese la tolerancia: ");
                tolerancia = scanner.nextDouble();
                valido = true;
            } catch (Exception e) {
                System.out.println("Entrada no válida. Por favor, ingrese valores numéricos.");
                scanner.nextLine();
            }
        }

        double raiz = biseccion(a, b, tolerancia);
        System.out.println("La raíz es: " + raiz);
    }
}
