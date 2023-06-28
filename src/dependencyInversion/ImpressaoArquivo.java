package dependencyInversion;

public class ImpressaoArquivo {
  private Arquivo arquivo;

  public ImpressaoArquivo (Arquivo arquivo) {
    this.arquivo = arquivo;
  }

  public void imprimirArquivo(String texto){
  arquivo.imprimirArquivo(texto);
  }
}
