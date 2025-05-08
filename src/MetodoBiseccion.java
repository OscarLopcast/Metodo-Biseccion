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
}
