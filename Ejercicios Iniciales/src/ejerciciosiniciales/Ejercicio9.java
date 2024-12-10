package ejerciciosiniciales;
public class Ejercicio9 {

    public static void main(String[] args) {
        //FORMA 1
        int totalImpares=0;
        for(int x=1; x<20; x++){
            if(x%2!=0)
                totalImpares=totalImpares+x;
        }
        System.out.println(totalImpares);
        //FORMA 2
        System.out.println("-----------------");
        totalImpares=0;
        
        for(int x=1; x<20; x=x+2){
            totalImpares=totalImpares+x;
        }System.out.println(totalImpares);
        //FORMA 3
        System.out.println("-----------------");
        totalImpares=0;
        
        int control=1;
        while(control<20){
            totalImpares=totalImpares+control;
            control=control+2;
        }System.out.println(totalImpares);
        
        //FORMA 4
        System.out.println("-----------------");
        totalImpares=0;
        
        control=1;
        while(control<20){
            if(control%2!=0)
                totalImpares=totalImpares+control;
            control++;
        }System.out.println(totalImpares);
    }
    
    
}
