import java.util.Scanner;

// Creación de la clase
public class Operacion {
    // Declaración de variables de clase
    private float numero1;
    private float numero2;

    // Constructor completo
    public Operacion(float num1, float num2){
        this.numero1 = num1;
        this.numero2 = num2;
    };

    // Constructor vacío
    public Operacion(){};

    // Getters y Setters
    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float num1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float num2) {
        this.numero2 = numero2;
    }

    //Función Crear Operación
    public void crearOperacion(){
        Scanner sc =  new Scanner(System.in);

        System.out.println("Ingrese un número entero");
        this.numero1  = sc.nextInt();

        System.out.println("Ingrese otro número entero");
        this.numero2 = sc.nextInt();

        //Operacion op = new Operacion();

        //op.setNumero1(num1);
        // this.numero1 = num1;

        //op.setNumero2(num2);
        // this.numero2 = num2;

        //return op;

    }


    //Función Sumar
    public float sumar ( float numero1, float numero2){

        return (numero1 + numero2) ;

    }

    //Función Restar
    public float restar ( float numero1, float numero2){

        return (numero1 - numero2) ;

    }

    //Función Multiplicar
    public float multiplicar ( float numero1, float numero2){
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Multiplicación por cero");
            return (0);
        }
        else {
            return (numero1 * numero2);
        }
    }

    //Función Dividir
    public float dividir ( float numero1, float numero2){
        if ( numero2 == 0) {
            System.out.println("Error: División por cero. El resultado de la división es indefinido. (No es 0.0)");
            return (0);
            }
        else{
                return (numero1 / numero2);
        }
    }


    public static void main(String[] args) {
        Operacion op = new Operacion();
        float suma,resta, multiplicacion, division;
        op.crearOperacion();
        suma = op.sumar(op.getNumero1(), op.getNumero2());
        resta = op.restar(op.getNumero1(), op.getNumero2());
        multiplicacion = op.multiplicar(op.getNumero1(), op.getNumero2());
        division = op.dividir(op.getNumero1(), op.getNumero2());

        System.out.println("La suma de los números es: " + suma);
        System.out.println("La resta de los números es: " + resta);
        System.out.println("La multiplicación de los números es: " + multiplicacion);
        System.out.println("La división de los números es: " + division + " (El resultado 0.0 no es válido si hubo división por cero)") ;

        System.out.println("***  FIN DEL PROGRAMA  ***");
    }


}
