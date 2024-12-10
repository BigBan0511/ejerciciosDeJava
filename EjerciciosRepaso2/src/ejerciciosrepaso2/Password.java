package ejerciciosrepaso2;
public class Password {
    private int longitud;
    private String contraseña;
    
    public Password(){
        this.longitud=8;
        this.contraseña="";
        generarPassword();
    }
    
    public Password(int longitud){
        this.longitud=longitud;
        this.contraseña="";
        generarPassword();
    }
    
    public void generarPassword(){
        for(int x=0; x<this.longitud; x++){
            int caracter=(int)(Math.random() * ((126 - 33) + 1)) + 33;
            this.contraseña=this.contraseña+(char)caracter;
        }
    }
    
    public boolean esFuerte(){
        int cantidadMayu=0;
        int cantiMin=0;
        int cantidadNum=0;
        for(int x=0; x<this.contraseña.length();x++){
            //Recorro las password en busca de las condiciones, no necesitamos
            //castear a entero para comparar
            if(this.contraseña.charAt(x)>=65 && this.contraseña.charAt(x)<=90)
                cantidadMayu++;
            else if(this.contraseña.charAt(x)>=97 && this.contraseña.charAt(x)<=122)
                cantiMin++;
            else if (this.contraseña.charAt(x)>=48 && this.contraseña.charAt(x)<=57)
                cantidadNum++;
        }
        if(cantidadMayu>2 && cantiMin>1 && cantidadNum>5)
                return true;
            else
                return false;
    }
    
    
    public String getPass(){
        return this.contraseña;
    }
}
