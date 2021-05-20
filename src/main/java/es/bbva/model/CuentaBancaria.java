package es.bbva.model;

public class CuentaBancaria {
    private String nombre;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;

    //Constructor por defecto
    public CuentaBancaria() {
    }

    //Constructor con parámetros
    public CuentaBancaria(String nombre, String numeroCuenta, double tipoInteres, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }


    //getters y setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroCuenta(String s) {
        numeroCuenta = s;
    }

    public void setTipoInteres(double n) {
        tipoInteres = n;
    }

    public void setSaldo(double n) {
        saldo = n;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    //método ingreso
    public boolean ingreso(double dineroIngresado) {
        boolean ingresoCorrecto = true;
        if (dineroIngresado < 0) {
            ingresoCorrecto = false;
        } else {
            saldo = saldo + dineroIngresado;
        }
        return ingresoCorrecto;
    }

    //método reintegro
    public boolean reintegro(double dineroConReintegro) {
        boolean reintegroCorrecto = true;
        if (dineroConReintegro < 0) {
            reintegroCorrecto = false;
        } else if (saldo >= dineroConReintegro) {
            saldo -= dineroConReintegro;
        } else {
            reintegroCorrecto = false;
        }
        return reintegroCorrecto;
    }

    //método transferencia
    public boolean transferencia(CuentaBancaria cuentaBancaria, double dineroTransferencia) {
        boolean correcto = true;
        if (dineroTransferencia < 0) {
            correcto = false;
        } else if (saldo >= dineroTransferencia) {
            reintegro(dineroTransferencia);//dry don't repeat yourself
            cuentaBancaria.ingreso(dineroTransferencia);
        } else {
            correcto = false;
        }
        return correcto;
    }
}
