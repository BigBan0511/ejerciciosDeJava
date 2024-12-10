package ejerciciosdeinterfaces;


public class MainDeDiscos {

   
    public static void main(String[] args) {
        Disco [] losDiscos=new Disco[3];
        DiscoPrestable dp1=new DiscoPrestable("Solo Quiero caminar", "Paco de Lucía", "LP", 90, "Flamenco");
        DiscoPrestable dp2=new DiscoPrestable("Kind of Blue", "Miles Davis", "Corto", 45, "Jazz");
        DiscoPrestable dp3=new DiscoPrestable("Master of Puppets", "Metallica", "LP", 120, "Metal");
        losDiscos[0]=dp1;
        losDiscos[1]=dp2;
        losDiscos[2]=dp3;
        ((Prestable)(losDiscos[0])).prestar();
        ((Prestable)(losDiscos[2])).prestar();
        System.out.println(EjerciciosDeInterfaces.cuentaPrestados(losDiscos));
    }

}
