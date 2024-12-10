package ejerciciodeinterfacesconarray;

import java.util.ArrayList;

public class GuardaProyectos {
    private ArrayList<Proyecto> losPoryectosOrdenados;

    public GuardaProyectos() {
        this.losPoryectosOrdenados=new ArrayList<>();
    }
    
    public boolean añadirProyecto(Proyecto nuevoProyecto){
        //Debemos comprobar si la estructura de datos está vacía, si lo está añadimos el primer proyecto
        if(this.losPoryectosOrdenados.size()==0)
            return this.losPoryectosOrdenados.add(nuevoProyecto);
        else{
            //En este caso estamos en el supuesto de que hay que ordenar el ArrayList
            //Recorremos el ArrayList
            for(int x=0; x<this.losPoryectosOrdenados.size();x++){
                //Iremos comprobando si el elemento nuevo tiene un cógigo menor que el elemento actual
                //del arrayList, si lo tiene, lo inserto en esa posición, sino continuo, si llego al final y
                //no he introducido aun el elemento lo introduzco al final
                if(this.losPoryectosOrdenados.get(x).getCodigo().compareTo(nuevoProyecto.getCodigo())>0){
                    //Significa que el código del elemento pasado por parámetro es más ppequeño que el actual, por lo tanto 
                    //lo inserto en su posición
                    this.losPoryectosOrdenados.add(x, nuevoProyecto);
                    return true;
                }
            }return this.losPoryectosOrdenados.add(nuevoProyecto);
        }
    }
    
    public void mostrarProyectos(){
        for(Proyecto actual : this.losPoryectosOrdenados)
            System.out.println(actual);
    }
    
}
