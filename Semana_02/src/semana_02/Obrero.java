package semana_02;

public class Obrero {
    private int codigo, horasTrabajadas;
    private String nombre;
    private double tarifaHora;

    //constructor
    public Obrero(int cod, String nom, int hor, double tar){
        codigo = cod;
        nombre = nom;
        horasTrabajadas = hor;
        tarifaHora = tar;
    }

    //set
    public void setCodigo(int cod){
        codigo = cod;
    }

    public void setNombre(String nom){
        nombre = nom;
    }

    public void setHorasTrabajadas(int hor){
        horasTrabajadas = hor;
    }

    public void setTarifaHora(double tar){
        tarifaHora = tar;
    }

    //get
    public int getCodigo(){
        return codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public int getHorasTrabajadas(){
        return horasTrabajadas;
    }

    public double getTarifaHora(){
        return tarifaHora;
    }

    //Metodos
    public double sueldoBruto(){
        return horasTrabajadas * tarifaHora;
    }

    public double afp(){
        return sueldoBruto() * 0.10;
    }

    public double eps(){
        return sueldoBruto() * 0.05;
    }

    public double sueldoNeto(){
        return sueldoBruto() - afp() - eps();
    }
}
