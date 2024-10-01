class Boleto extends FormaPagamento {
  private String codigoBoleto;

  public Boleto(String codigoBoleto) {
    this.codigoBoleto = codigoBoleto;
  }

  @Override
  public void processarPagamento(double valor) {
    if (validarPagamento()) {
      System.out.println("Pagamento de R$" + valor + " processado com boleto.");
    } else {
      System.out.println("Falha na validação do boleto.");
    }
  }

  @Override
  public boolean validarPagamento() {
    return codigoBoleto.length() == 47;
  }
}