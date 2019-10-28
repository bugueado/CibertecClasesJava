package semana_01;

public class Equipo {
    public int codigo;
    public String marca, color;
    public double precioDolares;

    //metodos
    public double precioSoles(){
        return precioDolares * 3.25;
    }

    public double precioEuros(){
        return precioDolares * 1.20;
    }
}
