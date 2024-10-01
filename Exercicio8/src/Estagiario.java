class Estagiario extends Funcionario {
  public Estagiario(String nome, double salarioBase) {
    super(nome, salarioBase);
  }

  @Override
  public double calcularSalario() {
    return getSalarioBase() * 0.5; // recebe metade do salário base
  }

  @Override
  public double calcularBonus() {
    return 0; // não recebe bônus
  }
}
