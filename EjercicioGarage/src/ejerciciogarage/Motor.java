package ejerciciogarage;

public class Motor {
    private int litrosAceite;
    private int CV;

    public Motor(int CV) {
        this.CV = CV;
        this.litrosAceite = 0;
    }

    public int getLitrosAceite() {
        return litrosAceite;
    }

    public void setLitrosAceite() {
        this.litrosAceite += 10;
    }

    public int getCV() {
        return CV;
    }
}
