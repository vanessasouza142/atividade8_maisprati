public class Funcionario {
  protected String nome;
  protected double salario;

  public Funcionario(String nome, double salario) {
    this.nome = nome;
    this.salario = salario;
  }

  public double calcularBonus() {
    return 0;
  }

  public void exibirInformacoes() {
    System.out.println("Nome: " + nome);
    System.out.println("Salário: R$" + salario);
    System.out.println("Bônus: R$" + calcularBonus());
  }
}
