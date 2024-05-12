public class Rectangulo {


    //atributos
    private int base;
    private int altura;


    //Properties

    public int getBase() {
        return base;
    }

    public void setBase(int bas) {
        this.base = bas;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int alt) {
        this.altura = alt;
    }

    //Constructor

    public Rectangulo() {

    }
    public Rectangulo(int b, int a ) {
        base =b ;
        altura = a ;
    }

    // Metodos

    public int CalcularArea(){
        return base*altura;
    }

}
