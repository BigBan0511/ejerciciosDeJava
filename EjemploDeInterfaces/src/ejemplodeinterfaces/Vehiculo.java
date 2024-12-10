package ejemplodeinterfaces;

public interface Vehiculo {
    //Todos sus atributos deben ser public, constantes lo ponga o no, y 
    //todos son static lo ponga o no
    public static final int velocidadMaxEnCarretera = 120;
    public String matricula = "onsadn";
    
    //Los interfaces no tienen constructores
    //Los interfaces solo tienen metodos abstractos
    /*public void arrancar(){
        System.out.println("Hemos arrancado");
    } --> Este metodo no se puede implementar*/
    
    public abstract void arrancar();
    public abstract boolean necesitoRepostar(int litros);
}
