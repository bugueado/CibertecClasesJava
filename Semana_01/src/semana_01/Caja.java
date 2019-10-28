package semana_01;

public class Caja {
    public double largoCm, anchoCm, altoCm, pesoKg;

    //Metodos
    public double volumenCaja(){
        return largoCm * anchoCm * altoCm;
    }

    public double pesoVolum(){
        return volumenCaja()/5000.0;
    }

    public double pesoFacturable(){
        if(pesoKg > pesoVolum()){
            return pesoKg;
        }else{
            return pesoVolum();
        }
    }


}
