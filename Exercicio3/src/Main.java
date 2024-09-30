/* Herança
3. Criação de uma Hierarquia de Classes
Objetivo: Crie uma classe Funcionario com atributos nome e salario. Em seguida, crie duas subclasses: Gerente e Desenvolvedor. Adicione um
método calcularBonus que retorna um valor diferente para cada tipo de funcionário (por exemplo, 20% do salário para Gerente e 10% para
Desenvolvedor). Utilize protected para permitir que as subclasses acessem os atributos da classe base de forma segura.

 */

public class Main {
  public static void main(String[] args) {
    // Criando um Gerente
    Funcionario gerente = new Gerente("Carlos", 5000.00);
    gerente.exibirInformacoes();

    // Criando um Desenvolvedor
    Funcionario desenvolvedor = new Desenvolvedor("Ana", 4000.00);
    desenvolvedor.exibirInformacoes();
  }
}