package semana_02;

public class Video {
    private int codigo;
    private String nombreVideo;
    private double precioSoles, tipoCambio;

    //Constructor
    public Video(int cod, String nomV, double preS, double tipC){
        codigo = cod;
        nombreVideo = nomV;
        precioSoles = preS;
        tipoCambio = tipC;
    }

    //set
    public void setCodigo(int cod){
        codigo = cod;
    }

    public void setNombreVideo(String nomV){
        nombreVideo = nomV;
    }

    public void setPrecioSoles(double preS){
        precioSoles = preS;
    }

    public void setTipoCambio(double tipC){
        tipoCambio = tipC;
    }

    //get
    public int getCodigo(){
        return codigo;
    }

    public String getNombreVideo(){
        return nombreVideo;
    }

    public double getPrecioSoles(){
        return precioSoles;
    }

    public double getTipoCambio(){
        return tipoCambio;
    }

    //metodos
    public double precioDolares(){
        return precioSoles * tipoCambio;
    }
}
