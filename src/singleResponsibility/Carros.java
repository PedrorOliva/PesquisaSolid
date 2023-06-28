package singleResponsibility;

public class Carros {
  private String marca;
  private String modelo;
  private String ano;

  public void ligarCarro(Motor motor) {
    motor.ligarMotor();
  }
  public void acelerar(){
    System.out.println("Acelerando carro!");
  }

  public void frear(){
    System.out.println("Freando carro!");
  }
}
