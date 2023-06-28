package dependencyInversion;

public class Main {
  public static void main(String[] args) {
    Arquivo imprimiPDF = new ArquivoPDF();
    Arquivo imprimiDoc = new ArquivoDoc();

    ImpressaoArquivo geraPDF = new ImpressaoArquivo(imprimiPDF);
    geraPDF.imprimirArquivo("Um PDF");

    ImpressaoArquivo geraDoc = new ImpressaoArquivo(imprimiDoc);
    geraDoc.imprimirArquivo("Um .doc");
  }
}
