package semana_05;

public class ArregloEdades {
    //Atributo privado
    private int[] edad = {27, 22, 13, 12, 25, 11, 29, 70, 15, 21};
    //Constructor
    public ArregloEdades(){
    }
    //Operaciones públicas básicas
    public int tamaño(){
        return edad.length;
    }
    public int obtener(int i){
        return edad[i];
    }
    //Operaciones complementarias
    public double promedio(){
        int suma=0;
        for(int i=0;i<tamaño();i++)
            suma+= edad[i];
        return suma*1.0/tamaño();
    }
    public int edadMayor(){
        int mayor = edad[0];
        for(int i=1;i<tamaño();i++)
            if(mayor<edad[i])
                mayor = edad[i];
        return mayor;
    }
    public int cantMayoresEdad(){
        int c=0;
        for(int i=0;i<tamaño();i++)
            if(edad[i] >= 18)
                c++;
        return c;
    }
    public int posPrimeraEdadAdolescente(){
        for(int i=0;i<tamaño();i++)
            if(edad[i] >=12 && edad[i] <=20)
                return i;
        return -1;
    }
    public int posUltimaEdadAdolescente(){
        for(int i=tamaño() -1;i>=0;i--)
            if(edad[i]>=12 && edad[i]<=20)
                return i;
        return -1;
    }
}


