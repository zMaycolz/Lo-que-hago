package papayera;

public class Aprendiz extends Integrante {
    public Aprendiz (String nombre, int aniosExperiencia) {
        super (nombre, aniosExperiencia);
    }

    public int pagoPorToque(){
        return TARIFA_BASE * 60 / 100;
    }

    public String categoria(){
        return "Aprendiz";
    }
}
