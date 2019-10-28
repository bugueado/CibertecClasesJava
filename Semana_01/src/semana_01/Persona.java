package semana_01;

public class Persona {
    public String nombre, apellido;
    public int edad;
    public double estatura, peso;

    //metodos
    public String estado(){
        if (edad > 18){
            return "Mayor de edad";
        }else {
            return "Menor de edad";
        }
    }

    public double masaCorporal(){
        return peso/(estatura * estatura);
    }
}
