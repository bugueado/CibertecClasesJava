package semana_03;

public class Factura {
    //Atributos privados
    private String ruc, empresa;
    private int unidades;
    private double precio;
    //Atributos privado de clase
    private static int contador;
    private static double acumulador;
    //Constante publica de clase
    public static final String ENTIDAD;
    //bloque de inicializacion
    static{
        ENTIDAD = "Sunat";
        contador = 0;
        acumulador = 0.0;
    }
    //Constructores
    //Primero
    public Factura(String ruc, String empresa, int unidades, double precio){
        this.ruc = ruc;
        this.empresa = empresa;
        this.unidades = unidades;
        this.precio = precio;
        contador++;
        acumulador += importeFacturado();
    }
    //Segundo
    public Factura(String ruc, String empresa){
        this(ruc, empresa, 10, 50.0);
    }
    //Tercero
    public Factura(){
        this("111111111111", "MN-Global SRL");
    }
    //Metodos de acceso publico: set/get
    //SET
    public void setRuc(String ruc){
        this.ruc = ruc;
    }
    public void setEmpresa(String empresa){
        this.empresa = empresa;
    }
    public void setUnidades(int unidades){
        this.unidades = unidades;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    //GET
    public String getRuc(){
        return ruc;
    }
    public String getEmpresa(){
        return empresa;
    }
    public int getUnidades(){
        return unidades;
    }
    public double getPrecio(){
        return precio;
    }

    //Metodos de clase set/get
    public static void setContador(int contador){
        Factura.contador = contador;
    }
    public static void setAcumulador(double acumulador){
        Factura.acumulador = acumulador;
    }
    public static int getContador(){
        return contador;
    }
    public static double getAcumulador(){
        return acumulador;
    }

    //Operaciones publicas
    public double importeFacturado(){
        return unidades * precio;
    }
}
