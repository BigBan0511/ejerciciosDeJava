package ejerciciosdestring;


public class EjerciciosDeString {
    
    //Para definir una función tenemos que decir es
    //POR AHORA public static tipo_devolución (si devuelve un entero
    //será int, si es un caracter será char, un array int[]
    //sino devuleve nada será void, nombre.
    //Tras el nombre y entre paréntesis pondremos parámetros
    //si fuesen necesarios (variables que la f(x) necesita para
    //ejecutarse).
    
    
    public static void ejercicio1(){
        //Aquí dentro escribimos lo que hace la función
        String c1="This is Java!";
        System.out.println("El tam del string es: " + c1.length());
    }
    
    public static void ejercicio2(){
        String c1="Java";
        for(int x=0; x<c1.length();x++)
            System.out.println("Caracter " + x + " : " + c1.charAt(x));
    }
    
    //Como esta funcion no es void sino String, al finalizar 
    //DEBE DEVOLVER UN STRING
    public static String ejercicio3B(){
        String c1="Java desde 0";
        String c2="";
        for(int x=c1.length()-1; x>=0; x--){
            //Recorro el String c1 al revés
            c2=c2+c1.charAt(x);
        }
        //Como he definido la función como String (es decir devuelve un
        //String) al final debo hacer return String
        return c2;
    }
    
    
    public static void ejercicio3(){
        String c1="Java desde 0";
        //Voy a recorre c1 al revés y voy a añadir cada caracter a c2
        for(int x=c1.length()-1;x>=0; x--)
            System.out.print(c1.charAt(x));
    }
    
    //Usando funciones de la clase String
    public static void ejercicio4(){
        String c1="James Gosling Created Java";
        c1=c1.replaceAll(" ", "");
        System.out.println(c1);
    }
    
    public static void ejercicio4SinFunciones(){
        String c1="James Gosling Created Java";
        String c2="";
        for(int x=0; x<c1.length();x++){
            //Recorro el String
            if(c1.charAt(x)!=' ')
                c2=c2+c1.charAt(x);
        }
        System.out.println(c2);
    }
    
    
   
    public static void main(String[] args) {
        //Para que la función se ejecute tengo que llamarla
        //desde el main()
        /*ejercicio1();
        System.out.println(c1); NO SE PUEDE LLAMAR c1 PORQUE
        SOLO VIVE DENTRO DE LA FUNCIÓN*/
        //ejercicio2();
        //Como hemos dicho que ejercicio3B() devuelve un String
        //puedo usar la llamada de la función en cualquier sitio
        //donde pudiese usar un String
        //System.out.println(ejercicio3B());
        //Otra opción es guardar el retorno en un String
        /*String cadena1=ejercicio3B();
        System.out.println(cadena1);*/
        System.out.println(ejercicio3B());
    }
}
