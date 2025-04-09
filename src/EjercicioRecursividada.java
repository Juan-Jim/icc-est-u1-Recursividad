public class EjercicioRecursividada {
    
    public  int fibonacci(int n) {
        if (n <= 1 ) {
            return  n;
        } 
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int sumaConsecutivos(int n) {
        if (n==1) {
            return 1;
        }
            int resultadoPracial = sumaConsecutivos(n-1);
            int resultado = n + resultadoPracial;
            return resultado;
    }
    
    
}
