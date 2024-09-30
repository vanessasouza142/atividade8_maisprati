/* Encapsulamento
2. Melhorando a Classe com Validação
Objetivo: Extenda a classe Produto para incluir um método aplicarDesconto(double porcentagem) que reduz o preço do produto.
Valide para garantir que o desconto não possa ser maior que 50%. Implemente a lógica que lança uma exceção se o desconto for inválido.
 */

public class Main {
  public static void main(String[] args) {
    try {
      // Criando um novo produto
      Produto produto = new Produto("Notebook", 2500.00, 10);

      // Exibindo informações do produto
      produto.exibirInformacoes();

      // Aplicando um desconto válido de 20%
      produto.aplicarDesconto(20);

      // Exibindo informações atualizadas
      produto.exibirInformacoes();

      // Tentando aplicar um desconto inválido de 60% (vai lançar exceção)
      produto.aplicarDesconto(60);
    } catch (DescontoInvalidoException e) {
      System.out.println(e.getMessage());
    }
  }
}