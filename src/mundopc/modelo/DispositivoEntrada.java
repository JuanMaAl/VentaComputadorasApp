package mundopc.modelo;

public class DispositivoEntrada {
    //Atributos
    private String tipoEntrada;
    private String marca;

    //Constructor
    public DispositivoEntrada(String tipoEntrada, String marca){
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    //Métodos getters y setters
    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    //Método To String
    @Override
    public String toString() {
        return "DispositivoEntrada{" +
                "tipoEntrada='" + tipoEntrada + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}// fin clase DispositivoEntrada
