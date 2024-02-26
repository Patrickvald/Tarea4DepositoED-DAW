package cuentas;
/**
 * Clase para instanciar cuentas
 * @author Patrick Valdivia
 */
public class CCuenta {

    /**
     * Creación de atributos
     */

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
/**
 * Constructores de la clase CCuenta
 */
    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Encapsulado de los atributos vía getter/setter
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    /**
     * Método para obtener el estado de la cuenta
     * @return 
     */

    public double estado()
    {
        return saldo;
    }

    /**
     * Método para ingresar dinero en la cuenta
     * @param cantidad
     * @throws Exception si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    /**
     * Método para extraer dinero de la cuenta
     * @param cantidad
     * @throws Exception si la cantidad es negativa
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
