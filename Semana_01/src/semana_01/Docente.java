package semana_01;

public class Docente {
    public int codigo, horasTrabajadas;
    public String nombre;
    public double tarifaHora;

    //metodo
    public double sueldo(){
        return horasTrabajadas * tarifaHora;
    }
}
