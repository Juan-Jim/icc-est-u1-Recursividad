public class App {

    public static void  main(String[] args) {
        int n = 5;
        int resultadoFinal = factorial(n);
        System.out.println("Factorial de " + n + ": " + resultadoFinal);
        activar(n);

        int base = 2;
        int exponente = 3;

        EjercicioRecursividada potencia = new EjercicioRecursividada();
        int resultado = potencia.elevado(base, exponente);
        System.out.println("la potencia de: " + base + " es: " + resultado);

        int numero = 124;
        EjercicioRecursividada ultimo = new EjercicioRecursividada();
        int resultadonumero = ultimo.devolver(numero);
        System.out.println("El resultado final es: " + resultadonumero);
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

