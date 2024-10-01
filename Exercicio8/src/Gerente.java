class Gerente extends Funcionario {
  public Gerente(String nome, double salarioBase) {
    super(nome, salarioBase);
  }

  @Override
  public double calcularSalario() {
    return getSalarioBase() * 2; // recebe o dobro do salário
  }

  @Override
  public double calcularBonus() {
    return getSalarioBase() * 0.2; // 20% de bônus
  }
}
