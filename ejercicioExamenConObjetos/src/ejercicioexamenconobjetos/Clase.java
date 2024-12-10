package ejercicioexamenconobjetos;

public class Clase {
    private Alumno [] misAlumnos;
    private double mediaClase;

    public Clase(Alumno[] misAlumnos) {
        this.misAlumnos = misAlumnos;
        this.mediaClase = 0;
    }
    
    public void calcularMedia(){
        for (int x = 0; x < misAlumnos.length; x++) {
            if(misAlumnos[x].getExamenesRealizados()==this.misAlumnos[x].getMisExamenes().length){
                //significa que el alumno x ha hecho todos los examenes y tiene su media calculada
                this.mediaClase = this.mediaClase + this.misAlumnos[x].getNotaMedia();
            }else{
                this.mediaClase = this.mediaClase + 1;
            }
        }
        this.mediaClase = this.mediaClase/this.misAlumnos.length;
    }
}
