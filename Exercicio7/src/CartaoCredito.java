class CartaoCredito extends FormaPagamento {
  private String numeroCartao;

  public CartaoCredito(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  @Override
  public void processarPagamento(double valor) {
    if (validarPagamento()) {
      System.out.println("Pagamento de R$" + valor + " processado com cartão de crédito.");
    } else {
      System.out.println("Falha na validação do cartão de crédito.");
    }
  }

  @Override
  public boolean validarPagamento() {
    return numeroCartao.length() == 16;
  }
}
