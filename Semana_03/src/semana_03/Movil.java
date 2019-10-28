package semana_03;

public class Movil {
    private int numeroMovil, segundosConsumidos;
    private String nombreCliente;
    private double precioSegundo;

    //variables privadas
    private static int contador;
    private static double acumulador;

    //constante publica de clase
    public static final double IGV;

    //bloque de inicializacion
    static {
        IGV = 0.18;
        contador = 0;
        acumulador = 0.0;
    }

    //constructores
    //primero
    public Movil(int numeroMovil, String nombreCliente, int segundosConsumidos, double precioSegundo){
        this.numeroMovil = numeroMovil;
        this.nombreCliente = nombreCliente;
        this.segundosConsumidos = segundosConsumidos;
        this.precioSegundo = precioSegundo;
        contador++;
        acumulador += importePagar();
    }

    //segundo
    public Movil(int numeroMovil, String nombreCliente){
        this(numeroMovil, nombreCliente,75, 0.28);
    }

    //tercero
    public Movil(){
        this(987656789, "Juan");
    }

    //set

    public void setNumeroMovil(int numeroMovil) {
        this.numeroMovil = numeroMovil;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setSegundosConsumidos(int segundosConsumidos) {
        this.segundosConsumidos = segundosConsumidos;
    }

    public void setPrecioSegundo(double precioSegundo) {
        this.precioSegundo = precioSegundo;
    }

    //get

    public int getNumeroMovil() {
        return numeroMovil;
    }

    public String getNombreCliente(){
        return nombreCliente;
    }

    public int getSegundosConsumidos() {
        return segundosConsumidos;
    }

    public double getPrecioSegundo() {
        return precioSegundo;
    }

    //set y get para variables privadas de clase

    //set
    public static void setContador(int contador) {
        Movil.contador = contador;
    }

    public static void setAcumulador(double acumulador) {
        Movil.acumulador = acumulador;
    }

    //get

    public static int getContador() {
        return contador;
    }

    public static double getAcumulador() {
        return acumulador;
    }

    //metodos publicos
    public double costoConsumo(){
        return segundosConsumidos * precioSegundo;
    }

    public double impuestoIgv(){
        return costoConsumo() * IGV;
    }

    public double importePagar(){
        return costoConsumo() + impuestoIgv();
    }
}
