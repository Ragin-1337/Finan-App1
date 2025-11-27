package calculadora;


public class TesteCalculadora {

    public static void main(String[] args) {
        calculadora calc = new calculadora();

        // Testes rápidos
        calc.calc( 2,  3,  "+");    // esperado: 5
        calc.calc( 10,  4,  "-");   // esperado: 6
        calc.calc( 3,  5,  "*");    // esperado: 15
        calc.calc( 8,  2,  "/");    // esperado: 4
        calc.calc( 8,  0,  "/");    // divisao por zero
        calc.calc( 5, 5,  "x");    // operacao inválida
    }
}
