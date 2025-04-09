public class App {
    public static void main(String[] args)  {
        int n = 5;
        int resultadofinal = factorial(n);
        System.out.println("resultado: " + resultadofinal);
    }
    public static int factorial(int n) {
        if(n==0) {
            System.out.println("Alncaze el caso base");
            return  1;
        }
        int resultado = n * factorial(n -1 );
        System.out.println("Calculando factorial de " + n + " * factorias("+(n-1)+"-1)");
        return resultado;
    }
}
