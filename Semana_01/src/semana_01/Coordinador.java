package semana_01;

public class Coordinador {
    public int codigo, categoria, nroCelular;
    public String nombre;

    //Metodos
    public int sueldo(){
        if (categoria == 0){
            return 8500;
        }else if(categoria == 1){
            return 6850;
        }else{
            return 5500;
        }
    }
}
