package br.com.testesunitarios.entity.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransferenciaEntreContasTest {

  @Test
  void validarCenarioDeExcecaoNaTransferencia() {
    Conta contaOrigem = new Conta("123456", 0);
    Conta contaDestino = new Conta("456789", 100);

    var transferenciaEntreContas = new TransferenciaEntreContas();
    assertThrows(IllegalArgumentException.class, () -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 20));

    assertEquals(0, contaOrigem.getSaldo());
    assertEquals(100, contaDestino.getSaldo());
  }

  @Test
  void validarCenarioDeNaoExcecaoNaTransferencia() {
    Conta contaOrigem = new Conta("123456", 20);
    Conta contaDestino = new Conta("456789", 100);

    var transferenciaEntreContas = new TransferenciaEntreContas();
    assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 20));

    assertEquals(0, contaOrigem.getSaldo());
    assertEquals(120, contaDestino.getSaldo());
  }

  @Test
  void validarCenarioDeSucessoNaTransferencia() {
    Conta contaOrigem = new Conta("123456", 100);
    Conta contaDestino = new Conta("456789", 100);

    var transferenciaEntreContas = new TransferenciaEntreContas();
    transferenciaEntreContas.transfere(contaOrigem, contaDestino, 50);
    assertEquals(50, contaOrigem.getSaldo());
    assertEquals(150, contaDestino.getSaldo());
  }

}
