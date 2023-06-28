package singleResponsibility;

public class Motor {
  private String modelo;
  private int potencia;


  public void ligarMotor(){
    System.out.println("motor ligado");
  }

  public void desligarMotor(){
    System.out.println("motor desligado");
  }
}
