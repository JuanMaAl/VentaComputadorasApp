package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

/*
    Segundo proyecto del curso "Java en 13 Días con Aplicaciones del Mundo Real!"
    Aprende Java, Spring Boot, Swing, Java FX, JSPs, Thymeleaf, JSF-PrimeFaces,
    FullStack con Angular, React y Spring Boot!
    https://www.udemy.com/course/aprende-java-en-13-dias-con-aplicaciones-del-mundo-real-spring/
 */
public class VentaComputadorasApp {
    public static void main(String[] args) {
        //Crear objetos
        Raton ratonLenovo = new Raton("bluetooth", "Lenovo");
        //System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("bluetooth", "Lenovo");
        //System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        //System.out.println(monitorLenovo);

        //Creamos el primer objeto de tipo computadora
        Computadora computadoraLenovo =
                new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        //System.out.println(computadoraLenovo);

        //Creamos el segundo objeto de tipo computadora
        Monitor monitorDell = new Monitor("Dell", 15);
        Teclado tecladoDell = new Teclado("usb", "Dell");
        Raton ratonDell = new Raton("usb", "Dell");
        Computadora computadoraDell =
                new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);

        //Creamos una orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraDell);
        orden1.mostrarOrden();

        //Creamos un tercer objeto computadora
        Monitor monitorMac = new Monitor("Mac", 27);
        Teclado tecladoMac = new Teclado("bluetooth", "Mac");
        Raton ratonMac = new Raton("bluetooth", "Mac");
        Computadora computadoraIMac =
                new Computadora("IMac", monitorMac, tecladoMac, ratonMac);

        //Creamos una segunda orden
        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraIMac);
        orden2.agregarComputadora(computadoraDell);
        orden2.agregarComputadora(computadoraLenovo);
        System.out.println();
        orden2.mostrarOrden();
    }// fin main
}// fin clase mundopc.Main