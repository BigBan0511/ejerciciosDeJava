package examendanieltrillopalacios2t;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
    private ArrayList <Producto> productos;
    private double ganancia;

    public Tienda() {
        this.productos = new ArrayList<>(0);
    }
    
    public void añadirJuego(){
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce el nombre del juego");
        String nombrejuego = datos.nextLine();
        try {
            System.out.println("Introduce el precio del juego");
            double precioJuego = datos.nextDouble();
            if(nombrejuego != null){
                System.out.println("Introduce el pais de origen");
                String paisOrigen = datos.nextLine();
                System.out.println("");
                System.out.println("Introduce el numero de unidades");
                int numUnidades = datos.nextInt();
                Producto p1 = new Producto(paisOrigen, numUnidades);
                if(p1.madeInValido()==true && p1.numUnidadesValido()==true){
                    Juego nuevoJuego = new Juego(nombrejuego, "Playstation4", precioJuego, paisOrigen, numUnidades);
                    this.productos.add(nuevoJuego);
                }
            }
        } catch (Exception e) {
            System.out.println("Precio no valido");
        }
        
    }
    
    public void añadirPelicula(){
        boolean valido = false;
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce el nombre de la pelicula");
        String nombrePelicula = datos.nextLine();
        System.out.println("Introduce el nombre del director");
        String nombreDirector = datos.nextLine();
        do {            
            try {
                System.out.println("Introduce el precio de la pelicula");
                double precioPeli = datos.nextDouble();
                if(nombrePelicula != null && nombreDirector != null){
                    System.out.println("Introduce el pais de origen");
                    String paisOrigen = datos.nextLine();
                    System.out.println("Introduce el numero de unidades");
                    int numUnidades = datos.nextInt();
                    Producto p1 = new Producto(paisOrigen, numUnidades);
                    if(p1.madeInValido()==true && p1.numUnidadesValido()==true){
                        PeliculaDvd nuevaPeli = new PeliculaDvd(nombrePelicula, nombreDirector, precioPeli, nombreDirector, numUnidades);
                        this.productos.add(nuevaPeli);
                    }
                }
            } catch (Exception e) {
                System.out.println("Precio no valido");
            }
        } while (valido == false);
    }
    
    public void infoProductos(){
        for (int x = 0; x < this.productos.size(); x++) {
            this.productos.get(x).mostrarInfo();
        }
    }
    
    public void verDirectorConsola(){
        if(this.productos.isEmpty()){
            System.out.println("No hay productos");
        }else{
            for(Producto actual : this.productos){
                if(actual instanceof PeliculaDvd){
                    System.out.println(((PeliculaDvd)actual).getDirector());
                }else if(actual instanceof Juego){
                    System.out.println(((Juego)actual).getConsola());
                }
            }
        }
    }
    
    public void mostrarGanancia(){
        System.out.println("La ganancia es de " + this.ganancia);
    }
    
    public void venderProducto(){
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce el nombre del producto que desea adquirir");
        String nombre = datos.nextLine();
        for(Producto actual : this.productos){
            if(actual instanceof PeliculaDvd){
                if(((PeliculaDvd) actual).getNombre().equalsIgnoreCase(nombre)){
                    System.out.println("Producto vendido");
                    this.ganancia++;
                    actual.setNumeroUnidades(actual.getNumeroUnidades()-1);
                    if(actual.getNumeroUnidades()==0){
                        this.productos.remove(actual);
                        System.out.println("No quedan productos de este tipo");
                    }
                }
            }else if(actual instanceof Juego){
                if(((Juego) actual).getConsola().equalsIgnoreCase(nombre)){
                    System.out.println("Producto vendido");
                    this.ganancia++;
                    actual.setNumeroUnidades(actual.getNumeroUnidades()-1);
                    if(actual.getNumeroUnidades()==0){
                        this.productos.remove(actual);
                        System.out.println("No quedan productos de este tipo");
                    }
                }
            }else{
                System.out.println("El producto buscado no esta en la tienda");
            }
        }
    }
    
}
