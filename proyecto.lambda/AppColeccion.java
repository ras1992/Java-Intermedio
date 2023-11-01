package proyecto.lambda;

public class AppColeccion {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(2);
        numeros.add(3);
        numeros.add(5);
        numeros.add(2);
        numeros.add(1);

        numeros.forEach( n-> System.out.println(n));

        System.out.println("Imprimo solo pares");

                

    }
}
