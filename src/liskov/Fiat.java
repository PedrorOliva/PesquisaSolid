package liskov;

public class Fiat extends Carro {
  private String acessorio;

  public Fiat(String modelo, String cor, int ano, String acessorio) {
    super(modelo, cor, ano);
    this.acessorio = acessorio;
  }

  @Override
  public void ligarCarro() {
    System.out.println("Girando a chave...");
    System.out.println("Carro ligado!");
  }
}
