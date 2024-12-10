package ejerciciosdestring;


public class EjerciciosStringB {

    public static void ejercicio5(){
        String s1="Java Java Java";
        int cuentaVocal=0;
        int cuentaCons=0;
        for(int x=0; x<s1.length();x++){
            //Tenemos 3 categorías, que sean espacios blancos, vocales, consonantes
            switch (s1.charAt(x)){
                case 'a','A','e','E','i','I','o','O','u','U':
                    cuentaVocal++;
                    break;
                case ' ':
                    //En este caso no hago nada
                    break;
                default:
                    //Para las consonantes
                    cuentaCons++;
                    break;
            }
        }
        System.out.println(s1+" tiene " + cuentaCons + " consonantes.");
        System.out.println(s1+" tiene " + cuentaVocal + " vocales.");
    }
    
    public static void ejercicio6(){
        String inicial="www.javadesde0.com";
        //RECUERDA: El índice final es el n-1
        String subCadena1=inicial.substring(0, 8);
        String subCadena2=inicial.substring(8);
        System.out.println("La cadena inicial es " + inicial);
        String cadenUnida=subCadena1.concat(subCadena2);
        //Podemos hacer tb cadenaUnida=subCadena1+subCadena2;
        System.out.println("La subcaedna 1 es: " + subCadena1);
        System.out.println("La subcaedna 2 es: " + subCadena2);
        System.out.println("La cadena unida de nuevo es: " + cadenUnida);   
    }
    
    public static void ejercicio7(){
        String s1="Javeros";
        String s1Mayus=s1.toUpperCase();
        String s1Minus=s1.toLowerCase();
        System.out.println(s1);
        System.out.println(s1Mayus);
        System.out.println(s1Minus);
        System.out.println(s1);
    }
    
    public static boolean ejercicio8(){
        String s1="Java";
        String s2="JavaScript";
        /*
        OPCION 1 
        boolean sonIguales;
        if(s1.equals(s2))
            sonIguales=true;
        else
            sonIguales=false;
        return sonIguales;*/
        
        /*OPCIÓN 2:
        return s1.equals(s2);
        */
        //OPCiÓN 3
        if (s1.equals(s2))
            return true;
        else
            return false;
    }
    
    public static void ejercicio10(){
        String s1="ABCD";
        for(int x=0; x<s1.length();x++){
            System.out.println("La letra " + s1.charAt(x) + 
                    " es " + (int)s1.charAt(x));
        }
    }
    
    
    public static void main(String[] args) {
        ejercicio10();
    }

}
