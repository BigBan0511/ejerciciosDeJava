package ejerciciosarraylist2;

public class Persona {
    private int edad;

    public Persona() {
        int tam;
        int[] cola;
        do {            
            tam = (int)(Math.random()*50+1);
            cola = new int[tam];
        } while (tam<5 || tam>50);
        for (int x = 0; x < cola.length; x++) {
            do {                
                this.edad = (int)(Math.random()*60+1);
            } while (this.edad<5 || this.edad>60);
            cola[x] = this.edad;
        }
        cantidadRecaudada(cola);
        mostrarCola(cola);
    }
    
    public void cantidadRecaudada(int[] cola) {
        double totalRecaudado = 0;
        for (int x = 0; x < cola.length; x++) {
            if (cola[x] >= 5 && cola[x] <= 10) {
                totalRecaudado += 1;
            } else if (cola[x] >= 11 && cola[x] <= 17) {
                totalRecaudado += 2.5;
            } else if (cola[x] >= 18) {
                totalRecaudado += 3.5;
            }
        }
        System.out.println("El total recaudado es de " + totalRecaudado);
    }
    
    public void mostrarCola(int[] cola) {
        int contadorPrimerCaso = 0;
        int contadorSegundoCaso = 0;
        int contadorTercerCaso = 0;
        for (int x = 0; x < cola.length; x++) {
            if (cola[x] >= 5 && cola[x] <= 10) {
                contadorPrimerCaso++;
            } else if (cola[x] >= 11 && cola[x] <= 17) {
                contadorSegundoCaso++;
            } else if (cola[x] >= 18) {
                contadorTercerCaso++;
            }
        }
        System.out.println("Entre 5 y 10 anos hay " + contadorPrimerCaso +
                "\nentre 11 y 17 anos hay " + contadorSegundoCaso +
                "\ny mayores de 18 anos hay " + contadorTercerCaso);
    }

}
