package javaapplication33;

public class Proyect extends Publicacion implements Prestable, Comparable<Publicacion>{
    
    @Override
    public int compareTo(Publicacion p){
        return this.getCodigo();.compareTo(p.getCodigo());
    }
}
