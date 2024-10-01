/* Abstração
8. Sistema de Gestão de Funcionários
Objetivo: Crie um sistema que gerencie diferentes tipos de funcionários (Gerente, Desenvolvedor, Estagiario). Cada tipo de funcionário deve ter
uma maneira diferente de calcular o salário e o bônus. Utilize uma combinação de herança, polimorfismo e encapsulamento para estruturar
as classes. Implemente um método calcularFolhaPagamento que itera sobre todos os funcionários e calcula o total de salários e bônus. Adicione
novas funcionalidades, como a possibilidade de promover um funcionário, o que altera seu tipo e os cálculos de salário e bônus.
 */

public class Main {
  public static void main(String[] args) {
    SistemaGestaoFuncionarios sistema = new SistemaGestaoFuncionarios();

    Funcionario gerente = new Gerente("Carlos", 5000);
    Funcionario desenvolvedor = new Desenvolvedor("Ana", 3000);
    Funcionario estagiario = new Estagiario("João", 1500);

    // Adicionando funcionários ao sistema
    sistema.adicionarFuncionario(gerente);
    sistema.adicionarFuncionario(desenvolvedor);
    sistema.adicionarFuncionario(estagiario);

    // Calculando folha de pagamento
    sistema.calcularFolhaPagamento();

    // Promovendo funcionários
    System.out.println("== Promovendo João (Estagiário) ==");
    sistema.promoverFuncionario(estagiario);

    // Recalculando folha de pagamento após promoção
    sistema.calcularFolhaPagamento();
  }
}