package examendanieltrillopalacios2t;

import java.util.Scanner;

public class ExamenDanielTrilloPalacios2T {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        boolean valido = false;
        Tienda t1 = new Tienda();
        do {
            System.out.println("A-Ver Productos");
            System.out.println("B-Ver Director/consolas");
            System.out.println("C-Añadir Juego");
            System.out.println("D-Añadir Pelicula");
            System.out.println("E-Vender Producto");
            System.out.println("F-Mostrar ganancias");
            System.out.println("S-Salir");
            String eleccion = datos.next().toUpperCase();
            switch (eleccion) {
                case "A":
                    t1.infoProductos();
                    valido = true;
                    break;
                case "B":
                    t1.verDirectorConsola();
                    break;
                case "C":
                    t1.añadirJuego();
                    valido = true;
                    break;
                case "D":
                    t1.añadirPelicula();
                    valido = true;
                    break;
                case "E":
                    t1.venderProducto();
                    valido = true;
                    break;
                case "F":
                    t1.mostrarGanancia();
                    valido = true;
                    break;
                case "S":
                    valido = true;
                    break;
                default:
                    System.out.println("Esa opcion no existe");
            }
        } while (valido == false);
        
    }
    
}
