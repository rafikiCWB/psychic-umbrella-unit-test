package br.com.testesunitarios.entity.junit;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class GerenciadorDeConexaoComBancoDeDadosTest {

  @BeforeAll
  static void configuraConexao() {
    GerenciadorDeConexaoComBancoDeDados.iniciarConexao();
  }

  @BeforeEach
  void inserirDadosParaTeste() {
    GerenciadorDeConexaoComBancoDeDados.insereDados(new Pessoa("Joe doe", LocalDateTime.of(2000, 1, 1, 21, 11, 1)));

  }

  @AfterEach
  void removeDadosDoTest() {
    GerenciadorDeConexaoComBancoDeDados.removeDados(new Pessoa("Joe doe", LocalDateTime.of(2000, 1, 1, 21, 11, 1)));
  }

  @Test
  void validarDadosDoRetorno() {
    assertTrue(true);
  }

  @Test
  void validarDadosDoRetorno2() {
    assertNull(null);
  }

  @AfterAll
  static void finalizarConexao() {
    GerenciadorDeConexaoComBancoDeDados.finalizarConexao();
  }
}
