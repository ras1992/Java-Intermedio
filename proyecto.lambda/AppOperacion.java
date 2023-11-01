package proyecto.lambda;

import proyecto.lambda.interfaces.Operacion;

public class AppOperacion {
    public static void main(String[] args) {
        int unNumero =10;
        int otroNumero =5;
        Operacion suma = (a, b) -> a + b;

        int suma = calcular(unNumero, otroNumero)

        Operacion multiplicacion = (a, b) -> a * b;
    }
    public static int calcular(int unNumero, int otroNumero, Operacion Operacion)
     {
        return operacion.aplicar(unNumero,otroNumero);
        
    }
}
