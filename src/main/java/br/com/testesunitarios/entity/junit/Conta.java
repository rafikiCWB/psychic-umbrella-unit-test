package br.com.testesunitarios.entity.junit;

public class Conta {
  private String numeroConta;
  private int saldo;

  public Conta() {
  }

  public Conta(String numeroConta, int saldo) {
    this.numeroConta = numeroConta;
    this.saldo = saldo;
  }

  public String getNumeroConta() {
    return numeroConta;
  }

  public int getSaldo() {
    return saldo;
  }

  public void lancaCredito(int valor) {
    if (valor <= 0) {
      throw new IllegalArgumentException("O valor do crédito deve ser maior que zero");
    }
    this.saldo += valor;
  }

  public void lancaDebito(int valor) {
    if (valor <= 0) {
      throw new IllegalArgumentException("O valor do débito deve ser maior que zero");
    }
    if (getSaldo() < valor) {
      throw new IllegalArgumentException("Saldo insuficiente!!");
    }
    this.saldo -= valor;
  }

  @Override
  public String toString() {
    return "Conta{" +
        "numeroConta='" + numeroConta + '\'' +
        ", saldo=" + saldo +
        '}';
  }

  public static void main(String[] args) {
    var contaOrigem = new Conta("123456", 100);
    var contaDestino = new Conta("456789", 100);

    var transferenciaEntreContas = new TransferenciaEntreContas();
    System.out.println("Antes da transferência:");
    System.out.println(contaOrigem);
    System.out.println(contaDestino);

    try {
      transferenciaEntreContas.transfere(contaOrigem, contaDestino, 101);
      System.out.println("Após a transferência:");
    System.out.println(contaOrigem);
    System.out.println(contaDestino);
    } catch (IllegalArgumentException e) {
      System.err.println("Erro na transferência: " + e.getMessage());
    }
  }
}
