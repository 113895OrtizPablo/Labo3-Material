//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    /*Consigna
    * Declarar 2 variables para guardar números enteros,
    * Asignarle valores arbitrarios.
    * Calcular y mostrar el resultado de las cuatro operaciones aritmeticas
    * */

        int a,b;

        a = 56;
        b= 23;

        int suma, diferencia,  producto ;
        float cociente ;

        suma = a+b;
        diferencia = a-b;
        producto =a*b;
        cociente =(float) a / b; //Convertimos a en float.El molde solo se requiere si ambas variables son enteras
        System.out.println("La suma de los numeros es: "+suma);
        System.out.println("La diferencia de los numeros es: "+diferencia);
        System.out.println("eL producto de los numeros es: "+producto);
        System.out.println("el cociente de los numeros es: "+cociente);
    }
}