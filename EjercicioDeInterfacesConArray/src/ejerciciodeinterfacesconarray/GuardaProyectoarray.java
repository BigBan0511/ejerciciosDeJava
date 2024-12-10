/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciodeinterfacesconarray;

/**
 *
 * @author GSW1A9456853
 */
public class GuardaProyectoarray {
    private Proyecto[] arrayProyectos;
    private Proyecto p1;
    private Proyecto p2;
    private Proyecto p3;
    private Proyecto p4;
    private Proyecto p5;
    private Proyecto p6;

    public GuardaProyectoarray() {
        this.arrayProyectos = new Proyecto[3];
        this.p1 = new Proyecto("fisica", "JTC", "pdfgpdpg", 2004);
        this.p2 = new Proyecto("fisica", "ADR", "pdfgpdpg", 2004);
        this.p3 = new Proyecto("fisica", "NTF", "pdfgpdpg", 2004);
        this.p4 = new Proyecto("fisica", "LOP", "pdfgpdpg", 2004);
        this.p5 = new Proyecto("fisica", "BVF", "pdfgpdpg", 2004);
        this.p6 = new Proyecto("fisica", "TGR", "pdfgpdpg", 2004);
    }
    
    public void insertarEnArray(){
        guardarEnArray(p1);
        guardarEnArray(p2);
        guardarEnArray(p3);
        guardarEnArray(p4);
        guardarEnArray(p5);
        guardarEnArray(p6);
    }
    
    public void mostrarArray(){
        for (int i = 0; i < arrayProyectos.length; i++) {
            if(arrayProyectos[i] == null){
                
            }else{
                System.out.println(arrayProyectos[i].getCodigo());
            }
        }
    }
    
    public void guardarEnArray(Proyecto nuevoProyecto){
        boolean lleno = true;
        for (int i = 0; i < 7; i++) {
            if(arrayProyectos[i] == null){
                lleno = false;
            }
        }
        if(lleno){
            agrandarArray();
        }
        Proyecto[] ordenar = arrayProyectos;
        if(arrayProyectos[0] == null){
            ordenar[0] = nuevoProyecto;
        }else{
            for (int i = 0; i < arrayProyectos.length; i++) {
                if(arrayProyectos[i] == null){
                    arrayProyectos[i] = nuevoProyecto;
                }else{
                    if(nuevoProyecto.compareTo(arrayProyectos[i]) < 0){
                        ordenar[i] = nuevoProyecto;
                        i++;
                        ordenar[i] = arrayProyectos[i];
                    }else{
                        ordenar[i] = arrayProyectos[i];
                    }
                }
            }
            
        }
        arrayProyectos = ordenar;
    }
    
    public void agrandarArray(){
        Proyecto[] intermedio = new Proyecto[arrayProyectos.length * 2];
        for (int i = 0; i < arrayProyectos.length; i++) {
            intermedio[i] = arrayProyectos[i];
        }
        arrayProyectos = intermedio;
    }
    
}
