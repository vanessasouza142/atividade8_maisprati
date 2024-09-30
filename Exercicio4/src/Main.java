/* Herança
4. Sobrescrita de Métodos
Objetivo: Na classe Funcionario, crie um método trabalhar(), que imprime uma mensagem genérica sobre o trabalho realizado. Nas
subclasses Gerente e Desenvolvedor, sobrescreva esse método para especificar o tipo de trabalho realizado por cada um. Utilize a anotação
@Override e explore como ela ajuda a garantir que a sobrescrita foi feita corretamente.
 */

public class Main {
  public static void main(String[] args) {
    // Criando um Gerente
    Funcionario gerente = new Gerente("Carlos", 5000.00);
    gerente.exibirInformacoes();
    gerente.trabalhar();

    // Criando um Desenvolvedor
    Funcionario desenvolvedor = new Desenvolvedor("Ana", 4000.00);
    desenvolvedor.exibirInformacoes();
    desenvolvedor.trabalhar();
  }
}