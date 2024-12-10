package ejerciciosexcepciones2;

public class EjerciciosExcepciones2 {

    public static void main(String[] args) throws ControlaTamañoException {
        int[] miarra = new int[5];
        try{
            MiArrayCopiador a1 = new MiArrayCopiador(5);
            a1.copiaArray(miarra);
        }catch (ControlaTamañoException e){
            System.out.println(e.getMessage());
        }
    }
    
}
