package ejerciciosherencia1;

public class ListaMultimedia {
    private Multimedia[] objetosMultimedia;
    private int numObjetosAlmacenados;

    public ListaMultimedia(Multimedia[] objetosMultimedia, int numObjetosAlmacenados) {
        this.objetosMultimedia = objetosMultimedia;
        this.numObjetosAlmacenados = numObjetosAlmacenados;
    }
    
    public int size(){
        int contador = 0;
        for (Multimedia m1 : this.objetosMultimedia){
            
        }
        return contador;
    }
    
    public boolean add(Multimedia m){
        boolean listaLlena = false;
        for (int x = 0; x < this.objetosMultimedia.length; x++) {
            if(this.objetosMultimedia[x]==null){
                this.objetosMultimedia[x] = m;
                listaLlena = true;
            }else{
                listaLlena = false;
            }
        }
        return listaLlena;
    }
    
    public Multimedia get(int posicion){
        Multimedia objetoPosicion = null;
        for (int x = 0; x < this.objetosMultimedia.length; x++) {
            this.objetosMultimedia[x] = objetoPosicion;
        }
        return objetoPosicion;
    }
    
    public String toString(){
        String datosLista = "";
        for (int x = 0; x < this.objetosMultimedia.length; x++) {
            datosLista = this.objetosMultimedia[x].toString();
        }
        return datosLista;
    }
    
}
