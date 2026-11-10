package calculadora.guiCalculadora;

public class CalculadoraPrueba {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        Double resultado = cal.sumar(3.5, 6.5);
        double valor1,valor2;
        valor1=2;
        valor2=4;
        System.out.println("resultado = " + resultado);
        resultado = cal.Exponente(valor1, valor2);
        System.out.println("resultado = " + resultado);
    }
            
}
