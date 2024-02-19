import java.util.Scanner;

public class Cuenta {
    private int numeroCuenta;
    private long dni;
    private double saldo;
    private int interes;
    // private double ingreso;
    // private double retiro;


    public Cuenta() {
    }

    public Cuenta(long dni, int numeroCuenta, double saldo, int interes) {
        this.dni = dni;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }


    // long dni, int numeroCuenta, float saldo, int interes
    public void crearCuenta(){
        Scanner sc =  new Scanner(System.in);

        System.out.println("Ingrese un número de Cuenta (entero)");
        this.numeroCuenta  = sc.nextInt();

        System.out.println("Ingrese DNI (entero  largo)");
        this.dni  = sc.nextInt();

        System.out.println("Ingrese el Interés (entero)");
        this.interes  = sc.nextInt();

    }

    public void ingresar (double ingreso){
        this.saldo = this.saldo + ingreso;
    }

    public void retirar (double retiro){

        if (this.saldo - retiro >=0){
        this.saldo = this.saldo - retiro;
        }
        else{
            this.saldo =0;
        }
    }

    public void extraccionRapida(){
        if (this.saldo * 0.2 >= 0){
            this.saldo = this.saldo - this.saldo * 0.2;
        }
        else{
            this.saldo =0;
        }
    }


    public double consultarSaldo(){
        return this.saldo;
    }

    public void consultarDatos(){

        System.out.println("El número de cuenta es: " +  this.numeroCuenta);
        System.out.println("El DNI es: " +  this.dni);
        System.out.println("El Saldo es: " +  this.saldo);
        System.out.println("El Interés es: " +  this.interes);

    }


     public static void main(String[] args) {
        Cuenta cta = new Cuenta();
        double saldo = 0;

       // float suma,resta, multiplicacion, division;


        cta.crearCuenta();
        cta.ingresar(1000);
        cta.retirar(750);
        cta.extraccionRapida();
        saldo = cta.consultarSaldo();
        cta.consultarDatos();


    }



}
