package semana_01;

public class Trabajador {
    //Atributos
    public int codigo, horasTrabajadas;
    public String nombre;
    public double tarifaHoraria;

    //Metodos
    public double sueldoBruto(){
        return horasTrabajadas * tarifaHoraria;
    }

    public double descuento(){
        if (sueldoBruto() < 4500){
            return sueldoBruto() * 0.12;
        }else if( sueldoBruto() < 6500 ){
            return sueldoBruto() * 0.14;
        }else{
            return sueldoBruto() * 0.16;
        }
    }

    public double sueldoNeto(){
        return sueldoBruto() - descuento();
    }

}
