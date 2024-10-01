import java.util.ArrayList;
import java.util.List;

class SistemaGestaoFuncionarios {
  private List<Funcionario> funcionarios = new ArrayList<>();

  public void adicionarFuncionario(Funcionario funcionario) {
    funcionarios.add(funcionario);
  }

  public void calcularFolhaPagamento() {
    double totalSalarios = 0;
    double totalBonus = 0;

    for (Funcionario funcionario : funcionarios) {
      double salario = funcionario.calcularSalario();
      double bonus = funcionario.calcularBonus();
      totalSalarios += salario;
      totalBonus += bonus;

      System.out.println("Funcionário: " + funcionario.getNome());
      System.out.println("Salário: R$" + salario);
      System.out.println("Bônus: R$" + bonus);
      System.out.println();
    }

    System.out.println("Total de salários pagos: R$" + totalSalarios);
    System.out.println("Total de bônus pagos: R$" + totalBonus);
  }

  public void promoverFuncionario(Funcionario funcionario) {
    if (funcionario instanceof Estagiario) {
      System.out.println("Promovendo estagiário para desenvolvedor.");
      funcionarios.remove(funcionario);
      funcionarios.add(new Desenvolvedor(funcionario.getNome(), funcionario.getSalarioBase()));
    } else if (funcionario instanceof Desenvolvedor) {
      System.out.println("Promovendo desenvolvedor para gerente.");
      funcionarios.remove(funcionario);
      funcionarios.add(new Gerente(funcionario.getNome(), funcionario.getSalarioBase()));
    } else {
      System.out.println("Funcionário já é gerente e não pode ser promovido.");
    }
  }
}
