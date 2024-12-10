package ejerciciosdeclasesi;

public class probarLibro {

    public static void main(String[] args) {
        Libro nuevoLibro=new Libro();
        nuevoLibro.mostrarInfoLibro();
        
        nuevoLibro.prestarLibro();
        nuevoLibro.mostrarInfoLibro();
        
        nuevoLibro.devolverLibro();
        nuevoLibro.mostrarInfoLibro();
        
        Libro otroLibroComparar=new Libro();
        if(nuevoLibro.compararAutores(otroLibroComparar)==true){
            System.out.println("Es el mismo autor");
        }else{
            System.out.println("Son distintos autores");
        }
    }
    
}
