package br.com.testesunitarios.entity.junit;

public class TransferenciaEntreContas {
  public void transfere(Conta contaOrigem, Conta contaDestino, int valor) {
    if (valor <=0) {
      throw new IllegalArgumentException("Valor deve ser maior que zero");
    }
    contaOrigem.lancaDebito(valor);
    contaDestino.lancaCredito(valor);
  }
}
