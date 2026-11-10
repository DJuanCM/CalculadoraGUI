package calculadora.guiCalculadora;

public class Calculadora {

    public double sumar(Double valor1, Double valor2) {
        return valor1 + valor2;
    }

    public double restar(Double valor1, Double valor2) {
        return valor1 - valor2;
    }

    public double dividir(Double valor1, Double valor2) {
        if (valor1.equals(0)) {
            return 0;
        } else {

            return valor1 / valor2;
        }
    }

    public double multiplicar(Double valor1, Double valor2) {
        return valor1 * valor2;
    }

    public double raiz(Double valor) {
        return Math.sqrt(valor);
    }

    public Double Exponente(Double valor1, Double valor2) {
        double resultado = 1;

        for (int i = 0; i < valor2; i++) {
            resultado = resultado * valor1;
        }

        return resultado;
    }

    public double FCelcius(Double valor) {
        double resultado = (valor - 32) * 5 / 9;
        return resultado;
    }

    public double CFarin(Double valor) {
        double resultado = (36 * 9 / 5) + 32;
        return resultado;
    }
}
