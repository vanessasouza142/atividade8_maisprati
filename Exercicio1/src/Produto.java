public class Produto {
  private String nome;
  private double preco;
  private int quantidadeEmEstoque;

  public Produto(String nome, double preco, int quantidadeEmEstoque) {
    this.nome = nome;
    setPreco(preco);
    setQuantidadeEmEstoque(quantidadeEmEstoque);
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }

  public int getQuantidadeEmEstoque() {
    return quantidadeEmEstoque;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setPreco(double preco) {
    if (preco >= 0) {
      this.preco = preco;
    } else {
      System.out.println("Preço não pode ser negativo.");
    }
  }

  public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
    if (quantidadeEmEstoque >= 0) {
      this.quantidadeEmEstoque = quantidadeEmEstoque;
    } else {
      System.out.println("Quantidade em estoque não pode ser negativa.");
    }
  }

  public void exibirInformacoes() {
    System.out.println("Nome: " + nome);
    System.out.println("Preço: R$" + preco);
    System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
  }
}
