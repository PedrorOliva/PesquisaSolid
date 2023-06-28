package interfaceSegregation;

public class Ford implements Ignicao{

  private String modelo;
  private int ano;

  public Ford(String modelo, int ano){
    this.modelo = modelo;
    this.ano = ano;
  }
  @Override
  public void ligar() {
    System.out.println("Carro: " + modelo + ", ano: " + ano);
    System.out.println("Ligando o carro!");
  }
}
