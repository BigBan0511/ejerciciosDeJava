package ejerciciosinterfacesexamen;

public class EjerciciosInterfacesExamen {
    
    public static int cuentaPrestados(Object [] miArray){
        int contador = 0;
        for (Object actual : miArray) {
            if(actual instanceof Prestable){
                if(((Prestable)actual).prestado()){
                    contador++;
                }
            }
        }
        return contador;
    }
    
    public static int publicacionesAnterioresA(Publicacion[] miArray, int año){
        int contador = 0;
        for (int x = 0; x < miArray.length; x++) {
            if(miArray[x].getAñoPublicacion()<año){
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Libro l1 = new Libro("2", "Pene", 1945);
        Revista r1 = new Revista(22, "3", "La meada", 1939);
        l1.prestado();
        l1.prestar();
        l1.prestado();
        l1.devolver();
        l1.prestado();
        l1.prestar();
        System.out.println(r1.toString());
        Object[] miArray = {l1,r1};
        System.out.println(cuentaPrestados(miArray));
        Publicacion[] miArry = {l1,r1};
        System.out.println(publicacionesAnterioresA(miArry, 1945));
    }
    
}
