package ejercicioexamenconobjetos;

public class EjercicioExamenConObjetos {

    public static void main(String[] args) {
        //Fecha fechaPrueba = new Fecha(22,05,2024);
        //Hora horaPrueba = new Hora(12,30);
        Fecha f1 = new Fecha(22,05,2024);
        Hora h1 = new Hora(12,30);
        Fecha f2 = new Fecha(25,05,2024);
        Hora h2 = new Hora(10,30);
        Fecha f3 = new Fecha(29,05,2024);
        Hora h3 = new Hora(11,30);
        Fecha f4 = new Fecha(21,05,2024);
        Hora h4 = new Hora(06,30);
        Fecha f5 = new Fecha(22,05,2024);
        Hora h5 = new Hora(12,30);
        Fecha f6 = new Fecha(22,05,2024);
        Hora h6 = new Hora(12,30);
        /*System.out.println(fechaPrueba);
        fechaPrueba.nuevaFecha(2, 3, 1945);
        System.out.println(fechaPrueba);
        System.out.println(horaPrueba);
        horaPrueba = new Hora(14,50);
        System.out.println(horaPrueba);*/
        Examen e1 = new Examen(f1,h1);
        Examen e2 = new Examen(f2,h2);
        Examen e3 = new Examen(f3,h3);
        Examen e4 = new Examen(f4,h4);
        Examen e5 = new Examen(f5,h5);
        Examen e6 = new Examen(f6,h6);
        //System.out.println(e1);
        /*fechaPrueba.nuevaFecha(31, 12, 2020);
        System.out.println(e1);*/
        Examen [] losExamenes = new Examen [6];
        losExamenes[0] = e1;
        losExamenes[1] = e2;
        losExamenes[2] = e3;
        losExamenes[3] = e4;
        losExamenes[4] = e5;
        losExamenes[5] = e6;
        Alumno a1 = new Alumno("Juanito","12345-z",22,"2ºB",losExamenes);
        a1.ponerNota();
        a1.ponerNota();
        a1.ponerNota();
        System.out.println(a1);
        a1.ponerNota();
        a1.ponerNota();
        a1.ponerNota();
        System.out.println(a1);
        Alumno [] losAlumnos = {a1,a1,a1,a1,a1};
        Clase daw = new Clase(losAlumnos);
        daw.calcularMedia();
    }
    
}
