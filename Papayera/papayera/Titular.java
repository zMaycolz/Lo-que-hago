package papayera;

public class Titular extends Integrante {

    public Titular(String nombre, int aniosExperiencia) {
        super(nombre, aniosExperiencia);
    }

    public int pagoPorToque(){
        return super.pagoPorToque() + (TARIFA_BASE * 20 / 100);
    }

    public String categoria(){
        return "Titular";
    }

    public String saludo(){
        return "Buenas noches, soy " + getNombre() + " de la papayera";
    }

}