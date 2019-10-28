package semana_02;

public class Edificio {
    private int codigo, numeroDepartamentos, cantidadPisos;
    private double precioDepartamentos;

    //Constructor
    public Edificio(int cod, int nro, int cant, double pre){
        codigo = cod;
        numeroDepartamentos = nro;
        cantidadPisos = cant;
        precioDepartamentos = pre;
    }

    //set
    public void setCodigo(int cod){
        codigo = cod;
    }

    public void setNumeroDepartamentos(int nro){
        numeroDepartamentos = nro;
    }

    public void setCantidadPisos(int cant){
        cantidadPisos = cant;
    }

    public void setPrecioDepartamentos(double pre){
        precioDepartamentos = pre;
    }

    //get
    public int getCodigo(){
        return codigo;
    }

    public int getNumeroDepartamentos(){
        return numeroDepartamentos;
    }

    public int getCantidadPisos(){
        return cantidadPisos;
    }

    public double getPrecioDepartamentos(){
        return precioDepartamentos;
    }

    //metodos
    public double precioEdificio(){
        return numeroDepartamentos * precioDepartamentos;
    }
}
