package ejemplopolimorfismo;


public class EjemploPolimorfismo {

   
    public static void main(String[] args) {
        /*Animal a1=new Animal(3, "León", 100);
        a1.hacerSonido();
        Gato g1=new Gato("persa", "Suave", 5, "gato", 4);
        g1.hacerSonido();
        Perro p1=new Perro("Marrón", "Golden", 8, "Perro", 18);
        p1.hacerSonido();
        Humano h1=new Humano("Bombero", true, 38, "Humano", 85);
        h1.hacerSonido();*/
        //He guardado en Animal que es la clase madre objetos de otros tipos heredados
        /*Animal a1=new Gato("persa", "Suave", 5, "gato", 4);
        Animal a2=new Perro("Marrón", "Golden", 8, "Perro", 18);
        Animal a3=new Humano("Bombero", true, 38, "Humano", 85);
        a1.hacerSonido();
        a2.hacerSonido();
        a3.hacerSonido();
        System.out.println(a1.getEdad());
        System.out.println(a2.getEdad());
        System.out.println(a3.getEdad());
        a1.cumplirAñosHumanos();
        a2.cumplirAñosHumanos();
        a3.cumplirAñosHumanos();
        System.out.println(a1.getEdad());
        System.out.println(a2.getEdad());
        System.out.println(a3.getEdad());*/
        Animal [] misAnimales=new Animal[3];
        misAnimales[0]=new Gato("persa", "Suave", 5, "gato", 4);
        misAnimales[1]=new Perro("Marrón", "Golden", 8, "Perro", 18);
        misAnimales[2]=new Humano("Bombero", true, 38, "Humano", 85);
        for(Animal actual:misAnimales){
            System.out.println("MÉTODOS DE ANIMAL Y SOBRESCRITOS");
            actual.hacerSonido();
            System.out.println("Antes de cumplir años " + actual.getEdad());
            actual.cumplirAñosHumanos();
            System.out.println("Despues de cumplir años " + actual.getEdad());
            System.out.println("MÉTODOS CONCRETOS DE CADA CLASE HIJA");
            //NO PODEMOS ACCEDER A LOS MÉTODOS PROPIOS DE LA CLASE HIJA PORQUE NO SABEMOS
            //QUE ANIMAL TENEMOS AQUÍ, PARA HACER ESTO DEBEMOS CASTEAR
            if(actual instanceof Gato)
                System.out.println(((Gato)actual).getTipoPelaje());
            else if(actual instanceof Perro)
                System.out.println(((Perro)actual).getColor());
            else if(actual instanceof Humano)
                System.out.println(((Humano)actual).getProfesion());
        }
    }

}
