package mundopc.servicio;
import mundopc.modelo.Computadora;
import java.util.ArrayList;
import java.util.List;

public class Orden {
    //Atributos
    private final int idOrden;
    private final List<Computadora> computadoras;
    private static int contadorOrdenes;

    //Constructores
    public Orden(){
        computadoras = new ArrayList<>();
        idOrden = ++contadorOrdenes;
    }

    //Metódos
    public void agregarComputadora(Computadora computadora){
        computadoras.add(computadora);
    }

    public void mostrarOrden(){
        System.out.println("Orden #: " + idOrden);
        System.out.println("Total de computadoras: " + computadoras.size());
        System.out.println();
        computadoras.forEach(System.out::println);
    }

}//fin clase Orden
