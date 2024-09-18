package br.com.testesunitarios.entity.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoAOrdemTeste {

  @DisplayName("Teste que válida se o usuário foi criado")
  @Test
  void validaFluxoA() {
    assertTrue(true);
  }

  @DisplayName("B")
  @Test
  void validaFluxoB() {
    assertTrue(true);
  }

  @DisplayName("C")
  @Test
  void validaFluxoC() {
    assertTrue(true);
  }

  @DisplayName("D")
  @Test
  void validaFluxoD() {
    assertTrue(true);
  }
}
