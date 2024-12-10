package ejerciciosdeinterfaces;
public class EjerciciosDeInterfaces {
    public static int cuentaPrestados(Object [] losObjetos){
        int totalPrestados=0;
        for(Object actual : losObjetos){
            if(actual instanceof Prestable){
                if(((Prestable) actual).prestado())
                    totalPrestados++;
            }
        }
        return totalPrestados;
    }
    
    public static int publicacionesAnterioresA(Publicacion [] lasPublicaciones, int año){
        int totalAnteriores=0;
        for(int x=0; x<lasPublicaciones.length;x++){
            if(lasPublicaciones[x].getAñoPublicacion()<año)
                totalAnteriores++;
        }
        return totalAnteriores;
    }
    
    public static void main(String[] args) {
        Object [] losObjetos=new Object[5];
        String s1="Hola";
        Integer x=Integer.valueOf("3");
        Libro l1=new Libro("001", "La épica del Madrid", 1910);
        Libro l2= new Libro("002", "Como aceptar la derrota", 2024);
        Publicacion p1=new Publicacion("003", "kdmpsm", 2021);
        l1.prestar();
        losObjetos[0]=l1;
        losObjetos[1]=s1;
        losObjetos[2]=x;
        losObjetos[3]=p1;
        losObjetos[4]=l2;
        System.out.println(cuentaPrestados(losObjetos));
        
        Publicacion []  lasPublicaciones=new Publicacion[3];
        lasPublicaciones[0]=l1;
        lasPublicaciones[1]=l2;
        lasPublicaciones[2]=p1;
        System.out.println("Las publicaiones anteriores son: ");
        System.out.println(publicacionesAnterioresA(lasPublicaciones, 2020));
        
    }
}
