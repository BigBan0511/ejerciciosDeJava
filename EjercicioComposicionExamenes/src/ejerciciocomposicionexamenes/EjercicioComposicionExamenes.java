package ejerciciocomposicionexamenes;


public class EjercicioComposicionExamenes {

   
    public static void main(String[] args) {
        /*Fecha f1=new Fecha(18, 1, 2024);
        System.out.println(f1);
        f1.nuevaFecha(2, 2, 2023);
        System.out.println(f1);
        Hora h1=new Hora(12, 27);
        System.out.println(h1);
        //Cuando hago new destruyo el objeto anterior y creo uno nuevo que anivel de mem
        //es diferente al h1 anterior, aunque se llame igual
        h1=new Hora(1, 23);
        System.out.println(h1);*/
        Fecha f1=new Fecha(18, 1, 2024);
        Hora h1=new Hora(12, 27);
        Fecha f2=new Fecha(18, 2, 2024);
        Hora h2=new Hora(13, 27);
        Fecha f3=new Fecha(18, 3, 2024);
        Hora h3=new Hora(14, 27);
        Fecha f4=new Fecha(15, 1, 2024);
        Hora h4=new Hora(12, 15);
        Fecha f5=new Fecha(18, 5, 2024);
        Hora h5=new Hora(10, 10);
        Fecha f6=new Fecha(23, 3, 2024);
        Hora h6=new Hora(9, 20);
        Examen e1=new Examen(f1, h1);
        Examen e2=new Examen(f2, h2);
        Examen e3=new Examen(f3, h3);
        Examen e4=new Examen(f4, h4);
        Examen e5=new Examen(f5, h5);
        Examen e6=new Examen(f6, h6);
        //Ya tengo los exámenes, ahora los meto en un array
        Examen [] losExamenes=new Examen[6];
    }

}
