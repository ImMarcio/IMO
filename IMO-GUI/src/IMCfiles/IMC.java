package IMCfiles;
public class IMC {
    private double altura;
    private double peso;
    
    public IMC(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }
    
    public double calcularIMC() {
        double alturaQuadrado = altura * altura;
        return peso / alturaQuadrado;
    }
    
    public String getStatus() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}
