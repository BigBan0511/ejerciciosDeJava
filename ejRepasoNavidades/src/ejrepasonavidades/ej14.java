package ejrepasonavidades;

public class ej14 {
    
    public static void main(String[] args) {
        int v1 = 234;
        int v2 = 12354;
        int v3 = 3528;
        if(v1>v2 && v1>v3){
            System.out.println("el numero mas grande es: " + v1);
        }
        if(v2>v1 && v2>v3){
            System.out.println("el numero mas grande es: " + v2);
        }
        if(v3>v2 && v3>v1){
            System.out.println("el numero mas grande es: " + v3);
        }
    }
    
}
