package javaapplication33;

import java.util.ArrayList;

public class almacenaProyectos {
    ArrayList<Proyecto> misProyectos;
    

    public almacenaProyectos() {
        this.misProyectos = new ArrayList<>();
    }
    
    public boolean añadirProyecto(Proyecto nuevoProyecto){
        //Debemos comprobar si la estructura de datos está vacía, si lo está
        //añadimos el primer proyecto
        if(this.misProyectos.size()==0)
            this.misProyectos.add(nuevoProyecto);
        else{
            //En este caso esamos en el supuesto de que hay que ordenar el ArrayList
            for (int x = 0; x < this.misProyectos.size(); x++) {
                //Iremos comprobando si el elemento nuevo tiene un codigo menor que el elemento actual
                //del arrayList, si lo tiene, lo inserto en esa posicion, si no continuo, si llego al final y
                //no he introducido aun el elemento lo introduzco al final
                if(this.misProyectos.get(x).getCodigo().compareTo(nuevoProyecto.getCodigo())>0){
                    this.misProyectos.add(x, nuevoProyecto);
                    return true;
                }
            }return this.misProyectos.add(nuevoProyecto);
        }
    }
    
    public void mostrarProyectos(){
        
    }
    
}
