package geometrica;

public class CalculadoraDeArea {
    
    private String forma;
    private double altura;
    private double base;

    public CalculadoraDeArea(String forma, double altura, double base) {
        this.forma = forma;
        this.altura = altura;
        this.base = base;
    }

    public double calcularArea() {
        if (forma.equals("Triângulo")) {
            return (base * altura) / 2;
            
        } else if (forma.equals("Retângulo")) {
            return base * altura;
            
        } else if (forma.equals("Quadrado")) {
            return base * base;
            
        } else {
            return 0;
        }
    }
}
