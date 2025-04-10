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
    
    public  int elevado(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }else{

            return base * elevado(base ,exponente -1 );
        }
    }
    
    public int devolver (int numero ) {
        if (numero < 10) {
            return numero;
        }else{
            int ultimoNumero = numero % 10;
            int restaNumero = numero / 10;
            return  ultimoNumero + devolver(restaNumero);
        }
        
    } 

    public int decendente(int n) {
        if (n == 1) {
            return n;
        }else{
            System.out.print(n + ", ");
            return  decendente(n-1);
        }
    }

    public int reverso(int n) {
        return reversoAux(n, 0);
    }
    
    public int reversoAux(int n, int invertido) {

        if (n == 0) {
            return invertido;
        } else {
            int ultimoDigito = n % 10;
            int nuevoInvertido = invertido * 10 + ultimoDigito;
            return reversoAux(n / 10, nuevoInvertido);
        }
    }
}
