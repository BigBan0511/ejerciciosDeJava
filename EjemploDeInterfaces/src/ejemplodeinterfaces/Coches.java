package ejemplodeinterfaces;

public class Coches implements Vehiculo{
    private int cv;
    private String marca;
    private String modelo;

    @Override
    public void arrancar() {
        System.out.println("brmmmmmmm");
    }

    @Override
    public boolean necesitoRepostar(int litros) {
        if(litros<10){
            return true;
        }else{
            return false;
        }
    }
    //No podemos modificar los "atributos" de un interfaz porque todos son final por defecto
    /*public void setMatricula(String nuevaMatricula){
        this.matricula = nuevaMatricula;
    }*/

    public void mostrarInfo(){
        System.out.println("La marca es " + this.marca);
        System.out.println("El modelo es " + this.modelo);
        System.out.println("Tiene " + this.cv + " caballos de potecia");
        //Podemos acceder a los atributos del interfaz
        System.out.println("Su velocidad max en carretera es " + this.velocidadMaxEnCarretera);
    }
}
