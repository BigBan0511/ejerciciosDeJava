package ejerciciogarage;

public class Garaje {
    private Coche coche;
    private String averia;
    private int numeroCoches;
    private boolean hayCoche = false;

    public Garaje() {
        this.coche = null;
        this.averia = "";
        this.numeroCoches = 0;
    }
    
    public boolean aceptarCoche(Coche coche, String laAveria){
        if(this.hayCoche==true){
            System.out.println("Estamos llenos, lo sentimos");
            return false;
        }else{
            System.out.println("Lo dejaremos como nuevo");
            this.numeroCoches++;
            this.averia = laAveria;
            this.coche = coche;
            this.hayCoche = true;
            return true;
            if(laAveria.equalsIgnoreCase("aceite"))
                this.coche.getMotor().setLitrosAceite();
            return true;
        }
    }
    
    public boolean devolverCoche(){
        if(this.hayCoche==true){
            this.coche.acumularAveria();
            this.coche = null;
            this.hayCoche = false;
            System.out.println("Gracias por confiar en nosotros");
            return true;
        }else{
            System.out.println("No tenemos tu coche");
            return false;
        }
    }
}
