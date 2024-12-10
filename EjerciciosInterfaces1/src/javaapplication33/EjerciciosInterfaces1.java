package javaapplication33;

public class EjerciciosInterfaces1 {
    
    public static int cuentaPrestados(Object [] losObjetos){
        int totalPrestados = 0;
        for (Object actual : losObjetos) {
            if(actual instanceof Prestable){
                if(((Prestable) actual).prestado()){
                    totalPrestados++;
                }
            }
        }
        return totalPrestados;
    }
    
    public static int publicacionesAnterioresA(Publicacion [] lasPublicaciones, int año){
        int totalAnteriores = 0;
        for (int x = 0; x < lasPublicaciones.length; x++) {
            if(lasPublicaciones[x].getAñoPublic()<año){
                totalAnteriores++;
            }
        }
        return totalAnteriores;
    }

    public static void main(String[] args) {
        Object [] losObjetos = new Object[5];
        String s1 = "Hola";
        Integer x = Integer.valueOf("3");
        Libros l1 = new Libros(1, "La concha de Raul", 1945);
        Libros l2 = new Libros(2, "Coquimbo arde", 1939);
        Publicacion p1 = new Publicacion(3, "Peneman la chupa", 3333);
        losObjetos[0] = l1;
        losObjetos[1] = s1;
        losObjetos[2] = x;
        losObjetos[3] = p1;
        losObjetos[4] = l2;
        System.out.println(cuentaPrestados(losObjetos));
        
        Publicacion [] lasPublicaciones = new Publicacion[3];
        lasPublicaciones[0] = l1;
        lasPublicaciones[1] = l2;
        lasPublicaciones[3] = p1;
        System.out.println("Las publicaciones anteriores son: ");
        
    }
    
}
