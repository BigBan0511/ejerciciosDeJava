package ejerciciosdeinterfaces;


public class MainProyectos {

   
    public static void main(String[] args) {
        Proyecto p1=new Proyecto("Informática", "II1", "El interfaz comparable", 2024);
        Proyecto p2=new Proyecto("Derecho", "GD1", "La ley de Talión", 0003);
        Proyecto p3=new Proyecto("Informática", "AI1", "Otros Inferfaces", 2023);
        GuardaProyectos guardador=new GuardaProyectos();
        guardador.añadirProyecto(p1);
        guardador.añadirProyecto(p3);
        guardador.añadirProyecto(p2);
        guardador.añadirProyecto(p3);
        guardador.mostrarProyectos();
    }

}
