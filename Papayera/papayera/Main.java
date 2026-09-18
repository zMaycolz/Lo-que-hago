package papayera;

public class Main {
    public static void main(String[] args){
        Aprendiz marcela = new Aprendiz("Marcela Ortiz", 1);
        Integrante yolanda = new Integrante("Yolanda Peña", 8);
        Titular alvaro = new Titular("Alvaro Sanabria", 6);
        Veterano wilson = new Veterano("Wilson Cadena", 22);
        Director rafael = new Director("Rafael Sarmiento", 30);

        Integrante[] banda = {marcela, yolanda, alvaro, wilson, rafael };

        int total = 0;

        for (Integrante i : banda) {
            System.out.println(i.getNombre() + " | " + i.categoria() + " | " + i.pagoPorToque());
            total = total + i.pagoPorToque();

        }

        System.out.println("Total de la noche: " + total + ".");

    }
}
