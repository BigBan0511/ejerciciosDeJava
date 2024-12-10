package javaapplication33;

public class EjerciciosInterfaces1 {

    public static void main(String[] args) {
        Proyecto p1 = new Proyecto("fgdgbj", 2, "hefdjh", 1854);
        Proyecto p2 = new Proyecto("fgdgbj", 5, "hefdjh", 1854);
        Proyecto p3 = new Proyecto("fgdgbj", 1, "hefdjh", 1854);
        almacenaProyectos guardador = new almacenaProyectos();
        guardador.añadirProyecto(p1);
        guardador.añadirProyecto(p3);
        guardador.añadirProyecto(p2);
    }
    
}
