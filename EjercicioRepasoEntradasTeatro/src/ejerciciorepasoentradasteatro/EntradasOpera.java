package ejerciciorepasoentradasteatro;

public class EntradasOpera extends Entradas{
    private boolean tenor;
    private boolean soprano;

    public EntradasOpera() {
        super();
        int num = (int)(Math.random()*2);
        if(num==0){
            this.tenor= true;
            this.soprano = false;
        }else{
            this.soprano=true;
            this.soprano = false;
        }
        setPrecio(50);
    }

    @Override
    public void mostrarEntradas() {
        System.out.println("Esto es un espectaculo de opera");
        super.mostrarEntradas();
        if(tenor){
            System.out.println("Hay un tenor en este espectaculo");
        }else{
            System.out.println("Hay una soprano en este espectaculo");
        }
    }
    
    
    
}
