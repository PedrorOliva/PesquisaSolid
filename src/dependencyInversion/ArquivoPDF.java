package dependencyInversion;

public class ArquivoPDF implements Arquivo{
  @Override
  public void imprimirArquivo(String texto) {
    System.out.println("Imprimindo um PDF: " + texto);
  }
}
