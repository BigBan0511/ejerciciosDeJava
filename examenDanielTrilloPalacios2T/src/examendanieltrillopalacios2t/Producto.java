package examendanieltrillopalacios2t;

import java.util.Scanner;

public class Producto {
    final Scanner datos = new Scanner (System.in);
    protected String madeIn;
    protected int numeroUnidades;
    protected String[] losPaises = {"USA","Japon","España"};

    public Producto(String madeIn, int numeroUnidades) {
        this.madeIn = madeIn;
        if(!this.losPaises[0].equalsIgnoreCase(this.madeIn) &&
                !this.losPaises[1].equalsIgnoreCase(this.madeIn) &&
                !this.losPaises[2].equalsIgnoreCase(this.madeIn)){
            for (int x = 0; x < this.losPaises.length;) {
                do {      
                    System.out.println("Introduce un pais valido");
                    this.madeIn = datos.nextLine();
                } while (!this.losPaises[x].equalsIgnoreCase(this.madeIn));
                x = this.losPaises.length;
            }
        }
        madeInValido();
        this.numeroUnidades = numeroUnidades;
        if(this.numeroUnidades<=1){
            this.numeroUnidades = 10;
            numUnidadesValido();
        }
        numUnidadesValido();
    }
    
    public boolean madeInValido(){
        return true;
    }
    
    public boolean numUnidadesValido(){
        return true;
    }
    
    public void vender(){
        this.numeroUnidades--;
    }
    
    public void mostrarInfo(){
        System.out.println("El producto esta hecho en " + this.madeIn + " y quedan " + this.numeroUnidades + " unidades");
    }

    public String getMadeIn() {
        return madeIn;
    }

    public int getNumeroUnidades() {
        return numeroUnidades;
    }

    public void setNumeroUnidades(int numeroUnidades) {
        this.numeroUnidades = numeroUnidades;
    }
    
    
    
}
