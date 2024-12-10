package ejerciciosexcepciones2;

public class MiArrayCopiador {
    private int[] miArray;

    public MiArrayCopiador(int tam) {
        this.miArray = new int[tam];
    }
    
    public int[] copiaArray(int[] miArrayy) throws ControlaTamañoException{
        if(this.miArray.length != miArrayy.length){
            throw new ControlaTamañoException("El tamaño del array pasado no es el mismo que el del atributo");
        }else{
            for (int x = 0; x < this.miArray.length; x++) {
                this.miArray[x] = miArrayy[x];
            }
        }
        return miArrayy;
    }
    
    
}
