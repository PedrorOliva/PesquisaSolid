package dependencyInversion;

public class ArquivoDoc implements Arquivo{
  @Override
  public void imprimirArquivo(String texto) {
    System.out.println("Imprimindo um .doc: " + texto);
  }
}
