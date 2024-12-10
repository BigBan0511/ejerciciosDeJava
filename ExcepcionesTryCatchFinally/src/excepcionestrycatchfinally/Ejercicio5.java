package excepcionestrycatchfinally;

public class Ejercicio5 {
    
    public static void imprimString(String paraImprimir){
        System.out.println(paraImprimir);
    }
    
    public static int recibirIesimo(int [] miArray, int x){
        System.out.println(miArray[x]);
        return x;
    }

    public static void main(String[] args) {
        String s1;
        int [] a1 = {1,352,4,3};
        int index = 8;
        try{
            imprimString(s1);
            recibirIesimo(a1, index);
            
        }catch(IndexOutOfBoundsException e){
            System.out.println("El indice no es compatible con el array recibido");
        }catch(RuntimeException e){
            System.out.println("Error de lectura");
        }
    }
    
}
