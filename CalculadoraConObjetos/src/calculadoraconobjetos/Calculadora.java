package calculadoraconobjetos;

import java.util.Scanner;

public class Calculadora {
    private Scanner datos= new Scanner(System.in);
    private double operador1;
    private double operador2;
    private double resultado;
    private char decisionActual;
    private String[] operaciones;
    
    public Calculadora(){
        this.operador1=0;
        this.operador2=0;
        this.decisionActual=' ';
        this.operaciones=new String[10];
    }
    
    public void usarCalculadora(){
        int eleccion;
        char repetirSalir = ' ';
        do {
            System.out.println("Que desea realizar?");
            System.out.println("1.Operacion");
            System.out.println("2.Salir");
            System.out.println("3.Ajustes");
            eleccion=datos.nextInt();
            
            if(eleccion<=0 || eleccion>3){
                System.out.println("Debe de elegir una de las opciones dadas");
            }
        } while (eleccion<=0 || eleccion>3);
        if(eleccion == 2){
            System.out.println("Gracias por usar la calculadora");
        }else if(eleccion == 3){
            int eleccionAjustes;
            do {                
                System.out.println("Ajustes:");
                System.out.println("1.Cambiar brillo");
                System.out.println("2.Cambiar modo de la calculadora");
                System.out.println("3.Cambiar el idioma de la calculadora");
                eleccionAjustes = datos.nextInt();
            } while (eleccionAjustes<=0 || eleccionAjustes>3);
            switch (eleccionAjustes) {
                case 1:
                    int intensidadBrillo;
                    do {
                        System.out.println("Elige la intensidad del brillo");
                        intensidadBrillo=datos.nextInt();
                    } while (intensidadBrillo<=0 || intensidadBrillo>100);
                    System.out.println("La intensidad del brillo esta al " + intensidadBrillo + "%");
                    break;
                case 2:
                    int eleccionModo;
                    do {                        
                        System.out.println("1.Modo Estandar");
                        System.out.println("2.Modo Cientifica");
                        eleccionModo = datos.nextInt();
                    } while (eleccionModo<1 || eleccionModo>2);
                    System.out.println("El modo de la calculadora es el: " + eleccionModo);
                    break;
                case 3:
                    int eleccionIdioma;
                    do {                        
                        System.out.println("Idioma:");
                        System.out.println("1.Espanol:");
                        System.out.println("2.Espanol:");
                        eleccionIdioma = datos.nextInt();
                    } while (eleccionIdioma<1 || eleccionIdioma>2);
                    System.out.println("El idioma de la calculadora es el: " + eleccionIdioma);
                    break;
                default:
                    break;
            }
        }if(eleccion==1){
            do{ 
                char operacionElegida;
                mostrarMenu();
                operacionElegida = decisionActual;
                if(operacionElegida=='a' || operacionElegida=='A'){
                        suma();
                }
                if(operacionElegida=='b' || operacionElegida=='B'){
                    resta();
                }
                if(operacionElegida=='c' || operacionElegida=='C'){
                    multiplicacion();
                }
                if(operacionElegida=='d' || operacionElegida=='D'){
                    division();
                }
                if(operacionElegida=='e' || operacionElegida=='E'){
                    consultarOperaciones();
                }
                if(operacionElegida=='f' || operacionElegida=='F'){
                    usarCalculadora();
                }
                System.out.println("Desea realizar otra operacion? S/N");
                repetirSalir = datos.next().charAt(0);
            }while(repetirSalir == 's' || repetirSalir == 'S');
        }
    }
    
    public char mostrarMenu(){
        boolean salida=false;
        do {            
            System.out.println("Operaciones:");
            System.out.println("A.Suma");
            System.out.println("B.Resta");
            System.out.println("C.Multiplicacion");
            System.out.println("D.Division");
            System.out.println("E.Consultar Operaciones");
            System.out.println("F.Salir");
            this.decisionActual = datos.next().charAt(0);
            if(this.decisionActual=='a' || this.decisionActual=='A' 
                    || this.decisionActual=='b' || this.decisionActual=='B' 
                    || this.decisionActual=='c' || this.decisionActual=='C' 
                    || this.decisionActual=='d' || this.decisionActual=='D' 
                    || this.decisionActual=='e' || this.decisionActual=='E' 
                    || this.decisionActual=='f' || this.decisionActual=='F'){
                salida=true;
            }else{
                System.out.println("ERROR: Elige una opcion valida");
            }
        } while (salida==false);
        return decisionActual;
    }
    
    public double suma(double operador1, double operador2){
        double resultado = operador1 + operador2;
        registrarOperacion();
        System.out.println("= " + +resultado);
        return resultado;
    }
    
    public void suma(){
        System.out.println("Introduce el primer operador");
        this.operador1 = datos.nextDouble();
        System.out.println("Introduce el segundo operador");
        this.operador2 = datos.nextDouble();
        this.resultado = operador1 + operador2;
        System.out.println("= " + +this.resultado);
        registrarOperacion();
    }
    
    public double resta(double operador1, double operador2){
        double resultado = operador1 - operador2;
        registrarOperacion();
        System.out.println("= " + +resultado);
        return resultado;
    }
    
    public void resta(){
        System.out.println("Introduce el primer operador");
        this.operador1 = datos.nextDouble();
        System.out.println("Introduce el segundo operador");
        this.operador2 = datos.nextDouble();
        this.resultado = operador1 - operador2;
        System.out.println("= " + +this.resultado);
        registrarOperacion();
    }
    
    public double multiplicacion(double operador1, double operador2){
        double resultado = operador1 * operador2;
        registrarOperacion();
        System.out.println("= " + +resultado);
        return resultado;
    }
    
    public void multiplicacion(){
        System.out.println("Introduce el primer operador");
        this.operador1 = datos.nextDouble();
        System.out.println("Introduce el segundo operador");
        this.operador2 = datos.nextDouble();
        this.resultado = operador1 * operador2;
        System.out.println("= " + +this.resultado);
        registrarOperacion();
    }
    
    public double division(double operador1, double operador2){
        if(operador2==0){
            System.out.println("SYNTAX ERROR");
        }
        double resultado = operador1/operador2;
        registrarOperacion();
        System.out.println("= " + +resultado);
        return resultado;
    }
    
    public void division(){
        do {            
            System.out.println("Introduce el primer operador");
            this.operador1 = datos.nextDouble();
            System.out.println("Introduce el segundo operador");
            this.operador2 = datos.nextDouble();
        } while (this.operador2==0);
        this.resultado = this.operador1/this.operador2;
        System.out.println("= " + +this.resultado);
        registrarOperacion();
    }
    
    public void registrarOperacion(){
        boolean insertado=false;
        int x=0;
        do{
            if(this.operaciones[x]==null){
                switch (this.decisionActual) {
                    case 'a','A':
                        this.operaciones[x]="- Se han sumado el " + this.operador1 + " y el " + operador2 + " con resultado " + this.resultado;
                        insertado=true;
                        break;
                    case 'b','B':
                        this.operaciones[x]="- Se han restado el " + this.operador1 + " y el " + operador2 + " con resultado " + this.resultado;
                        insertado=true;
                        break;
                    case 'c','C':
                        this.operaciones[x]="- Se han multiplicado el " + this.operador1 + " y el " + operador2 + " con resultado " + this.resultado;
                        insertado=true;
                        break;
                    case 'd','D':
                        this.operaciones[x]="- Se han dividido el " + this.operador1 + " y el " + operador2 + " con resultado " + this.resultado;
                        insertado=true;
                        break;
                }
            }x++;
        }while(insertado==false && x<this.operaciones.length);
        if(insertado==false){
            ampliarArray();
        }
    }
    
    public void consultarOperaciones(){
        registrarOperacion();
        System.out.println("Operaciones:");
        for (int x = 0; x < operaciones.length; x++) {
            if(operaciones[x]!=null)
            System.out.println(operaciones[x]);
        }
    }
    
    public void ampliarArray(){
        String [] operacionesAmpliado = new String[this.operaciones.length*2];
        for (int x = 0; x < operaciones.length; x++) {
            operacionesAmpliado[x] = this.operaciones[x];
        }
        this.operaciones = operacionesAmpliado;
    }

    public double getOperador1() {
        return operador1;
    }

    public void setOperador1(double operador1) {
        this.operador1 = operador1;
    }

    public double getOperador2() {
        return operador2;
    }

    public void setOperador2(double operador2) {
        this.operador2 = operador2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public char getDecisionActual() {
        return decisionActual;
    }

    public void setDecisionActual(char decisionActual) {
        this.decisionActual = decisionActual;
    }

    public String[] getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(String[] operaciones) {
        this.operaciones = operaciones;
    }
}
