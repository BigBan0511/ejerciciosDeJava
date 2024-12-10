package ejerciciosiniciales;

public class EjerciciosIniciales {

    public static void main(String[] args) {
        //EJEMPLO DE CASTING (CASTEO, CONVERSIÓN DE TIPOS)
        //Forzar a una variable de un tipo determinado a que se convierta
        //en una variable de otro tipo
        double numDoub=3.7;
        //Si intentamos guardar dentro de una variable entera un valor de tipo
        //double, Java llora.
        //int numInt=numDoub; -> ESTO NO SE PUEDE HACER
        //La solución es hacer un casteo varNew=(nuevo tipo de dato)varVieja
        int numInt=(int)numDoub;
        System.out.println("Valor en double: " + numDoub);
        System.out.println("Valor en entero: " + numInt);
        
        //Cuando tenemos que indicar el casteo entre paréntesis, es llamado
        //explícito.
        int num=97;
        char car=(char)num;
        System.out.println("Como numero: " + num);
        System.out.println("Como char: " + car);
        
        //Java puede realizar conversiones implicitas en ciertos casos, es decir
        //no tengo que hacer nada para que convierta. Pasar de char a int es
        //"Gratis"
        char car2='*';
        int num2=car2;
        System.out.println(num2);
        
        //No podemos castear lo que nos de la gana, hay variables que son incompatibles
        //entre sí
        int numCadena=4;
        String miCadena="Hola soy una cadena de caracteres";
        System.out.println(miCadena);
        //int numCadena=(int)miCadena; -> Este casteo no se puede hacer
        //miCadena=(String)numCadena;-> No se puede
        char cadenita='p';
        //miCadena=(String)cadenita;-> Tampoco se puede
        
       
     
    }
    
}
