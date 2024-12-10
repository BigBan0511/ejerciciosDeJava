package strings;

public class Strings {

    public static void main(String[] args) {
        String saludo="Hola como estas?, yo estoy genial";
        System.out.println(saludo);
        String otroString=saludo;
        System.out.println(otroString);
        String prueba= "Esto" + "es" + "una" + "prueba";
        System.out.println(prueba);
        prueba=prueba + ". Podemos añadir mas texto";
        String s1= "Hola";
        String s2= "Adios";
        String s3= "Hola";
        //PARA COMPARAR STRINGS PONEMOS ESTO:
        if (s1.equals(s3)) {
            System.out.println("Son iguales");
        }
        else{
            System.out.println("Son distintos");
        }
        System.out.println("La cadena " +s1 + " tiene un tamaño de " + s1.length());
        //Podemos acceder a los caracteres del String como si fuese un array
        System.out.println(s1.charAt(0));
        System.out.println("El String empieza por H?: " + s1.startsWith(s1));
        //Podemos convertirlos de char a int con la funcion siguiente
        char [] arrayChar=s3.toCharArray();
        for (int x = 0; x < arrayChar.length; x++) {
            System.out.println(arrayChar[x]);
        }
        String s4="Otra cadena";
        if (s1.compareTo(s4)>0)
            System.out.println("s1>s4");
        else if (s1.compareTo(s4)<0)
            System.out.println("s1<s4");
        else
            System.out.println("Las cadenas son iguales");
    }
    
}
