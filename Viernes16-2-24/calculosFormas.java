
/*

    // *** REVISAR LOS 2 PROGRAMAS ANTERIORES PARA QUE  USEN LA FORMA PEDIDA Y LIMPIAR IMPUREZAS ***
    // *** VER COMO SE ENTREGA EN REPOSITORIO DE GITHUB Y PONER EL LINK EN FORMULARIO DE ENTREGA ***
    // *** VER QUE ESTE COMPLETO INSTALADO EN LAS 3 COMPUS ***
    
 */


public interface calculosFormas
{
    void calcularArea();
    void calcularPerimetro();
// }

public class Circulo implements calculosFormas
{
    private double radio;
    private double areaCirculo;
    private double perimetroCirculo;
    static final double pi = 3.1415;

    public Circulo(double radio)
    {
        this.radio = radio;
    }

    public double getRadio()
    {
        return radio;
    }

    public void setRadio(double radio)
    {
        this.radio = radio;
    }

    public double getAreaCirculo()
    {
        return areaCirculo;
    }

    public double getPerimetroCirculo()
    {
        return perimetroCirculo;
    }

    @Override
    public void calcularArea()
    {
        areaCirculo= pi * radio * radio;
    }

    @Override
    public void calcularPerimetro()
    {
        perimetroCirculo = 2 * pi * radio;
    }

}

public class Rectangulo implements calculosFormas
{
    private double base;
    private double altura;
    private double areaRectangulo;
    private double perimetroRectangulo;

    public Rectangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    public double getBase()
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    public double getAreaRectangulo()
    {
        return areaRectangulo;
    }

        public double getPerimetroRectangulo()
    {
        return perimetroRectangulo;
    }


    @Override
    public void calcularArea()
    {
        areaRectangulo = base * altura;
    }


    @Override
    public void calcularPerimetro()
    {
        perimetroRectangulo =( base + altura) * 2;
    }

}

    public static void main(String[] args)
    {
        //probar clases cálculo áreas figuras geométricas

        Circulo circulo = new Circulo(200);
        circulo.calcularArea();
        System.out.println("Área del círculo de radio 200: " +
                circulo.getAreaCirculo());

        // Circulo circulo = new Circulo(200);
        circulo.calcularPerimetro();
        System.out.println("Perimetro del círculo de radio 200: " +
                circulo.getPerimetroCirculo());


        Rectangulo rectangulo = new Rectangulo(100, 20);
        rectangulo.calcularArea();
        System.out.println("Área del rectángulo de base 100 y altura 20: " +
                rectangulo.getAreaRectangulo());


        // Rectangulo rectangulo = new Rectangulo(100, 20);
        rectangulo.calcularPerimetro();
        System.out.println("Perimetro del rectángulo de base 100 y altura 20: " +
                rectangulo.getPerimetroRectangulo());

    }
}





