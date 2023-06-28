package openClose;

public class Main {
  public static void main(String[] args) {
    Carro fiat = new Fiat("Pálio", "Cinza", 2002, "Direção hidráulica");
    Carro ford = new Ford("Fusion", "Preto", 2023);

    fiat.ligarCarro();
    ford.ligarCarro();
  }
}
