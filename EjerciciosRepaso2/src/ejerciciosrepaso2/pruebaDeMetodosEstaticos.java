package ejerciciosrepaso2;


public class pruebaDeMetodosEstaticos {

   
    public static void main(String[] args) {
        Password p1=new Password(25);
        System.out.println(p1.getPass());
        System.out.println(p1.esFuerte());
    }

}
