package interfaceSegregation;

public class Main {
  public static void main(String[] args) {
    Ignicao fiat = new Fiat("Uno", 1992);
    fiat.ligar();

    Ignicao ford = new Ford("Ká", 2000);
    ford.ligar();
  }
}
