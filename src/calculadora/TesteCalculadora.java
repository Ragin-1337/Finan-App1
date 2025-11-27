package calculadora;

/**
 * <p><strong>Classe de Testes: TesteCalculadora</strong></p>
 *
 * <p>Esta classe é responsável por executar testes simples e diretos
 * sobre a classe <code>Calculadora</code>, permitindo verificar
 * o funcionamento das operações matemáticas básicas e a validação
 * de operadores inválidos ou casos excepcionais.</p>
 *
 * <p>Os testes aqui presentes têm como objetivo:</p>
 * <ul>
 *     <li>Demonstrar o uso do método <code>calcular()</code></li>
 *     <li>Exemplificar o comportamento esperado para cada operação</li>
 *     <li>Validar o tratamento de erros, como divisão por zero</li>
 *     <li>Exibir resultados no console de forma clara e objetiva</li>
 * </ul>
 *
 * <p>Esta classe não faz parte da lógica principal da calculadora,
 * mas é útil para testes rápidos, verificação de comportamento e
 * apoio ao processo de revisão e aprendizado.</p>
 *
 * <p><strong>Observação:</strong> O foco destes testes é didático,
 * permitindo que o usuário visualize facilmente entradas, saídas
 * e erros gerados pelas operações.</p>
 *
 * @author Luis Gustavo
 * @version 1.0
 */


public class TesteCalculadora {

    public static void main(String[] args) {

        calculadora calc = new calculadora();

        // Testes rápidos
        System.out.println("Resultado: " + calc.calcular(2, 3, "+")  + "  // esperado: 5");
        System.out.println("Resultado: " + calc.calcular(10, 4, "-") + "  // esperado: 6");
        System.out.println("Resultado: " + calc.calcular(3, 5, "*")  + "  // esperado: 15");
        System.out.println("Resultado: " + calc.calcular(8, 2, "/")  + "  // esperado: 4");

        // Casos que geram erro, mantendo o estilo simples
        try {
            calc.calcular(8, 0, "/"); // divisão por zero
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            calc.calcular(5, 5, "x"); // operação inválida
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
