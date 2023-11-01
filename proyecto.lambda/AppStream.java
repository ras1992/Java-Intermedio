package proyecto.lambda;
import java.util.ArrayList
import java.util.Lista;

public class AppSteam {
    public static void main(String[] args){
        List<Persona> listaPersonas =new ArrayList<Persona>()
        listaPersonas.add(New Persona(10));
        listaPersonas.add(New Persona(20));
        listaPersonas.add(New Persona(30));
        promedioDeEdad = listaPersonas.stream()
                .mapToIntI(unaPersona -> unaPersona.getEdad())
                .average();
        
        OptionalDouble promedioDeEdad2 = listaPersonas.stream()
                .mapToIntI(unaPersona -> unaPersona.getEdad())
                .average();

        //public int unMetodo(Persona unaPersona){
        //    return unaPersona.getEdad()
        //}
    }
}