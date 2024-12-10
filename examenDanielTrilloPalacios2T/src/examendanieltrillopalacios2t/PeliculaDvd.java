package examendanieltrillopalacios2t;

public class PeliculaDvd  extends Producto{
    private String nombre;
    private String director;
    private double precio;

    public PeliculaDvd(String nombre, String director, double precio, String madeIn, int numeroUnidades) {
        super(madeIn, numeroUnidades);
        this.nombre = nombre;
        this.director = director;
        this.precio = precio;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("El nombre de la pelicula es " + this.nombre + ", del director " + this.director + " y cuesta un total de " + this.precio);
        System.out.println("Esta hecha en " + this.madeIn + " y quedan " + this.numeroUnidades + " unidades");
    }

    public String getNombre() {
        return nombre;
    }

    public String getDirector() {
        return director;
    }

    public double getPrecio() {
        return precio;
    }
    
    @Override
    public void setNumeroUnidades(int numeroUnidades) {
        this.numeroUnidades = numeroUnidades;
    }
}
