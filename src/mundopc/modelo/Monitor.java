package mundopc.modelo;

public class Monitor {
    //Atributos
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;

    //Constructores
    private Monitor(){
        idMonitor = ++contadorMonitores;
    }

    public Monitor(String marca, double tamanio){
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }

    //Métodos
    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", marca='" + marca + '\'' +
                ", tamanio=" + tamanio +
                '}';
    }
}//fin clase Monitor
