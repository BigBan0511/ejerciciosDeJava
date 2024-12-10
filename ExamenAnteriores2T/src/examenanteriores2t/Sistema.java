package examenanteriores2t;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    private Scanner datos = new Scanner(System.in);
    private double ganancia;
    private ArrayList<Destinos> misDestinos;
    private boolean usuarioRegistrado;

    public Sistema() {
        this.usuarioRegistrado = false;
        this.ganancia = 0;
    }
    
    public void agregarDestinos(){
        boolean validoNumDes = false;
        int numDestinos = 0;
        do{
            try{
                System.out.println("Introduzca el numero de destinos que desea");
                this.datos = new Scanner(System.in);
                numDestinos = this.datos.nextInt();
                if(numDestinos == 0){
                    throw new Exception();
                }
                this.misDestinos = new ArrayList<>(numDestinos);
                validoNumDes = true;
            }catch(Exception e){
                System.out.println("Has introducido un valor no valido");
            }
        }while(validoNumDes == false);
        int elecDestino;
        boolean valido = false;
        do{
            try {
                for (int x = 0; x < numDestinos; x++) {
                    System.out.println("Es un destino de cercanias o de larga distancia");
                    System.out.println("Pulse 1 para cercanias, pulse 2 para larga distancia");
                    this.datos = new Scanner(System.in);
                    elecDestino = datos.nextInt();
                    if(elecDestino != 1 && elecDestino != 2){
                        throw new Exception();
                    }
                    if(elecDestino == 1){
                        this.misDestinos.add(new DestinoCercanias());
                    }else if(elecDestino == 2){
                        this.misDestinos.add(new DestinoLargaDistancia());
                    }
                }
                valido = true;
            } catch (Exception e) {
                System.out.println("Introduce una de las dos opciones");
            }
        }while(valido == false);
    }
    
    public void menu(){
        Usuario u1 = null;
        int eleccion;
        do {            
            System.out.println("Que operacion desea realizar");
            System.out.println("1-Buscar destino");
            System.out.println("2-Reservar destino");
            System.out.println("3-Ganancias");
            System.out.println("4-Mostrar destinos");
            System.out.println("5-Registrar usuario");
            System.out.println("6-Login de usuario");
            System.out.println("7-Logout");
            System.out.println("8-Salir");
            eleccion = this.datos.nextInt();
            switch (eleccion) {
                case 1:
                    System.out.println("1-Buscar destino");
                    System.out.println("");
                    buscarDestino();
                    break;
                case 2:
                    System.out.println("2-Reservar destino");
                    System.out.println("");
                    reservarDestino();
                    break;
                case 3:
                    System.out.println("3-Ganancias");
                    System.out.println("");
                    ganancias();
                    break;
                case 4:
                    System.out.println("4-Mostrar destinos");
                    System.out.println("");
                    mostrarDestinos();
                    break;
                case 5:
                    System.out.println("5-Registrar usuario");
                    System.out.println("");
                    u1 = registrarUsuario();
                    break;
                case 6:
                    System.out.println("6-Login de usuario");
                    System.out.println("");
                    loginUsuario(u1);
                    break;
                case 7:
                    System.out.println("7-Logout");
                    System.out.println("");
                    logOut(u1);
                    break;
                case 8:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción inválida, por favor ingrese un número del 1 al 8.");
            }
        } while (eleccion != 8 && eleccion <0 && eleccion > 8);
        
    }
    
    public void buscarDestino(){
        String nombre = "";
        do {            
            try{
                System.out.println("Introduzca el nombre del destino");
                this.datos = new Scanner(System.in);
                nombre = datos.nextLine();
                if(nombre.equals(""))
                    throw new Exception();
            }catch(Exception e){
                System.out.println("No has introducido un nombre de destino");
            }
        } while (nombre.equals(""));
        for (Destinos actual : this.misDestinos) {
            if(actual.getNombreDestino().equalsIgnoreCase(nombre)){
                if(actual instanceof DestinoCercanias){
                    System.out.println("El destino a " + ((DestinoCercanias) actual).nombreDestino + " es un tren de cercanias");
                    System.out.println("Quedan " + ((DestinoCercanias) actual).numBilletes + " billetes");
                }else if(actual instanceof DestinoLargaDistancia){
                    System.out.println("El destino a " + ((DestinoLargaDistancia) actual).nombreDestino + " es un tren de larga distancia");
                    System.out.println("Quedan " + ((DestinoLargaDistancia) actual).numBilletes + " billetes");
                }
            }else{
                System.out.println("No se ha encontrado el destino buscado");
            }
        }
    }
    
    public void reservarDestino(){
        String nombre = "";
        do {            
            try{
                System.out.println("Introduzca el nombre del destino a reservar");
                this.datos = new Scanner(System.in);
                nombre = datos.nextLine();
                if(nombre.equals(""))
                    throw new Exception();
            }catch(Exception e){
                System.out.println("No has introducido un nombre de destino");
            }
        } while (nombre.equals(""));
        for (Destinos actual : misDestinos) {
            if(actual.getNombreDestino().equalsIgnoreCase(nombre)){
                pedirPlazas(nombre);
            }else{
                System.out.println("No se ha encontrado el destino buscado");
            }
        }
    }
    
    public void pedirPlazas(String nombre){
        int plazas;
        for (Destinos actual : misDestinos) {
            if(actual instanceof DestinoCercanias){
                try {
                    System.out.println("Cuantas plazas desea reservar?");
                    plazas = datos.nextInt();
                    if(plazas > ((DestinoCercanias) actual).numBilletes){
                        System.out.println("Lo siento, no quedan suficientes plazas");
                    }else if(plazas <= ((DestinoCercanias) actual).numBilletes && plazas > 0){
                        System.out.println("Se ha hecho la reserva de " + plazas + " plazas");
                        if(this.usuarioRegistrado){
                            ganancia = ganancia + (((DestinoCercanias) actual).precioBillete * 0.1);
                            this.ganancia = this.ganancia + (ganancia*plazas);
                        }else{
                            ganancia = ganancia + ((DestinoCercanias) actual).precioBillete;
                            this.ganancia = this.ganancia + (ganancia*plazas);
                        }
                        System.out.println("El coste de las plazas reservadas es de un total de " + this.ganancia);
                    }else if(plazas == 0){
                        System.out.println("Se ha cancelado la reserva al elegir 0 plazas");
                    }else if(plazas <0){
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println("El numero de plazas introducido es erroneo");
                }
            }else if(actual instanceof DestinoLargaDistancia){
                try {
                    System.out.println("Cuantas plazas desea reservar?");
                    plazas = datos.nextInt();
                    if(plazas > ((DestinoLargaDistancia) actual).numBilletes){
                        System.out.println("Lo siento, no quedan suficientes plazas");
                    }else if(plazas <= ((DestinoLargaDistancia) actual).numBilletes){
                        System.out.println("Se ha hecho la reserva de " + plazas + " plazas");
                        if(this.usuarioRegistrado){
                            ganancia = ganancia + (((DestinoLargaDistancia) actual).precioBillete * 0.1);
                            this.ganancia = this.ganancia + (ganancia*plazas);
                        }else{
                            ganancia = ganancia + ((DestinoLargaDistancia) actual).precioBillete;
                            this.ganancia = this.ganancia + (ganancia*plazas);
                        }
                        System.out.println("El coste de las plazas reservadas es de un total de " + this.ganancia);
                    }else if(plazas == 0){
                        System.out.println("Se ha cancelado la reserva al elegir 0 plazas");
                    }else if(plazas <0){
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println("El numero de plazas introducido es erroneo");
                }
            }
        }
    }
    
    public void ganancias(){
        System.out.println("El total recaudado es de " + this.ganancia + " euros");
        
    }
    
    public void mostrarDestinos(){
        ArrayList<DestinoCercanias> dc1 = new ArrayList<>(this.misDestinos.size());
        ArrayList<DestinoLargaDistancia> dLarga = new ArrayList<>(this.misDestinos.size());;
        for (Destinos actual : this.misDestinos) {
            if(actual instanceof DestinoCercanias){
                dc1.add((DestinoCercanias)actual);
            }else if(actual instanceof DestinoLargaDistancia){
                dLarga.add((DestinoLargaDistancia)actual);
            }
        }
        System.out.println("Destinos Cercanias: ");
        for (DestinoCercanias actual : dc1) {
            System.out.println("");
            actual.mostrarDestino();
        }
        System.out.println("Destinos Largas Distancias");
        for (DestinoLargaDistancia actual : dLarga) {
            System.out.println("");
            actual.mostrarDestino();
        }
    }
    
    public Usuario registrarUsuario(){
        Usuario u1 = new Usuario();
        this.usuarioRegistrado = true;
        return u1;
    }
    
    public void loginUsuario(Usuario u1){
        if(this.usuarioRegistrado){
            System.out.println("Introduzca su nombre: ");
            String nombre = datos.nextLine();
            System.out.println("Introduzca la contrasena: ");
            String contrasena = datos.nextLine();
            if(nombre.equalsIgnoreCase(contrasena)){
                
            }
        }else{
            System.out.println("No se ha registrado ningun usuario aun");
        }
    }
    
    public void logOut(Usuario u1){
        System.out.println("Se ha cerrado sesion");
        u1.logOut();
    }
    
}
