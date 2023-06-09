package mundopc.modelo;

public class Computadora {
    //Atributos
    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadoras;

    //Constructores
    private Computadora(){
        idComputadora = ++contadorComputadoras;
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton){
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    //Métodos
    @Override
    public String toString() {
        return "Computadora{" +
                "idComputadora=" + idComputadora +
                ", \nnombre='" + nombre + '\'' +
                ", \nmonitor=" + monitor +
                ", \nteclado=" + teclado +
                ", \nraton=" + raton +
                '}';
    }
}//fin Clase Computadora
