package semana_02;

public class Computadora {
    private int codigo;
    private String marca, color;
    private double precioDolares;

    //Constructor
    public Computadora(int cod, String mar, String col, double preD){
        codigo = cod;
        marca = mar;
        color = col;
        precioDolares = preD;
    }

    //Set
    public void setCodigo(int cod){
        codigo = cod;
    }

    public void setMarca(String mar){
        marca = mar;
    }

    public void setColor(String col){
        color = col;
    }

    public void setPrecioDolares(double pre){
        precioDolares = pre;
    }

    //Get

    public int getCodigo(){
        return codigo;
    }

    public String getMarca(){
        return marca;
    }

    public String getColor(){
        return color;
    }

    public double getPrecioDolares(){
        return precioDolares;
    }

    //Metodos
    public double precioSoles(){
        return precioDolares * 3.25;
    }

    public double precioEuros(){
        return precioDolares / 1.20;
    }
}
