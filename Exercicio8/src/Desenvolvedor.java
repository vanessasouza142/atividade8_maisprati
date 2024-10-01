class Desenvolvedor extends Funcionario {
  public Desenvolvedor(String nome, double salarioBase) {
    super(nome, salarioBase);
  }

  @Override
  public double calcularSalario() {
    return getSalarioBase(); // recebe o salário base
  }

  @Override
  public double calcularBonus() {
    return getSalarioBase() * 0.1; // 10% de bônus
  }
}