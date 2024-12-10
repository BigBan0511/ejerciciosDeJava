package examendanieltrillopalacios2t;

public class Juego extends Producto{
    private String nombre;
    private String consola;
    private double precio;

    public Juego(String nombre, String consola, double precio, String madeIn, int numeroUnidades) {
        super(madeIn, numeroUnidades);
        this.nombre = nombre;
        this.consola = consola;
        this.precio = precio;
        if(this.precio<=1){
            this.precio = 10;
        }
    }
    
    public Juego(String nombre, double precio, String madeIn, int numeroUnidades){
        super(madeIn, numeroUnidades);
        this.nombre = nombre;
        this.precio = precio;
        int num = (int)(Math.random()*3)+1;
        switch (num) {
            case 1:
                this.consola = "PlayStation4";
                break;
            case 2:
                this.consola = "WiiU";
                break;
            case 3:
                this.consola = "XboxOne";
                break;
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println("El nombre del juego para la consola " + this.consola + " es " + this.nombre + " y cuesta " + this.precio);
        super.mostrarInfo();
    }

    public String getNombre() {
        return nombre;
    }

    public String getConsola() {
        return consola;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public void setNumeroUnidades(int numeroUnidades) {
        this.numeroUnidades = numeroUnidades;
    }
    
    
    
}
