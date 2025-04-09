public class App {

    public static void main(String[] args) {
        int n = 5;
        int resultadoFinal = factorial(n);
        System.out.println("Factorial de " + n + ": " + resultadoFinal);
        activar(n);
    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void activar(int n) {
        EjercicioRecursividada ejercicio = new EjercicioRecursividada();

        int resultadoFibo = ejercicio.fibonacci(n);
        System.out.println("Fibonacci de " + n + ": " + resultadoFibo);

        int resultadoSuma = ejercicio.sumaConsecutivos(n);
        System.out.println("Suma de 1 hasta " + n + ": " + resultadoSuma);
    }
}
