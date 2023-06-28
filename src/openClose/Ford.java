package openClose;

public class Ford extends Carro{

  public Ford(String modelo, String cor, int ano) {
    super(modelo, cor, ano);
  }

  @Override
  public void ligarCarro() {
    System.out.println("Ligando com o botão start...");
    System.out.println("Carro ligado!");
  }
}
