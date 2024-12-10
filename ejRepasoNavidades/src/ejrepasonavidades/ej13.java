package ejrepasonavidades;

public class ej13 {

    public static void main(String[] args) {
        int v1 = 32;
        int v2 = 42365;
        int v3 = 258;
        if(v1<v2 && v1<v3){
            if(v2<v3){
                System.out.println("Ordenados de menor a mayor son " + v1 + ", " + v2 + ", " + v3);
            }
            if(v3<v2){
                System.out.println("Ordenados de menor a mayor son " + v1 + ", " + v3 + ", " + v2);
            }
        }else if(v2<v1 && v2<v3){
            if(v1<v3){
                System.out.println("Ordenados de menor a mayor son " + v2 + ", " + v1 + ", " + v3);
            }
            if(v3<v1){
                System.out.println("Ordenados de menor a mayor son " + v2 + ", " + v3 + ", " + v1);
            }
        }else if(v3<v1 && v3<v2){
            if(v1<v2){
                System.out.println("Ordenados de menor a mayor son " + v3 + ", " + v1 + ", " + v2);
            }
            if(v2<v1){
                System.out.println("Ordenados de menor a mayor son " + v3 + ", " + v2 + ", " + v1);
            }
        }
    }
    
}
