package examenanteriores2t;

import java.util.Scanner;

public class Usuario {
    private String nombre;
    private String apellido;
    private String DNI;
    private String password;

    public Usuario() {
        boolean valido = false;
        do {            
            try {
                Scanner datos = new Scanner(System.in);
                System.out.println("Introduce el nombre");
                this.nombre = datos.nextLine();
                if(this.nombre.equals("")){
                    throw new Exception();
                }
                System.out.println("Introduce el apellido");
                this.apellido = datos.nextLine();
                if(this.apellido.equals("")){
                    throw new Exception();
                }
                System.out.println("Introduce el DNI");
                this.DNI = datos.nextLine();
                if(this.DNI.equals("")){
                    throw new Exception();
                }
                valido = true;
            } catch (Exception e) {
                System.out.println("Ha introducido datos no validos");
            }
        } while (valido == false);
        for (int x = 0; x < this.password.length(); x++) {
            char[] passwordArray = this.password.toCharArray();
            char caracter = (char)(Math.random()*123);
            while(caracter < 33 || caracter >122){
                caracter = (char)(Math.random()*123);
            }
            passwordArray[x] = caracter;
            this.password = new String(passwordArray);
        }
        System.out.println("Su clave es: " + this.password);
    }
    
    public void logOut(){
        this.nombre = "";
        this.apellido = "";
        this.DNI = "";
        this.password = "xxxxxxxxxx";
    }

    public String getPassword() {
        return password;
    }
    
}
