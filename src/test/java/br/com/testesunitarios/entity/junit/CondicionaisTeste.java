package br.com.testesunitarios.entity.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.JRE;

public class CondicionaisTeste {

  @Test
  @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_23)
  void validarAlgoSomenteNoUsuarioWillyan(){
    Assertions.assertEquals(10,5+5);
  }
}
