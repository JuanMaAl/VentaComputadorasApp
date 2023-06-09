package mundopc.modelo;

public class Teclado extends DispositivoEntrada{
    //Atributos
    private final int idTeclado;
    private static int contadorTeclados;

    //Constructor
    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        idTeclado = ++contadorTeclados;
    }

    //To String

    @Override
    public String toString() {
        return "Teclado{" +
                "idTeclado=" + idTeclado +
                "} " + super.toString();
    }
}
