/* Abstração
7. Abstração em um Sistema de Pagamentos
Objetivo: Crie uma classe abstrata FormaPagamento com métodos abstratos processarPagamento(double valor) e validarPagamento().
Crie classes concretas CartaoCredito, Boleto e Pix que herdam de FormaPagamento e implementam os métodos abstratos. Adicione lógica de
validação específica para cada forma de pagamento e simule um sistema que utilize diferentes formas de pagamento.
 */

public class Main {
  public static void main(String[] args) {

    FormaPagamento pagamento1 = new CartaoCredito("1234567812345678");
    pagamento1.processarPagamento(250.00);

    FormaPagamento pagamento2 = new Boleto("12345678901234567890123456789012345678901234567");
    pagamento2.processarPagamento(100.00);

    FormaPagamento pagamento3 = new Pix("minhachavepix@exemplo.com");
    pagamento3.processarPagamento(75.50);
  }
}