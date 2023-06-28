package liskov;

public class Main {
  public static void main(String[] args) {
    LigandoCarro ligar = new LigandoCarro();

    Carro fiat = new Fiat("Pálio", "Cinza", 2002, "Direção hidráulica");
    ligar.ligarCarro(fiat);

    Carro ford = new Ford("Fusion", "Preto", 2023);
    ligar.ligarCarro(ford);
  }
}
