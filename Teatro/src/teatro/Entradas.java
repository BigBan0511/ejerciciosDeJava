package teatro;

public class Entradas {
    protected double precio;
    protected char diaDeLaSemana;
    protected int cantidad;
    //Uso esta variable para comparar los días con la posición del espectáculo
    protected int numDia;

    public Entradas() {
        //Generamos el nº aleatorio
        int dia=(int)(Math.random()*7)+1;
        switch(dia){
            case 1:
                this.diaDeLaSemana='L';
                this.numDia=1;
                break;
            case 2:
                this.diaDeLaSemana='M';
                this.numDia=2;
                break;
            case 3:
                this.diaDeLaSemana='X';
                this.numDia=3;
                break;
            case 4:
                this.diaDeLaSemana='J';
                this.numDia=4;
                break;
            case 5:
                this.diaDeLaSemana='V';
                this.numDia=5;
                break;
            case 6:
                this.diaDeLaSemana='S';
                this.numDia=6;
                break;
            case 7:
                this.diaDeLaSemana='D';
                this.numDia=7;
                break;
        }
        this.cantidad=(int)(Math.random()*50+1);
    }
    
    public void ventaEntradas(){
        if(this.cantidad>0){
            System.out.println("Entrada vendida");
            this.cantidad--;
        }
        else
            System.out.println("las entradas están agotadas");
    }
    
    public void mostrarEntradas(){
        System.out.println("El espectáculo es el " + this.diaDeLaSemana);
        System.out.println("Su precio es de " + this.precio);
        System.out.println("Quedan " + this.cantidad + " entradas");
    }
    
    public void setPrecio(double precio){
        this.precio=precio;
    }

    public double getPrecio() {
        return precio;
    }

    public char getDiaDeLaSemana() {
        return diaDeLaSemana;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getNumDia() {
        return numDia;
    }
    
    
    
    
}
