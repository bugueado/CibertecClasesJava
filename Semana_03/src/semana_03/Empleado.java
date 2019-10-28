package semana_03;

public class Empleado {
    private int codigo, categoria, nroCelular;
    private String nombre;

    //variable privada de clase
    private static int contador;
    private static double acumulador;

    //constante publica de clase
    public static final double DESCUENTO;

    //BLOQUE DE INICIALIZACION
    static {
        DESCUENTO = 0.15;
        contador = 0;
        acumulador = 0.0;
    }
    //Constructores
    //primero
    public Empleado(int codigo, int categoria, int nroCelular, String nombre){
        this.codigo = codigo;
        this.categoria = categoria;
        this.nroCelular = nroCelular;
        this.nombre = nombre;
        contador++;
        acumulador += sueldoNeto();
    }

    //segundo
    public Empleado(int codigo, String nombre){
        this(codigo, 2, 99999999, nombre);
    }

    //tercero
    public Empleado(){
        this(4444,"Ninguno");
    }

    //set
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public void setCategoria(int categoria){
        this.categoria = categoria;
    }

    public void setNroCelular(int nroCelular){
        this.nroCelular = nroCelular;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //get
    public int getCodigo(){
        return codigo;
    }

    public int getCategoria(){
        return categoria;
    }

    public int getNroCelular(){
        return nroCelular;
    }

    public String getNombre(){
        return nombre;
    }

    //Metodos de clase set/get
    public static void setContador(int contador){
        Empleado.contador = contador;
    }

    public static void setAcumulador(double acumulador){
        Empleado.acumulador = acumulador;
    }

    public static int getContador(){
        return contador;
    }

    public static double getAcumulador(){
        return acumulador;
    }

    //metodos
    public double sueldoBruto(){
        if (categoria == 0){
            return 7200.00;
        }else if(categoria == 1){
            return 6300.00;
        }else{
            return 5100;
        }
    }

    public double descuento(){
        return  sueldoBruto() * DESCUENTO;
    }

    public double sueldoNeto(){
        return sueldoBruto() - descuento();
    }

}
