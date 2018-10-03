public class InnerTest {
    public static void main(String[] args) {
        InnerStatic.Circulo.radio = 1.0;
        InnerStatic.Circulo.getArea();
        InnerStatic.Circulo.getLongitudCircunferencia();

        InnerStatic.Circulo.radio = 2.0;
        InnerStatic.Circulo.getArea();
        InnerStatic.Circulo.getLongitudCircunferencia();

        InnerStatic.Circulo.radio = 3.0;
        InnerStatic.Circulo.getArea();
        InnerStatic.Circulo.getLongitudCircunferencia();

        InnerStatic.Circulo.radio = 4.0;
        InnerStatic.Circulo.getArea();
        InnerStatic.Circulo.getLongitudCircunferencia();
    }
}
