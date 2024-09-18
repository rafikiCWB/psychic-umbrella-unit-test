package br.com.testesunitarios.entity.junit;


import java.util.logging.Logger;

public class GerenciadorDeConexaoComBancoDeDados {

  private static final Logger LOG = Logger.getLogger(GerenciadorDeConexaoComBancoDeDados.class.getName());

  public static void iniciarConexao() {
    //Logic
    LOG.info("Iniciar conexão");
  }

  public static void finalizarConexao() {
    //Logic
    LOG.info("Finalizar conexão");
  }

  public static void insereDados(Pessoa pessoa) {
    //Logic
    LOG.info("Iniciar conexão");
  }

  public static void removeDados(Pessoa pessoa) {
    //Logic
    LOG.info("Iniciar conexão");
  }
}
