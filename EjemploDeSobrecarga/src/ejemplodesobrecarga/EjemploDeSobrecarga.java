package ejemplodesobrecarga;


public class EjemploDeSobrecarga {

   
    public static void main(String[] args) {
        Humano h1=new Humano("Juan", "hombre", 25, 70);
        Humano h2=new Humano();
        System.out.println(h1);
        System.out.println(h2);
        h1.comer();
        h2.comer("verduras");
        System.out.println("Después de comer");
        System.out.println(h1);
        System.out.println(h2);
    }

}
