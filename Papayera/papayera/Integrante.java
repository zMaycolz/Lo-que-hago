package papayera;

public class Integrante {

    private String nombre;

    private int aniosExperiencia;

    protected static final int TARIFA_BASE = 80000;

    protected int toquesDelMes = 0;

    public Integrante(String nombre, int aniosExperiencia) {
        this.nombre = nombre;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public int pagoPorToque() {
        return TARIFA_BASE;
    }

    public String categoria() {
        return "Integrante";
    }

    public String saludo() {
        return "Buenas noches, soy " + nombre + ".";
    }

    public void sumarToque() {
        toquesDelMes ++;
    }


}

