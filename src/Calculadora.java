public class Calculadora {

    public Double sumar(Double num1, Double num2) {
        if (num1 == null || num2 == null) {

            return null;
        } else {
            return num1 + num2;
        }
    }

    public Double restar(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            return null;
        } else {
            return num1 - num2;
        }
    }

}
