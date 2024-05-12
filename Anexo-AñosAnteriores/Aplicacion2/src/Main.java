//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*Calcular y mostrar:
        *   -Cantidad de múltiplos de 3 entre 1 y 100.
        *
        *   -Sumatoria de todos los pares entre 1 y 87
        *
        *   -Dado el número 32768 dividirlos sucesivamente por 2 mediante division
        *       entera hasta que se llegue a 1. Indicar la cantidad de veces que se
        *       pudo realizar la operacion.
        * */

        //1-
        int cant=0;
        for (int i = 1; i < 100 ; i++) {

            //Existe un operador(%) q devuelve el resto
            if (i % 3 == 0) {
                cant++;
            }
        }
        System.out.println("Hay " + cant + " múltiplos de 3");

        //2-
        int acumulador=0;
        for (int i = 1; i <=87 ; i++) {
            if (i % 2 == 0) {
                acumulador+=i;
            }
        }
        System.out.println("La suma es: " + acumulador);

        //3-

        int x = 32768;
        int contadorDivisiones  = 0;
        while (x > 1){
            x = x/2;
            contadorDivisiones++;
        }

        System.out.println("El número 32768 pudo ser dividido en 2:  "+contadorDivisiones+" veces.");

    }
}