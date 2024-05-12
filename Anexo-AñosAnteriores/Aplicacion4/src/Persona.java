

public class Persona {

    //Atributos

    private int documento;

    private String nombre;
    private String apellido;

    private int edad;

    //Propiedades

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int dni) {
        this.documento = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //Constructores

    public Persona(int edad, String nombre, String apellido, int documento ) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }

    public Persona() {
    }

    //Metodos



    public String retornarNombre(){

        return nombre+" "+apellido;
    }


    public boolean esMayorDeEdad(){
        return edad>=18;
    }

    public void incrementarEdad(){
        edad++;
    }

}
