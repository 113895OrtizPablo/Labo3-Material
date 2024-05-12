//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /*Para mostrar texto en la pantalla se utiliza el objeto System.out
        *
        * -print(expresion): imprime el resultado de la expresion (uno al lado del otro)
        *
        * -println(expresion): imprime el resultado de la expresion y agrega un retorno de carro
        * (acá mete enter en cada salida)
        *
        * -printf(formato, var1, var2): imprime varias variables o expresiones con un formato definido
        * (al menos 2 parametros entra)
        * */

        /*Ingresar datos por teclado
        * System.in
        * (Es muy laborioso, entonces Java agregó una clase auxiliar que simplifica su uso)
        * */

        /*Clase Scanner
        * Permite el ingreso de datos de cualquier tipo
        * Se debe crear un objeto de la clase Scanner
        * Para usarla debe agregarse una linea import (por arriba de la class ).
        * Permite por ejemplo leer un archivo mandandole por parametro el nombre del archivp
        *
        * Metodos de ingreso de datos:
        *
        *   nextInt(): ingresa número entero
        *   nextLong(): ingresa un número entero largo
        *   nextFloat(): ingresa un número con decimales, con punto o coma según la configuracion
        *               regional del sistema operativo
        *
        *   nextLine(): ingresa una línea de texto
        *
        *   REGLA: si tenemos un metodo distinto anterior a nextLine() debemos declarar
        *           2 veces nextLine()
        *    next(): ingresa texto hasta un espacio
        * */



        int a,b;

        int suma, diferencia, producto;
        float cociente;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        a = scan.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        b = scan.nextInt();
        suma = a+b;
        diferencia = a-b;
        producto = a*b;
        cociente = (float) a/b;


        //Se puede ingresar el printf en el cual se indica el formato
        System.out.println("La suma de ambos números es: "+suma);
        System.out.println("La diferencia es: "+diferencia);
        System.out.println("El productos es: "+producto);
        System.out.println("El cociente es:"+cociente); // con printf  %f mostrar float.Se puede indicar el tamño. Pero acá no anda
    }
}