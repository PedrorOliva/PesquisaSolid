package interfaceSegregation;

public class Fiat implements Ignicao{
  private String modelo;
  private int ano;

  public Fiat(String modelo, int ano){
    this.modelo = modelo;
    this.ano = ano;
  }
  @Override
  public void ligar() {
    System.out.println("Carro: " + modelo + ", ano: " + ano);
    System.out.println("Ligando o carro!");
  }
}
