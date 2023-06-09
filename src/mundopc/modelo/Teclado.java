package mundopc.modelo;

public class Teclado extends DispositivoEntrada{
    //Atributos
    private final int idTeclado;
    private static int contadorTeclados;

    //Constructores
    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        idTeclado = ++contadorTeclados;
    }

    //Métodos
    @Override
    public String toString() {
        return "Teclado{" +
                "idTeclado=" + idTeclado +
                "} " + super.toString();
    }
}
