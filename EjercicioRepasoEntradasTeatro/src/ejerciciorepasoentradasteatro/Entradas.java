package ejerciciorepasoentradasteatro;

public class Entradas {
    private double precio;
    private char diaDeLaSemana;
    private int cantidad;
    protected int dia;

    public Entradas() {
        char[] dias = {'L', 'M', 'X', 'J', 'V', 'S', 'D'};
        int num = (int)(Math.random()*7)+1;
        switch (num) {
            case 1:
                this.diaDeLaSemana = 'L';
                this.dia = 1;
                break;
            case 2:
                this.diaDeLaSemana = 'M';
                this.dia = 2;
                break;
            case 3:
                this.diaDeLaSemana = 'X';
                this.dia = 3;
                break;
            case 4:
                this.diaDeLaSemana = 'J';
                this.dia = 4;
                break;
            case 5:
                this.diaDeLaSemana = 'V';
                this.dia = 5;
                break;
            case 6:
                this.diaDeLaSemana = 'S';
                this.dia = 6;
                break;
            case 7:
                this.diaDeLaSemana = 'D';
                this.dia = 7;
                break;
        }
        this.dia = this.diaDeLaSemana;
        do {            
            this.cantidad = (int)(Math.random()*50+1);
        } while (this.cantidad<1 || this.cantidad>50);
    }
    
    public void ventaDeEntrada(){
        if(this.cantidad>0){
            System.out.println("Entrada vendida");
            this.cantidad--;
        }else{
            System.out.println("No quedan mas entradas");
        }
    }
    
    public void mostrarEntradas(){
        String entradas = "Las entradas cuestan " + this.precio + " la unidad, " 
                + " \npara el " + this.diaDeLaSemana + " y quedan " + this.cantidad + " entradas";
        System.out.println(entradas);
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public char getDiaDeLaSemana() {
        return diaDeLaSemana;
    }

    public int getDia() {
        return dia;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    
}
