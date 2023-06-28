package singleResponsibility;

public class Main {
  public static void main(String[] args) {
    Carros carro = new Carros();
    Motor motor = new Motor();

    carro.ligarCarro(motor);
    carro.acelerar();
    carro.frear();
  }
}
