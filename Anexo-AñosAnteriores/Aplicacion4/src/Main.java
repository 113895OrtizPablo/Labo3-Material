//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        /*Programar una clase Persona con atributos para almacenar
        * documento
        * nombre
        * edad
        * En un método main crear dos instancias de la clase Persona,
        * asignarle valores arbitraros a sus atributos y mostrar por pantalla
        * los mismos.
        *
        *
        * Parte 2:
        * Agregar a la clase Persona un atributo para almacenar su apellido y métodos para:
        *   -Retornar su nombre completo
        *   -Indicar si es mayor de edad
        *   -Incrementar  el valor de su edad
        * */


        Persona pUno= new Persona();

        Persona pDos= new Persona();



        pUno.setEdad(18);
        pDos.setEdad(21);

        pUno.setDocumento(123);
        pDos.setDocumento(456);

        pUno.setNombre("Jime");
        pDos.setNombre("Pablo");


        System.out.println(pUno.getDocumento()+" "+pUno.getNombre()+" "+pUno.getEdad());
        System.out.println(pDos.getDocumento()+" "+pDos.getNombre()+" "+pDos.getEdad());
    }
}