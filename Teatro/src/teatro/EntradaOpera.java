package teatro;
public class EntradaOpera extends Entradas{
    private boolean tenor;
    private boolean soprano;

    public EntradaOpera() {
        super();
        setPrecio(50);
        int eleccion=(int)(Math.random()*2)+1;
        if(eleccion==1){
            this.tenor=true;
            this.soprano=false;
        }else{
            this.tenor=false;
            this.soprano=true;
        }
    }
    
    @Override
    public void mostrarEntradas(){
        System.out.println("Este es un espectáculo de opera");
        super.mostrarEntradas();
        if(tenor)
            System.out.println("Hay un tenor en este espectáculo");
        else
            System.out.println("Hay una soprano en este espectáculo");
    }
    
    
    
    
}
