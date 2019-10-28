package semana_01;

public class Numeros {
    public int numero1, numero2, numero3;

    //metodos
    public int numMayor(){
        if (numero1 > numero2 && numero1 > numero3) {
            return numero1;
        }else if(numero2 > numero3 && numero2 > numero1){
            return numero2;
        }else {
            return numero3;
        }
    }

    public int numMenor(){
        if (numero1 < numero2 && numero1 < numero3) {
            return numero1;
        }else if(numero2 < numero1 && numero2 < numero3){
            return numero2;
        }else {
            return numero3;
        }
    }

    public int numMedio(){
        if(numero1 < numero2 && numero2 < numero3){
            return numero2;
        }else if(numero2 < numero3 && numero3 < numero1){
            return numero3;
        }else if(numero2 < numero1 && numero1 < numero3){
            return numero1;
        }else{
            return 00;
        }
    }
}
