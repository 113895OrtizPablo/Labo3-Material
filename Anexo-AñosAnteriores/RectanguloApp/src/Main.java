// To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {

        Rectangulo nuevoRectangulo = new Rectangulo();

        nuevoRectangulo.setBase(3);
        nuevoRectangulo.setAltura(5);

        System.out.println(nuevoRectangulo.CalcularArea());
        
    }
}