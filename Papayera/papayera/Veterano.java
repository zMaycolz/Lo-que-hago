package papayera;

public class Veterano extends Titular{

    public Veterano (String nombre, int aniosExperiencia){
        super(nombre, aniosExperiencia);
    }

    public int pagoPorToque(){
        return super.pagoPorToque() + (TARIFA_BASE * 25 / 100);
    }

    public String categoria(){
        return "Veterano";
    }
}
