/* Encapsulamento
1. Criação de uma Classe Simples
Objetivo: Crie uma classe Produto que represente um produto de uma loja. A classe deve ter atributos privados nome, preco e quantidade em
estoque. Implemente métodos públicos para acessar e modificar esses atributos. Garanta que o preço e a quantidade não possam ser negativos.
*/

public class Main {
  public static void main(String[] args) {
    // Criando um novo produto
    Produto produto = new Produto("Notebook", 2500.00, 10);

    // Exibindo informações do produto
    produto.exibirInformacoes();

    // Alterando o preço e a quantidade em estoque
    produto.setPreco(2300.00);
    produto.setQuantidadeEmEstoque(8);

    // Exibindo informações atualizadas
    produto.exibirInformacoes();

    // Tentando definir um valor negativo (não permitido)
    produto.setPreco(-500);
    produto.setQuantidadeEmEstoque(-5);
  }
}