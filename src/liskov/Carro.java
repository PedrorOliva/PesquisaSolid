package liskov;

public abstract class Carro {
  private String modelo;
  private String cor;
  private int ano;

  public Carro(String modelo, String cor, int ano) {
    this.modelo = modelo;
    this.cor = cor;
    this.ano = ano;
  }

  public abstract void ligarCarro();
}