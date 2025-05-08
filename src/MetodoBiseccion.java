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
        System.out.print("Ingrese el valor inicial a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el valor inicial b: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese la tolerancia: ");
        double tolerancia = scanner.nextDouble();

        double raiz = biseccion(a, b, tolerancia);
        System.out.println("La raíz es: " + raiz);
    }
}
