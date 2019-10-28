package semana_01;

public class Expositor {
    public int codigo, horasTrabajadas;
    public String nombre;
    public double tarifaHora;

    //Metodos
    public double sueldoBruto(){
        return horasTrabajadas * tarifaHora;
    }

    public double afp(){
        return sueldoBruto() * 0.1;
    }

    public double eps(){
        return sueldoBruto() * 0.05;
    }

    public double sueldoNeto(){
        return sueldoBruto() - afp() - eps();
    }
}
