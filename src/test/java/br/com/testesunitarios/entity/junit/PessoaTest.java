package br.com.testesunitarios.entity.junit;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

  @Test
  void deveCalcularIdadeCorretamente() {
    Pessoa poliana = new Pessoa("poliana", LocalDateTime.of(2000, 1, 1, 15, 0, 1));
    assertEquals(24, poliana.getIdade());
  }

  @Test
  void deveRetornarSeEhMaiorDeIdade(){
    Pessoa poliana = new Pessoa("poliana", LocalDateTime.of(2000,1,1,15,0,0));
    assertTrue(poliana.ehMaiorDeIdade());

    Pessoa jackeline = new Pessoa("Jackeline", LocalDateTime.now());
    assertFalse(jackeline.ehMaiorDeIdade());
  }

  @Test
  void deveRetornarSeEhMenorDeIdade(){
    Pessoa poliana = new Pessoa("poliana", LocalDateTime.of(2010,1,1,15,0,0));
    assertFalse(poliana.ehMaiorDeIdade());
  }

  @Test
  void validaIgualdade() {
    Pessoa pessoa = new Pessoa("Pessoa 1", LocalDateTime.now());
    assertSame(pessoa, pessoa);
  }
}
