package ejerciciosstrings;

import java.util.Scanner;

public class EjerciciosStrings {

    //Para definir una función tenemos que decir es
        //POR AHORA public static tipo_devolución (si de vuelvo un entero
        //será int, si es un caracter será char, un array int[]
        //si no devuelve nada será void, nombre.
        //Tras el nombre y entre paréntesis pondremos parámetros
        //si fuesen necesarios (variables que la f(x) necesita para
        //ejecutarse)).
    
    public static void ejercicio1() {
        String texto= "This is Java";
        System.out.println("La longitud del texto " + texto + " en un mismo String es: " + texto.length());
    }
    
    public static void ejercicio2() {
        String texto= "Java";
        for (int x = 0; x < texto.length(); x++) {
            System.out.println("caracter " + x + " : " + texto.charAt(x));
        }
    }
    
    //Como esta función no es void, sino String, al finalizar debe devolver un String
    public static void ejercicio3() {
        String texto="Java desde 0";
        String texto2="";
        //Voy a recorrer texto al reves y voy a añadir cada caracter a texto2
        for (int x = texto.length()-1; x >=0; x--) {
            System.out.print(texto.charAt(x));
        }
    }
    
    public static String ejercicio3b () {
        String texto= "Java desde 0";
	String invertida = "";
	for (int x = texto.length()-1; x >= 0; x--) {
		invertida += texto.charAt(x);
		}
	System.out.println("Cadena original: " + texto);
	System.out.println("Cadena invertida: " + invertida);
        
        return invertida;
        }
    //Como he definido la funcion como string (es decir devuelve un String)
    //al final debo hacer return String
    
    public static void ejercicio4() {
        String texto="James Gosling Created Java";
        texto=texto.replaceAll(" ", "");
        System.out.println(texto);
    }
    
    public static void ejercicio4b() {
        String texto="James Gosling Created Java";
        String texto2="";
        for (int x = 0; x < texto.length(); x++) {
            //Recorro el String
            if (texto.charAt(x)!=' ')
                texto2=texto2+texto.charAt(x);
        }
        System.out.println(texto2);
    }
    
    public static void ejercicio5() {
        String texto= "Java Java Java";
        int cuentaVocal=0;
        int cuentaConsonante=0;
        for (int x = 0; x < texto.length(); x++) {
            //tenemos 3 categorías, que sean espacios blancos, vocales o consonantes
            switch (texto.charAt(x)) {
                case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U':
                    cuentaVocal++;
                    break;
                case ' ':
                    //En este caso no hago nada
                    break;
                default:
                    //para las consonantes
                    cuentaConsonante++;
                    break;
            }
        }
        System.out.println(texto+" tiene " + cuentaConsonante + " consonantes.");
        System.out.println(texto+" tiene " + cuentaVocal + " consonantes.");
    }
    
    public static void ejercicio6(){
        String inicial="www.javadesde0.com";
        //RECUERDA: EL INDICE FINAL ES EL NUMERO - 1
        String subCadena1=inicial.substring(0, 8);
        String subCadena2=inicial.substring(8);
        System.out.println("La subcadena 1 es: " +subCadena1);
        System.out.println("La subcadena 2 es: " + subCadena2);
        //Podemos hacer cadenaUnida=subCadena1 + subCadena2;
        String cadenaUnida=subCadena1.concat(subCadena2);
        System.out.println("La cadena unida de nuevo es: " + cadenaUnida);
    }
    
    public static void ejercicio7(){
        String s1="Javeros";
        String s1Mayus=s1.toUpperCase();
        String s1Minus=s1.toLowerCase();
        System.out.println("Normal: " + s1);
        System.out.println("Mayusculas: " + s1Mayus);
        System.out.println("Minusculas: " + s1Minus);
    }
    
    public static boolean ejercicio8(){
        String s1="Java";
        String s2="JavaScript";
        /*OPCION 1:
        boolean sonIguales;
        if(s1.equals(s2))
            sonIguales=true;
        else
            sonIguales=false;
        return sonIguales;*/
        return s1.equals(s2);
        /*OPCION 3:
        if (s1.equals(s2))
            return true;
        else
            return false;*/
    }
    
    public static void ejercicio9(){
        String cadena="Jeve jeve jeve";
        int cuentaE=0;
        char e=101;
        char a=97;
        String remplazamiento="";
        for (int x = 0; x < cadena.length(); x++) {
            switch (cadena.charAt(x)){
                case 'e':
                    cuentaE++;
                    break;
                default:
                    break;
            }
        }
        for (int x = 0; x < cadena.length(); x++) {
            remplazamiento = cadena.replace(e, a);
        }
        System.out.println("Cadena original: "+ cadena);
        System.out.println("Cadena sustituta: " + remplazamiento);
    }
    
    public static void ejercicio6Ampliado(){
        Scanner datos=new Scanner (System.in);
        int numCadenas = 0;
        String inicial="www.javadesde0.com";
        do{
            if (numCadenas <2){
                System.out.println("Cuantas cadenas quieres hacer? minimo 2");
                numCadenas=datos.nextInt();
            }
            
        }while(numCadenas<2);
    }
    
    public static void ejercicio8Ampliado(){
        Scanner datos=new Scanner(System.in);
        System.out.println("Introduzca la primera cadena");
        String cadena1=datos.next();
        System.out.println("Introduzca la segunda cadena");
        String cadena2=datos.next();
        boolean sonIguales;
        if(cadena1.equals(cadena2))
            sonIguales=true;
        else
            sonIguales=false;
        System.out.println("Son las cadenas iguales? " + sonIguales);
    }
    
    public static void ejercicio10(){
        String s1="ABCD";
        for (int x = 0; x < s1.length(); x++) {
            System.out.println("La letra " + s1.charAt(x) + " es " + (int)s1.charAt(x));
        }
    }
    
    public static void ejercicio10Ampliado(){
        Scanner datos=new Scanner (System.in);
        System.out.println("Introduzca una cadena");
        String cadena=datos.next();
        int [] arrayEnteros=new int [cadena.length()];
        for (int x = 0; x < cadena.length(); x++) {
            System.out.println("La letra " + cadena.charAt(x) + " es " + (int)cadena.charAt(x));
        }
        
    }
    
    public static void main(String[] args) {
        //Para que la función se ejecute tengo que llamarla
        //desde el main()
        //System.out.println(texto) no puede llamar a la función que solo 
        //esta declarada en otra funcion
        
        //Como hemos dicho que ejercicio3b() devuelve un String
        //puedo usar la llamada de la funcion en cualquier sitio
        //donde pudiese usar un String
        
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio3b();
        //ejercicio4();
        //ejercicio4b();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        /*if(ejercicio8())
            System.out.println("Son iguales");
        else
            System.out.println("Son distintos");*/
        //ejercicio9();
        //SIN HACER ejercicio6Ampliado();
        //ejercicio8Ampliado();
        //ejercicio10();
        ejercicio10Ampliado();
        
    }
    
}
