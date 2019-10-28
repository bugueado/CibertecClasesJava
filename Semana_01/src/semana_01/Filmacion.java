package semana_01;

public class Filmacion {
    public int codigo, duracionMinutos;
    public String titulo;
    public double precioSoles;

    //Metodos
    public double precioDolares(){
        return precioSoles * 3.25;
    }
}
