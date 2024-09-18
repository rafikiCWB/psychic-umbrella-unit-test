package br.com.testesunitarios.entity.junit;


import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTeste {

  @Test
  void validarValoresDeOperacoes() {
    //validar soma
    int resultado = 10;
    assertEquals(resultado, 5 + 5);
    //validar igualdade
    double number = 5.0;
    double otherNumber = 5.0;
    assertEquals(number, otherNumber);
  }

  @Test
  void validarSeArraysSaoIguais() {
    int[] primeiroArray = {10, 20, 30};
    int[] segundoArray = {10, 20, 30};
    assertArrayEquals(primeiroArray, segundoArray);

    boolean[] flags = {true, false, true, false};
    assertArrayEquals(new boolean[]{true, false, true, false}, flags);

    double[] valores = {10, 20, 10.5d, 50d};
    assertArrayEquals(new double[]{10, 20, 10.5d, 50d}, valores);
  }

  @Test
  void validarSeObjetoEstaNuloOuNao(){
    Pessoa pessoa = null;
    assertNull(pessoa);

    pessoa = new Pessoa("Rafael", LocalDateTime.now());
    assertNotNull(pessoa);
  }

  @Test
  void validarNumerosDeTiposDiferentes(){
    double valor = 5.0;
    double outroValor = 5.1;
    assertNotEquals(valor, outroValor);
  }

  @Test
  void validarQueAlgumaCondicaoEhFalsa() {
    boolean condicao = 5 + 6 == 12;
    assertFalse(condicao);
    System.out.println(condicao);
  }

  @Test
  void validarQueAlgumaCondicaoEhVerdadeira() {
    boolean condicao = 6 + 6 == 12;
    assertTrue(condicao);
    System.out.println(condicao);
  }
}
