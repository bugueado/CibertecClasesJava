package semana_02;

public class Celular {
    private int numero, segConsumidos;
    private String usuario;
    private double precioSegundo;

    //Constructor
    public Celular(int num, String usu, int seg, double pre){
        numero = num;
        usuario = usu;
        segConsumidos = seg;
        precioSegundo = pre;
    }

    //Metodos de acceso publico get y set
    public void setNumero(int num){
        numero = num;
    }

    public void setUsuario(String usu){
        usuario = usu;
    }

    public void setSegConsumidos(int seg){
        segConsumidos = seg;
    }

    public void setPrecioSegundo(double pre){
        precioSegundo = pre;
    }

    //get

    public int getNumero(){
        return numero;
    }

    public String getUsuario(){
        return usuario;
    }

    public int getSegConsumidos(){
        return segConsumidos;
    }

    public double getPrecioSegundo(){
        return precioSegundo;
    }

    //metodos publicos
    public double costoConsumo(){
        return segConsumidos * precioSegundo;
    }

    public double igv(){
        return costoConsumo() * 0.18;
    }

    public double totalPagar(){
        return costoConsumo() + igv();
    }
}
