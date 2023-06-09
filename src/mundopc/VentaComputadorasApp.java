package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;

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
        System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("bluetooth", "Lenovo");
        System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        System.out.println(monitorLenovo);
        Computadora computadoraLenovo =
                new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        System.out.println(computadoraLenovo);

    }// fin main
}// fin clase mundopc.Main