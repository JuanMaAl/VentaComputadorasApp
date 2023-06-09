package mundopc.modelo;

public class Raton extends DispositivoEntrada {
    //Atributos
    private final int idRaton;
    private static int contadorRatones;

    //Constructores
    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        idRaton = ++contadorRatones;
    }

    //Métodos
    @Override
    public String toString() {
        return "Raton{" +
                "idRaton=" + idRaton +
                "} " + super.toString();
    }
}
