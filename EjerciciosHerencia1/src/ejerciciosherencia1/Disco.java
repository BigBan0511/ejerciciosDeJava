package ejerciciosherencia1;

public class Disco extends Multimedia{
    protected String genero;

    public Disco(String genero, String titulo, String autor, String formato, int duracion) {
        super(titulo, autor, formato, duracion);
        this.genero = genero;
    }

    @Override
    public String toString() {
        String info = super.toString();
        info = info + "\nSu genero es " + this.genero;
        return info;
    }
}
