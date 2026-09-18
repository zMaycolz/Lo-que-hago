package papayera;

public class Director extends Veterano{

    public  Director(String nombre, int aniosExperiencia){
        super(nombre, aniosExperiencia);
    }

    public int pagoPorToque(){
        return super.pagoPorToque() + (TARIFA_BASE * 50 / 100);
    }

    public String categoria(){
        return "Director";
    }

}
