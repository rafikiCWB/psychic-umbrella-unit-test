package br.com.testesunitarios.entity.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

  @Test
  void deveValidarSaldo() {
    Conta conta = new Conta("123456", 100);
    assertNotNull(conta);
    conta.lancaCredito(50);
    assertEquals(150, conta.getSaldo());
    conta.lancaDebito(50);
    assertEquals(100, conta.getSaldo());
    assertNotEquals(101, conta.getSaldo());

    conta = null;
    assertNull(conta);
  }

  @Test
  void getSaldo() {
  }

  @Test
  void lancaCredito() {
  }

  @Test
  void lancaDebito() {
  }
}
