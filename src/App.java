import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a nuestra calculadora");
        Calculadora cal = new Calculadora();

        Double primero = Double.parseDouble(JOptionPane.showInputDialog("Insserte el primer numero"));
        Double segundo = Double.parseDouble(JOptionPane.showInputDialog("Insserte el segundo numero"));
        Double resultado = cal.sumar(primero, segundo);

        JOptionPane.showMessageDialog(null,
                "El resultado de la suma de " + primero + " + " + segundo + " = " + resultado);
    }
}
